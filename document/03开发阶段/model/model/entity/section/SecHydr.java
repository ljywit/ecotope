package com.rdc.kingsa.model.entity.section;

import java.util.Date;

public class SecHydr {
    private String id;

    private String sectionId;

    private String sectionCode;

    private String elevationSystem;

    private String reservior;

    private Short waterLevel;

    private Short waterFlow;

    private Short waterTemperature;

    private String region;

    private String agent1;

    private String agent2;

    private String agent3;

    private String sectionNum;

    private String riverSystem1;

    private String riverSystem2;

    private String riverSystem3;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode == null ? null : sectionCode.trim();
    }

    public String getElevationSystem() {
        return elevationSystem;
    }

    public void setElevationSystem(String elevationSystem) {
        this.elevationSystem = elevationSystem == null ? null : elevationSystem.trim();
    }

    public String getReservior() {
        return reservior;
    }

    public void setReservior(String reservior) {
        this.reservior = reservior == null ? null : reservior.trim();
    }

    public Short getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(Short waterLevel) {
        this.waterLevel = waterLevel;
    }

    public Short getWaterFlow() {
        return waterFlow;
    }

    public void setWaterFlow(Short waterFlow) {
        this.waterFlow = waterFlow;
    }

    public Short getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(Short waterTemperature) {
        this.waterTemperature = waterTemperature;
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

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getAgent1() {
        return agent1;
    }

    public void setAgent1(String agent1) {
        this.agent1 = agent1 == null ? null : agent1.trim();
    }

    public String getAgent2() {
        return agent2;
    }

    public void setAgent2(String agent2) {
        this.agent2 = agent2 == null ? null : agent2.trim();
    }

    public String getAgent3() {
        return agent3;
    }

    public void setAgent3(String agent3) {
        this.agent3 = agent3 == null ? null : agent3.trim();
    }

    public String getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(String sectionNum) {
        this.sectionNum = sectionNum == null ? null : sectionNum.trim();
    }

    public String getRiverSystem1() {
        return riverSystem1;
    }

    public void setRiverSystem1(String riverSystem1) {
        this.riverSystem1 = riverSystem1 == null ? null : riverSystem1.trim();
    }

    public String getRiverSystem2() {
        return riverSystem2;
    }

    public void setRiverSystem2(String riverSystem2) {
        this.riverSystem2 = riverSystem2 == null ? null : riverSystem2.trim();
    }

    public String getRiverSystem3() {
        return riverSystem3;
    }

    public void setRiverSystem3(String riverSystem3) {
        this.riverSystem3 = riverSystem3 == null ? null : riverSystem3.trim();
    }
}