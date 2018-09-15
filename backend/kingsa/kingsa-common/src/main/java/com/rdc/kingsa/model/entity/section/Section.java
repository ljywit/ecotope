package com.rdc.kingsa.model.entity.section;

import java.util.Date;

public class Section {
    private String id;

    private String sectionName;

    private Short serialNum;

    private Short riverType;

    private String location;

    private String belongRiver;

    private Double longitude;

    private Double latitude;

    private Short wqMonitor;

    private Short wtMonitor;

    private Short gsMonitor;

    private Short aeMonitor;

    private Short teMonitor;

    private Short hmMonitor;

    private Short climateMonitor;

    private Short atomizationMonitor;

    private Short hydrMonitor;

    private Date createTime;

    private Date modifyTime;

    private String remarks;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public Short getRiverType() {
        return riverType;
    }

    public void setRiverType(Short riverType) {
        this.riverType = riverType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getBelongRiver() {
        return belongRiver;
    }

    public void setBelongRiver(String belongRiver) {
        this.belongRiver = belongRiver == null ? null : belongRiver.trim();
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

    public Short getWqMonitor() {
        return wqMonitor;
    }

    public void setWqMonitor(Short wqMonitor) {
        this.wqMonitor = wqMonitor;
    }

    public Short getWtMonitor() {
        return wtMonitor;
    }

    public void setWtMonitor(Short wtMonitor) {
        this.wtMonitor = wtMonitor;
    }

    public Short getGsMonitor() {
        return gsMonitor;
    }

    public void setGsMonitor(Short gsMonitor) {
        this.gsMonitor = gsMonitor;
    }

    public Short getAeMonitor() {
        return aeMonitor;
    }

    public void setAeMonitor(Short aeMonitor) {
        this.aeMonitor = aeMonitor;
    }

    public Short getTeMonitor() {
        return teMonitor;
    }

    public void setTeMonitor(Short teMonitor) {
        this.teMonitor = teMonitor;
    }

    public Short getHmMonitor() {
        return hmMonitor;
    }

    public void setHmMonitor(Short hmMonitor) {
        this.hmMonitor = hmMonitor;
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

    public Short getClimateMonitor() {
        return climateMonitor;
    }

    public void setClimateMonitor(Short climateMonitor) {
        this.climateMonitor = climateMonitor;
    }

    public Short getAtomizationMonitor() {
        return atomizationMonitor;
    }

    public void setAtomizationMonitor(Short atomizationMonitor) {
        this.atomizationMonitor = atomizationMonitor;
    }

    public Short getHydrMonitor() {
        return hydrMonitor;
    }

    public void setHydrMonitor(Short hydrMonitor) {
        this.hydrMonitor = hydrMonitor;
    }

    public Short getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }
}