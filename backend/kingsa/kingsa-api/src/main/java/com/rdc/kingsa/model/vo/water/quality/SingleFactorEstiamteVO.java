package com.rdc.kingsa.model.vo.water.quality;

public class SingleFactorEstiamteVO {

	private Short serialNumber;

	private String sectionName;

	private String planLevel;

	private String estimateLevel;

	private String overproof;

	private Object factors;

	public SingleFactorEstiamteVO() {

	}

	public SingleFactorEstiamteVO(Short serialNumber, String sectionName, String planLevel, String estimateLevel,
                                  String overproof, Object factors) {
		this.serialNumber = serialNumber;
		this.sectionName = sectionName;
		this.planLevel = planLevel;
		this.estimateLevel = estimateLevel;
		this.overproof = overproof;
		this.factors = factors;
	}

	public Short getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Short serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getPlanLevel() {
		return planLevel;
	}

	public void setPlanLevel(String planLevel) {
		this.planLevel = planLevel;
	}

	public String getEstimateLevel() {
		return estimateLevel;
	}

	public void setEstimateLevel(String estimateLevel) {
		this.estimateLevel = estimateLevel;
	}

	public String getOverproof() {
		return overproof;
	}

	public void setOverproof(String overproof) {
		this.overproof = overproof;
	}

	public Object getFactors() {
		return factors;
	}

	public void setFactors(Object factors) {
		this.factors = factors;
	}

}