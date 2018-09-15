package com.rdc.kingsa.model.dto.terra;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("土地二级分类统计-保存")
public class LandSecondaryStatisticsView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("水电站ID")
	@NotNull(message = "水电站ID不能为空")
	private String sectionId;

	@ApiModelProperty("水电站名称")
	@NotNull(message = "水电站名称不能为空")
	@Length(max = 25, message = "水电站名称长度不能超过{max}")
	private String sectionName;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("二级分类ID")
	@NotNull(message = "二级分类ID不能为空")
	private String secondaryId;

	@ApiModelProperty("二级分类编号")
	@NotNull(message = "二级分类编号不能为空")
	@Length(max = 12, message = "二级分类编号长度不能超过{max}")
	private String secondaryIdentifier;

	@ApiModelProperty("二级分类名称")
	@NotNull(message = "二级分类名称不能为空")
	@Length(max = 25, message = "二级分类名称长度不能超过{max}")
	private String secondaryName;

	@ApiModelProperty("面积（km2）")
	@NotNull(message = "面积（km2）不能为空")
	@Range(min = 0, max = 99999, message = "面积必须在{min}与{max}之间")
	private Double areaCovered;

	@ApiModelProperty("百分比")
	@Range(min = 0, max = 100, message = "百分比必须在{min}与{max}之间")
	private Double percentage;

	@ApiModelProperty("备注信息")
	@Length(max = 25, message = "备注信息长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public String getSecondaryId() {
		return secondaryId;
	}

	public void setSecondaryId(String secondaryId) {
		this.secondaryId = secondaryId;
	}

	public String getSecondaryIdentifier() {
		return secondaryIdentifier;
	}

	public void setSecondaryIdentifier(String secondaryIdentifier) {
		this.secondaryIdentifier = secondaryIdentifier;
	}

	public String getSecondaryName() {
		return secondaryName;
	}

	public void setSecondaryName(String secondaryName) {
		this.secondaryName = secondaryName;
	}

	public Double getAreaCovered() {
		return areaCovered;
	}

	public void setAreaCovered(Double areaCovered) {
		this.areaCovered = areaCovered;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}