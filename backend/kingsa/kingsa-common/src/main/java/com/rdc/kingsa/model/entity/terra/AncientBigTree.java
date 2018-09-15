package com.rdc.kingsa.model.entity.terra;

import java.util.Date;

public class AncientBigTree {
	
	private String id;

	private Long serialNumber;

	private String treeSpecies;

	private Double altitude;

	private String county;

	private String towns;

	private String location;

	private Date createTime;

	private Date modifyTime;

	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getTreeSpecies() {
		return treeSpecies;
	}

	public void setTreeSpecies(String treeSpecies) {
		this.treeSpecies = treeSpecies == null ? null : treeSpecies.trim();
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county == null ? null : county.trim();
	}

	public String getTowns() {
		return towns;
	}

	public void setTowns(String towns) {
		this.towns = towns == null ? null : towns.trim();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
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