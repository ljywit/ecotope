package com.rdc.kingsa.model.dto.water.eco.environment;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("浮游植物监测")
public class PhytoplanktonMIView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("序号")
	@Range(min = 0, max = 99999, message = "序号必须在{min}与{max}之间")
	private Integer serialNumber;

	@ApiModelProperty("河流")
	private String river;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("采样点")
	@NotNull(message = "采样点不能为空")
	private String samplingPoint;

	@ApiModelProperty("经度")
	private Double longitude;

	@ApiModelProperty("纬度")
	private Double latitude;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("测线")
	@NotNull(message = "测线不能为空")
	private String measureLine;

	@ApiModelProperty("水深")
	@NotNull(message = "水深不能为空")
	private Double waterDepth;

	@ApiModelProperty("门")
	@NotNull(message = "门不能为空")
	private String phylum;

	@ApiModelProperty("属")
	@NotNull(message = "属不能为空")
	private String genus;

	@ApiModelProperty("种")
	@NotNull(message = "种不能为空")
	private String speciesName;

	@ApiModelProperty("密度")
	@NotNull(message = "密度不能为空")
	@Range(min = 0, max = 99999, message = "密度必须在{min}与{max}之间")
	private BigDecimal density;

	@ApiModelProperty("生物量")
	@NotNull(message = "生物量不能为空")
	@Range(min = 0, max = 99999, message = "生物量必须在{min}与{max}之间")
	private Double biomass;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getRiver() {
		return river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getSamplingPoint() {
		return samplingPoint;
	}

	public void setSamplingPoint(String samplingPoint) {
		this.samplingPoint = samplingPoint;
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

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public String getMeasureLine() {
		return measureLine;
	}

	public void setMeasureLine(String measureLine) {
		this.measureLine = measureLine;
	}

	public Double getWaterDepth() {
		return waterDepth;
	}

	public void setWaterDepth(Double waterDepth) {
		this.waterDepth = waterDepth;
	}

	public String getPhylum() {
		return phylum;
	}

	public void setPhylum(String phylum) {
		this.phylum = phylum;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	public BigDecimal getDensity() {
		return density;
	}

	public void setDensity(BigDecimal density) {
		this.density = density;
	}

	public Double getBiomass() {
		return biomass;
	}

	public void setBiomass(Double biomass) {
		this.biomass = biomass;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}