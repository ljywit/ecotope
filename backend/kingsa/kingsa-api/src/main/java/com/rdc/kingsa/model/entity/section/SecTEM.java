package com.rdc.kingsa.model.entity.section;

import java.util.Date;

public class SecTEM {

	private String id;

	private String sectionId;

	private Short serialNum;

	private String powerStation;

	private String sampLineType;

	private String sampNumber;

	private Date createTime;

	private Date modifyTime;

	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId == null ? null : sectionId.trim();
	}

	public Short getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(Short serialNum) {
		this.serialNum = serialNum;
	}

	public String getPowerStation() {
		return powerStation;
	}

	public void setPowerStation(String powerStation) {
		this.powerStation = powerStation == null ? null : powerStation.trim();
	}

	public String getSampLineType() {
		return sampLineType;
	}

	public void setSampLineType(String sampLineType) {
		this.sampLineType = sampLineType == null ? null : sampLineType.trim();
	}

	public String getSampNumber() {
		return sampNumber;
	}

	public void setSampNumber(String sampNumber) {
		this.sampNumber = sampNumber;
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