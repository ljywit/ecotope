package com.rdc.kingsa.model.dto.section;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("水质断面-保存")
public class SectionWaterQualityView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面基本信息主键")
	private String sectionId;

	@ApiModelProperty("断面名称")
	@NotNull(message = "断面名称不能为空")
	// @Length(min = 0, max = 12, message = "断面名称不能超过{max}")
	private String sectionName;

	@ApiModelProperty("序号")
	@NotNull(message = "序号不能为空")
	@Range(min = 0, max = 999, message = "序号必须在{min}与{max}之间")
	private Short serialNum;

	@ApiModelProperty("水域类型")
	@NotNull(message = "水域类型不能为空")
	@Range(min = 0, max = 999, message = "水域类型必须在{min}与{max}之间")
	private Short riverType;

	@ApiModelProperty("是否是排污口")
	@NotNull(message = "是否是排污口不能为空")
	@Range(min = 0, max = 1, message = "是否是排污口必须在{min}与{max}之间")
	private Short drainOutlet;

	@ApiModelProperty("断面位置")
	@NotNull(message = "断面位置不能为空")
	// @Length(min = 0, max = 25, message = "断面位置不能超过{max}")
	private String location;

	@ApiModelProperty("所在河流")
	@NotNull(message = "所在河流不能为空")
	// @Length(min = 0, max = 12, message = "所在河流不能超过{max}")
	private String belongRiver;

	@ApiModelProperty("经度")
	@NotNull(message = "经度不能为空")
	@Range(min = 0, max = 999, message = "经度必须在{min}与{max}之间")
	private Double longitude;

	@ApiModelProperty("纬度")
	@NotNull(message = "纬度不能为空")
	@Range(min = 0, max = 999, message = "纬度必须在{min}与{max}之间")
	private Double latitude;

	@ApiModelProperty("监测内容")
	@NotNull(message = "监测内容不能为空")
	// @Length(min = 0, max = 12, message = "监测内容不能超过{max}")
	private String monitorContent;

	@ApiModelProperty("监测频率")
	@NotNull(message = "监测频率不能为空")
	// @Length(min = 0, max = 12, message = "监测频率不能超过{max}")
	private String monitorFrequency;

	@ApiModelProperty("水质规划类别")
	@NotNull(message = "水质规划类别不能为空")
	// @Length(min = 0, max = 12, message = "水质规划类别不能超过{max}")
	private String qaPlanCate;

	@ApiModelProperty("采样垂线（点）")
	@NotNull(message = "采样垂线（点）不能为空")
	// @Length(min = 0, max = 12, message = "采样垂线（点）不能超过{max}")
	private String samp;

	@ApiModelProperty("与规范符合性")
	@NotNull(message = "与规范符合性不能为空")
	// @Length(min = 0, max = 12, message = "与规范符合性不能超过{max}")
	private String conformance;

	@ApiModelProperty("距乌东德里程")
	@NotNull(message = "距乌东德里程不能为空")
	@Range(min = -99999, max = 99999, message = "距乌东德里程必须在{min}与{max}之间")
	private Double fromWdd;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 180, message = "备注信息不能超过{max}")
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

	public Short getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(Short serialNum) {
		this.serialNum = serialNum;
	}

	public Short getRiverType() {
		return riverType;
	}

	public void setRiverType(Short riverType) {
		this.riverType = riverType;
	}

	public Short getDrainOutlet() {
		return drainOutlet;
	}

	public void setDrainOutlet(Short drainOutlet) {
		this.drainOutlet = drainOutlet;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBelongRiver() {
		return belongRiver;
	}

	public void setBelongRiver(String belongRiver) {
		this.belongRiver = belongRiver;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getMonitorContent() {
		return monitorContent;
	}

	public void setMonitorContent(String monitorContent) {
		this.monitorContent = monitorContent;
	}

	public String getMonitorFrequency() {
		return monitorFrequency;
	}

	public void setMonitorFrequency(String monitorFrequency) {
		this.monitorFrequency = monitorFrequency;
	}

	public String getQaPlanCate() {
		return qaPlanCate;
	}

	public void setQaPlanCate(String qaPlanCate) {
		this.qaPlanCate = qaPlanCate;
	}

	public String getSamp() {
		return samp;
	}

	public void setSamp(String samp) {
		this.samp = samp;
	}

	public String getConformance() {
		return conformance;
	}

	public void setConformance(String conformance) {
		this.conformance = conformance;
	}

	public Double getFromWdd() {
		return fromWdd;
	}

	public void setFromWdd(Double fromWdd) {
		this.fromWdd = fromWdd;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}