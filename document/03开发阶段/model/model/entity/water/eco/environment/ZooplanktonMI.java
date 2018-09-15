package com.rdc.kingsa.model.entity.water.eco.environment;

import java.math.BigDecimal;
import java.util.Date;

public class ZooplanktonMI {

	private String id;

	private Integer serialNumber;

	private String river;

	private String sectionId;

	private String samplingPoint;

	private Double longitude;

	private Double latitude;

	private Date monitorTime;

	private String measureLine;

	private Double waterDepth;

	private String phylum;

	private String genus;

	private String speciesName;

	private BigDecimal density;

	private Double biomass;

	private Date createTime;

	private Date modifyTime;

	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
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
		this.river = river == null ? null : river.trim();
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId == null ? null : sectionId.trim();
	}

	public String getSamplingPoint() {
		return samplingPoint;
	}

	public void setSamplingPoint(String samplingPoint) {
		this.samplingPoint = samplingPoint == null ? null : samplingPoint.trim();
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
		this.measureLine = measureLine == null ? null : measureLine.trim();
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
		this.phylum = phylum == null ? null : phylum.trim();
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus == null ? null : genus.trim();
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName == null ? null : speciesName.trim();
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}