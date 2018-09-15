package com.rdc.kingsa.model.dto.water.gas;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rdc.kingsa.constants.RegexString;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName:GSComprehensiveQueryView
 * @Description:综合查询信息包装
 * @Author:Shelly Chan
 * @CreateTime:2018年5月14日上午10:23:59
 */
@ApiModel("气体过饱和综合查询信息参数")
public class GSComprehensiveQueryView {

	@ApiModelProperty("断面id")
	@NotNull(message = "断面id不能为空")
	private String[] sectionIds;

	@ApiModelProperty("开始时间")
	@NotNull(message = "开始时间不能为空")
	@Pattern(regexp = RegexString.MONTH_REGEX)
	private String startTime;

	@ApiModelProperty("结束时间")
	@Pattern(regexp = RegexString.MONTH_REGEX)
	private String endTime;

	@ApiModelProperty("测线")
	@NotNull(message = "测线信息不能为空")
	private String[] measureLines;

	@ApiModelProperty("水深")
	@NotNull(message = "水深不能为空")
	private Double[] depths;

	@ApiModelProperty("条件语句")
	private String conditions;

	@ApiModelProperty("页数")
	private int pages;

	@ApiModelProperty("行数")
	private int rows;

	public String[] getSectionIds() {
		return sectionIds;
	}

	public void setSectionIds(String[] sectionIds) {
		this.sectionIds = sectionIds;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String[] getMeasureLines() {
		return measureLines;
	}

	public void setMeasureLines(String[] measureLines) {
		this.measureLines = measureLines;
	}

	public Double[] getDepths() {
		return depths;
	}

	public void setDepths(Double[] depths) {
		this.depths = depths;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

}