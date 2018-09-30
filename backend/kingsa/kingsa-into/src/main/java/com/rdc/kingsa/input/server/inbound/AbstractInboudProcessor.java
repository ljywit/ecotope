package com.rdc.kingsa.input.server.inbound;

import com.base.utils.DateUtils;
import com.base.utils.ListUtil;
import com.base.utils.ObjectUtil;
import com.base.utils.StringUtil;
import com.rdc.kingsa.input.server.inbound.model.FieldDefine;
import com.rdc.kingsa.input.server.inbound.model.TemplateDefine;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class AbstractInboudProcessor {

	private static Logger logger = LoggerFactory.getLogger(AbstractInboudProcessor.class);

	/**
	 * 详细记录
	 */
	protected List<Map> lstJobMap = new ArrayList<>();

	/**
	 * 错误信息
	 */
	protected List<String> lstErrorMsg = new ArrayList<>();

    /**
	 * 模板定义
	 */
	protected TemplateDefine template = TemplateHelper.parseTemplate(getTemplatePath());

	/**
	 * 第几行记录
     */
	protected int positiveIndex = -1;

	protected Sheet sheet;

	protected boolean importFromStream(InputStream inputStream) {

		checkFormat(inputStream);

		if (isValid()) {
			// 解析header
			handleHeaderInfo();
		}
		if (isValid()) {
			// 解析Title
			checkTitle();
		}
		if (isValid()) {
			// 解析记录
			handleBody();
		}
		for (String error : lstErrorMsg) {
			logger.debug(error);
		}
		logger.debug("总共解析了" + lstJobMap.size() + "条数据！");
		return isValid();
	}

	private void checkFormat(InputStream inputStream) {
		try {
			Workbook wb = Workbook.getWorkbook(inputStream);
			sheet = wb.getSheet(getSheetName());
			if (sheet == null) {
				lstErrorMsg.add("文件类型错误或sheet名称不对");
			}
		} catch (IOException e) {
			lstErrorMsg.add("文件类型错误或sheet名称不对");
		} catch (BiffException e) {
			lstErrorMsg.add("文件类型错误或sheet名称不对");
		} catch (Exception e) {
			lstErrorMsg.add("文件类型错误或sheet名称不对");
		}
	}

	private boolean isValid() {
		return ListUtil.isEmpty(lstErrorMsg);
	}

	protected abstract String getTemplatePath();

	/**
	 * 处理头信息
	 */
	protected void handleHeaderInfo() {
		// 暂时留空
	}

	private void checkTitle() {
		List<FieldDefine> fields = template.getFields().getFields();
		int rowOffset = getHeaderRowNum();
		int colOffset = getHeaderColNum();
		fields.stream().filter(x -> x.isCheckLabel()).forEach(x -> {
			String label = x.getLabel();
			String cellStr = sheet.getCell(rowOffset + x.getRow(), colOffset + x.getCol()).getContents();
			if (!ObjectUtil.areEqual(label, cellStr)) {
				lstErrorMsg.add("导入的格式不对，列名不准确，应为：" + label + ", 实际为" + cellStr);
			}
		});
	}

	protected void handleBody() {
		// previous current
		Cell[] previousCells = null;
		Cell[] currentCells = readRecord(++positiveIndex);
		// 一行或一列读取，判断是否结束
		while (!isEOF(previousCells, currentCells)) {
			// 是否跳过该行
			if (!skip(currentCells)) {
				// 处理当行数据
				Map<String, Object> jobMap = handleSingle(currentCells);
				if (isValid()) {
					lstJobMap.add(jobMap);
				} else {
					break;
				}
			}
			previousCells = currentCells;
			currentCells = readRecord(++positiveIndex);
		}

	}

	protected Cell[] readRecord(int i) {
		if (isFromUp2Down()) {
			return sheet.getRow(getHeaderRowNum() + getTitleRowNum() + i);
		} else {
			return sheet.getColumn(getHeaderColNum() + getTitleRowNum() + i);
		}
	}

	protected String readCell(Cell[] cells, int i) {
		int offset = isFromUp2Down() ? getHeaderColNum() : getHeaderRowNum();
		Cell currentCell = cells[offset + i];
		return currentCell.getContents();
	}

	protected Map<String, Object> handleSingle(Cell[] cells) {
		Map<String, Object> jobMap = new HashedMap();
		for (FieldDefine field : template.getFields().getFields()) {
			int offset = isFromUp2Down() ? field.getCol() : field.getRow();
			int absoluteRow = (isFromUp2Down() ? getHeaderRowNum() : getHeaderColNum()) + getTitleRowNum() + positiveIndex;
			int absoluteCol = (isFromUp2Down() ? getHeaderColNum() : getHeaderRowNum()) + offset;
			String cellStr = readCell(cells, offset);
			Object cellValue = cellStr;
			boolean valid = true;
			if (field.isMandatory() && StringUtil.isBlank(cellStr)) {
				valid = false;
				lstErrorMsg.add("第" + absoluteRow + "行, 第" + absoluteCol + "列的‘" + field.getLabel() + "’不能为空!");
			} else if (StringUtil.isBlank(cellStr)) {
				//default value
				continue;
			}
			if (valid) {
				String type = field.getType();
				try {
					if ("java.lang.Integer".equals(type)) {
						cellValue = Integer.valueOf(cellStr);
					} else if ("java.lang.Long".equals(type)) {
						cellValue = Long.valueOf(cellStr);
					} else if ("java.lang.Double".equals(type)) {
						cellValue = Double.valueOf(cellStr);
					} else if ("java.util.Date".equals(type)) {
						String format = StringUtil.isNotEmpty(field.getFormat()) ? field.getFormat() : DateUtils.YYYY_MM_DD;
						cellValue = DateUtils.string2Date(cellStr, format);
					}
					jobMap.put(field.getName(), cellValue);
				} catch (Exception e) {
					lstErrorMsg.add("第" + absoluteRow + "行, 第" + absoluteCol + "列‘" + field.getLabel() + "’的格式不对!");
					continue;
				}
			}
			String mappingType = field.getMappingType();
			String mappingCode = field.getMappingCode();
			String mappingField = field.getMappingFieldName();
			if (MappingHandler.SECTION_TYPE.equals(mappingType)) {
				String sectionId = MappingHandler.getSectionId(cellStr, mappingCode);
				if (field.isMandatory() && StringUtil.isBlank(sectionId)) {
					lstErrorMsg.add("第" + absoluteRow + "行, 第" + absoluteCol + "列的断面‘" + cellStr + "’不存在!");
				} else {
					if (StringUtil.isNotEmpty(mappingField)) {
						jobMap.put(mappingField, sectionId);
					} else {
						jobMap.put(field.getName(), sectionId);
					}
				}
			}
		}
		return jobMap;
	}

	/**
	 * excel中的记录是否从上往下读取 水温是false，比较特列
	 *
	 * @return true 从上往下，false，从做往右
	 */
	protected boolean isFromUp2Down() {
		return template.getHeader().isFromUp2Down();
	}

	/**
	 * sheet名称
	 *
	 * @return String
	 */
	protected String getSheetName() {
		return template.getHeader().getSheetName();
	}

	/**
	 * 获取表头的行数
	 *
	 * @return
	 */
	protected int getHeaderRowNum() {
		return template.getHeader().getHeaderRowNum();
	}

	/**
	 * 获取表头的行数
	 *
	 * @return
	 */
	protected int getHeaderColNum() {
		return template.getHeader().getHeaderColNum();
	}

	/**
	 * 获取title的行数，如果是从上往下则是行，如果从左往右，则是列
	 *
	 * @return
	 */
	protected int getTitleRowNum() {
		return template.getHeader().getTitleRowNum();
	}

	/**
	 * 判断是否结束解析
	 *
	 * @param previous
	 * @param current
	 * @return
	 */
	protected boolean isEOF(Cell[] previous, Cell[] current) {
		return StringUtil.isBlank(readCell(current, 0));
	}

	/**
	 * 判断是否跳过当前行
	 *
	 * @param current
	 * @return
	 */
	protected boolean skip(Cell[] current) {
		return false;
	}
}
