package com.rdc.kingsa.model.entity.section;

import java.util.Date;

public class SecWQM {
    private String id;

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

    public String getMonitorContent() {
        return monitorContent;
    }

    public void setMonitorContent(String monitorContent) {
        this.monitorContent = monitorContent == null ? null : monitorContent.trim();
    }

    public String getMonitorFrequency() {
        return monitorFrequency;
    }

    public void setMonitorFrequency(String monitorFrequency) {
        this.monitorFrequency = monitorFrequency == null ? null : monitorFrequency.trim();
    }

    public String getQaPlanCate() {
        return qaPlanCate;
    }

    public void setQaPlanCate(String qaPlanCate) {
        this.qaPlanCate = qaPlanCate == null ? null : qaPlanCate.trim();
    }

    public String getSamp() {
        return samp;
    }

    public void setSamp(String samp) {
        this.samp = samp == null ? null : samp.trim();
    }

    public String getConformance() {
        return conformance;
    }

    public void setConformance(String conformance) {
        this.conformance = conformance == null ? null : conformance.trim();
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
        this.remarks = remarks == null ? null : remarks.trim();
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
}