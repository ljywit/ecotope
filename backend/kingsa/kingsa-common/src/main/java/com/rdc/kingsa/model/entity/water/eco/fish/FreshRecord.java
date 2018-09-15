package com.rdc.kingsa.model.entity.water.eco.fish;

import java.util.Date;

public class FreshRecord {
	
    private String id;

    private Date catchTime;

    private String riverLink;

    private String sectionId;

    private String samplingPoint;

    private String fishingType;

    private String nettingSpecification;

    private Double catchTotal;

    private Integer catchInNumber;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCatchTime() {
        return catchTime;
    }

    public void setCatchTime(Date catchTime) {
        this.catchTime = catchTime;
    }

    public String getRiverLink() {
        return riverLink;
    }

    public void setRiverLink(String riverLink) {
        this.riverLink = riverLink == null ? null : riverLink.trim();
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

    public String getFishingType() {
        return fishingType;
    }

    public void setFishingType(String fishingType) {
        this.fishingType = fishingType == null ? null : fishingType.trim();
    }

    public String getNettingSpecification() {
        return nettingSpecification;
    }

    public void setNettingSpecification(String nettingSpecification) {
        this.nettingSpecification = nettingSpecification == null ? null : nettingSpecification.trim();
    }

    public Double getCatchTotal() {
        return catchTotal;
    }

    public void setCatchTotal(Double catchTotal) {
        this.catchTotal = catchTotal;
    }

    public Integer getCatchInNumber() {
        return catchInNumber;
    }

    public void setCatchInNumber(Integer catchInNumber) {
        this.catchInNumber = catchInNumber;
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