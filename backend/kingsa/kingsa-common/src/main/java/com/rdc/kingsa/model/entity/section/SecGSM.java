package com.rdc.kingsa.model.entity.section;

import java.util.Date;

public class SecGSM {

    private String id;

    private String sectionId;

    private Short serialNum;

    private String region;

    private String samplingType;

    private String monitorFrequency;

    private Double fromXld;

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

    public String getSamplingType() {
        return samplingType;
    }

    public void setSamplingType(String samplingType) {
        this.samplingType = samplingType;
    }

    public String getMonitorFrequency() {
        return monitorFrequency;
    }

    public void setMonitorFrequency(String monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
    }

    public Double getFromXld() {
        return fromXld;
    }

    public void setFromXld(Double fromXld) {
        this.fromXld = fromXld;
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