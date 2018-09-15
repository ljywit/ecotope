package com.rdc.kingsa.model.po.section;

import java.util.Date;

/**
 * Created by lxf on 18/8/17.
 */
public class WaterQualitySection {
    private String id;

    private String sectionName;

    private Short riverType;

    private String location;

    private String belongRiver;

    private Double longitude;

    private Double latitude;

    private String sectionId;

    private Short serialNum;

    private String monitorContent;

    private String monitorFrequency;

    private String qaPlanCate;

    private Short drainOutlet;

    private Short qaPlanVal;

    private String samp;

    private String conformance;

    private Double fromWdd;

    private Short valuationQ;

    private Short valuationS;

    private Short valuationE;

    private Short valuationH;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Short getRiverType() {
        return riverType;
    }

    public void setRiverType(Short riverType) {
        this.riverType = riverType;
    }

    public Short getDrainOutlet() {
        return drainOutlet;
    }

    public void setDrainOutlet(Short drainOutlet) {
        this.drainOutlet = drainOutlet;
    }

    public Short getQaPlanVal() {
        return qaPlanVal;
    }

    public void setQaPlanVal(Short qaPlanVal) {
        this.qaPlanVal = qaPlanVal;
    }

    public String getSamp() {
        return samp;
    }

    public void setSamp(String samp) {
        this.samp = samp;
    }

    public String getConformance() {
        return conformance;
    }

    public void setConformance(String conformance) {
        this.conformance = conformance;
    }

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }

    public Short getValuationQ() {
        return valuationQ;
    }

    public void setValuationQ(Short valuationQ) {
        this.valuationQ = valuationQ;
    }

    public Short getValuationS() {
        return valuationS;
    }

    public void setValuationS(Short valuationS) {
        this.valuationS = valuationS;
    }

    public Short getValuationE() {
        return valuationE;
    }

    public void setValuationE(Short valuationE) {
        this.valuationE = valuationE;
    }

    public Short getValuationH() {
        return valuationH;
    }

    public void setValuationH(Short valuationH) {
        this.valuationH = valuationH;
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
        this.remarks = remarks;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBelongRiver() {
        return belongRiver;
    }

    public void setBelongRiver(String belongRiver) {
        this.belongRiver = belongRiver;
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

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public Short getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

    public String getMonitorContent() {
        return monitorContent;
    }

    public void setMonitorContent(String monitorContent) {
        this.monitorContent = monitorContent;
    }

    public String getMonitorFrequency() {
        return monitorFrequency;
    }

    public void setMonitorFrequency(String monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
    }

    public String getQaPlanCate() {
        return qaPlanCate;
    }

    public void setQaPlanCate(String qaPlanCate) {
        this.qaPlanCate = qaPlanCate;
    }
}
