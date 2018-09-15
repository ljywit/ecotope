package com.rdc.kingsa.model.entity.section;

import java.util.Date;

public class SecAEM {
	
    private String id;

    private String sectionId;

    private Short serialNum;

    private String region;

    private Double fromWdd;

    private Short rareFish;

    private Short economicFish;

    private Short reproEcology;

    private Short fisheryEnv;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }

    public Short getRareFish() {
        return rareFish;
    }

    public void setRareFish(Short rareFish) {
        this.rareFish = rareFish;
    }

    public Short getEconomicFish() {
        return economicFish;
    }

    public void setEconomicFish(Short economicFish) {
        this.economicFish = economicFish;
    }

    public Short getReproEcology() {
        return reproEcology;
    }

    public void setReproEcology(Short reproEcology) {
        this.reproEcology = reproEcology;
    }

    public Short getFisheryEnv() {
        return fisheryEnv;
    }

    public void setFisheryEnv(Short fisheryEnv) {
        this.fisheryEnv = fisheryEnv;
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