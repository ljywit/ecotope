package com.rdc.kingsa.model.dto.water.quality;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rdc.kingsa.constants.RegexString;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName:ComprehensiveQueryView
 * @Description:综合查询信息包装
 * @Author:Shelly Chan
 * @CreateTime:2018年5月8日上午11:19:03
 */
@ApiModel("水质综合查询信息参数")
public class WQComprehensiveQueryView {

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

	@ApiModelProperty("评价类型")
	@NotNull(message = "评价类型不能为空")
	private Short[] types;

	@ApiModelProperty("条件语句")
	private String conditions;

	@ApiModelProperty("页数")
	private int pages;

	@ApiModelProperty("行数")
	private int rows;

	public WQComprehensiveQueryView() {

	}

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

	public Short[] getTypes() {
		return types;
	}

	public void setTypes(Short[] types) {
		this.types = types;
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