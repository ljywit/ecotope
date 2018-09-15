package com.rdc.kingsa.model.entity.water.eco.fish;

import java.math.BigDecimal;
import java.util.Date;

public class ReproductionEcology {

	private String id;

	private String sectionId;

	private String sectionName;

	private Date monitorTime;

	private Integer fryNumber;

	private BigDecimal fryRunoff;

	private Double waterTemp;

	private Long fryFlows;

	private Integer transparency;

	private Double dissolveOxygen;

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

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName == null ? null : sectionName.trim();
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public Integer getFryNumber() {
		return fryNumber;
	}

	public void setFryNumber(Integer fryNumber) {
		this.fryNumber = fryNumber;
	}

	public BigDecimal getFryRunoff() {
		return fryRunoff;
	}

	public void setFryRunoff(BigDecimal fryRunoff) {
		this.fryRunoff = fryRunoff;
	}

	public Double getWaterTemp() {
		return waterTemp;
	}

	public void setWaterTemp(Double waterTemp) {
		this.waterTemp = waterTemp;
	}

	public Long getFryFlows() {
		return fryFlows;
	}

	public void setFryFlows(Long fryFlows) {
		this.fryFlows = fryFlows;
	}

	public Integer getTransparency() {
		return transparency;
	}

	public void setTransparency(Integer transparency) {
		this.transparency = transparency;
	}

	public Double getDissolveOxygen() {
		return dissolveOxygen;
	}

	public void setDissolveOxygen(Double dissolveOxygen) {
		this.dissolveOxygen = dissolveOxygen;
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