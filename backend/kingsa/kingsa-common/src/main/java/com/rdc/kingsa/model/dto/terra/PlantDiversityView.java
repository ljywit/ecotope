package com.rdc.kingsa.model.dto.terra;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("植物多样性信息-保存")
public class PlantDiversityView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("取样编号")
	@Length(max = 12, message = "取样编号长度不能超过{max}")
	private String sampleNumber;

	@ApiModelProperty("经度")
	@NotNull(message = "经度不能为空")
	@Range(min = 0, max = 99999, message = "经度必须在{min}与{max}之间")
	private Double longitude;

	@ApiModelProperty("纬度")
	@NotNull(message = "纬度不能为空")
	@Range(min = 0, max = 99999, message = "纬度必须在{min}与{max}之间")
	private Double latitude;

	@ApiModelProperty("具体位置")
	@NotNull(message = "具体位置不能为空")
	@Length(max = 25, message = "具体位置长度不能超过{max}")
	private String location;

	@ApiModelProperty("物种数量")
	@NotNull(message = "物种数量不能为空")
	@Range(min = 0, max = 9999999999L, message = "物种数量必须在{min}与{max}之间")
	private Long speciesNumber;

	@ApiModelProperty("物种名称")
	@NotNull(message = "物种名称不能为空")
	@Length(max = 25, message = "物种名称长度不能超过{max}")
	private String speciesNames;

	@ApiModelProperty("总生物量")
	@NotNull(message = "总生物量不能为空")
	@Range(min = 0, max = 99999, message = "总生物量必须在{min}与{max}之间")
	private Double biomassTotal;

	@ApiModelProperty("盖度等级")
	@NotNull(message = "盖度等级不能为空")
	@Length(max = 12, message = "盖度等级长度不能超过{max}")
	private String coverClass;

	@ApiModelProperty("备注信息")
	@Length(max = 25, message = "备注信息长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public String getSampleNumber() {
		return sampleNumber;
	}

	public void setSampleNumber(String sampleNumber) {
		this.sampleNumber = sampleNumber;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getSpeciesNumber() {
		return speciesNumber;
	}

	public void setSpeciesNumber(Long speciesNumber) {
		this.speciesNumber = speciesNumber;
	}

	public String getSpeciesNames() {
		return speciesNames;
	}

	public void setSpeciesNames(String speciesNames) {
		this.speciesNames = speciesNames;
	}

	public Double getBiomassTotal() {
		return biomassTotal;
	}

	public void setBiomassTotal(Double biomassTotal) {
		this.biomassTotal = biomassTotal;
	}

	public String getCoverClass() {
		return coverClass;
	}

	public void setCoverClass(String coverClass) {
		this.coverClass = coverClass;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}