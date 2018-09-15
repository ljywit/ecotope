package com.rdc.kingsa.model.entity.terra;

import java.util.Date;

public class LandClassification {
	
	private String id;

	private String primaryIdentifier;

	private String primaryName;

	private String secondaryIdentifier;

	private String secondaryName;

	private String secondaryMeanings;

	private Date createTime;

	private Date modifyTime;

	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getPrimaryIdentifier() {
		return primaryIdentifier;
	}

	public void setPrimaryIdentifier(String primaryIdentifier) {
		this.primaryIdentifier = primaryIdentifier == null ? null : primaryIdentifier.trim();
	}

	public String getPrimaryName() {
		return primaryName;
	}

	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName == null ? null : primaryName.trim();
	}

	public String getSecondaryIdentifier() {
		return secondaryIdentifier;
	}

	public void setSecondaryIdentifier(String secondaryIdentifier) {
		this.secondaryIdentifier = secondaryIdentifier == null ? null : secondaryIdentifier.trim();
	}

	public String getSecondaryName() {
		return secondaryName;
	}

	public void setSecondaryName(String secondaryName) {
		this.secondaryName = secondaryName == null ? null : secondaryName.trim();
	}

	public String getSecondaryMeanings() {
		return secondaryMeanings;
	}

	public void setSecondaryMeanings(String secondaryMeanings) {
		this.secondaryMeanings = secondaryMeanings == null ? null : secondaryMeanings.trim();
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