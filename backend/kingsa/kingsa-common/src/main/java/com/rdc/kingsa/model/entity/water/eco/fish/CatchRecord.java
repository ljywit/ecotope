package com.rdc.kingsa.model.entity.water.eco.fish;

import java.util.Date;

public class CatchRecord {

	private String id;

	private String catchId;

	private Date catchTime;

	private String sectionId;

	private String samplingPoint;

	private Long serialNumber;

	private String bioOrder;

	private String family;

	private String subFamily;

	private String genus;

	private String speciesName;

	private Integer overallLength;

	private Integer bodyLength;

	private Double weight;

	private Double emptyWeight;

	private String gonad;

	private String feedingHabits;

	private String physicalAge;

	private String otherThings;

	private Date createTime;

	private Date modifyTime;

	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getCatchId() {
		return catchId;
	}

	public void setCatchId(String catchId) {
		this.catchId = catchId == null ? null : catchId.trim();
	}

	public Date getCatchTime() {
		return catchTime;
	}

	public void setCatchTime(Date catchTime) {
		this.catchTime = catchTime;
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

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBioOrder() {
		return bioOrder;
	}

	public void setBioOrder(String bioOrder) {
		this.bioOrder = bioOrder == null ? null : bioOrder.trim();
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family == null ? null : family.trim();
	}

	public String getSubFamily() {
		return subFamily;
	}

	public void setSubFamily(String subFamily) {
		this.subFamily = subFamily == null ? null : subFamily.trim();
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

	public Integer getOverallLength() {
		return overallLength;
	}

	public void setOverallLength(Integer overallLength) {
		this.overallLength = overallLength;
	}

	public Integer getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(Integer bodyLength) {
		this.bodyLength = bodyLength;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(Double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public String getGonad() {
		return gonad;
	}

	public void setGonad(String gonad) {
		this.gonad = gonad == null ? null : gonad.trim();
	}

	public String getFeedingHabits() {
		return feedingHabits;
	}

	public void setFeedingHabits(String feedingHabits) {
		this.feedingHabits = feedingHabits == null ? null : feedingHabits.trim();
	}

	public String getPhysicalAge() {
		return physicalAge;
	}

	public void setPhysicalAge(String physicalAge) {
		this.physicalAge = physicalAge;
	}

	public String getOtherThings() {
		return otherThings;
	}

	public void setOtherThings(String otherThings) {
		this.otherThings = otherThings == null ? null : otherThings.trim();
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