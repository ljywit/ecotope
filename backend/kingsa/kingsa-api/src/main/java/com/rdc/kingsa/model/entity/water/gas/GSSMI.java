package com.rdc.kingsa.model.entity.water.gas;

import java.util.Date;

public class GSSMI {
	
    private String id;

    private String sectionId;

    private String sectionName;

    private Date monitorTime;

    private String measureLine;

    private Double pressure;

    private Double waterDepth;

    private Double waterTemper;

    private Double doInstrument;

    private Double doContent;

    private Double dnContent;

    private Double doSaturation;

    private Double dnSaturation;

    private Double do1;

    private Double do2;

    private Double do3;

    private Double titration;

    private Double doSatInst;

    private Double tdgSaturation;

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

    public String getMeasureLine() {
        return measureLine;
    }

    public void setMeasureLine(String measureLine) {
        this.measureLine = measureLine == null ? null : measureLine.trim();
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getWaterDepth() {
        return waterDepth;
    }

    public void setWaterDepth(Double waterDepth) {
        this.waterDepth = waterDepth;
    }

    public Double getWaterTemper() {
        return waterTemper;
    }

    public void setWaterTemper(Double waterTemper) {
        this.waterTemper = waterTemper;
    }

    public Double getDoInstrument() {
        return doInstrument;
    }

    public void setDoInstrument(Double doInstrument) {
        this.doInstrument = doInstrument;
    }

    public Double getDoContent() {
        return doContent;
    }

    public void setDoContent(Double doContent) {
        this.doContent = doContent;
    }

    public Double getDnContent() {
        return dnContent;
    }

    public void setDnContent(Double dnContent) {
        this.dnContent = dnContent;
    }

    public Double getDoSaturation() {
        return doSaturation;
    }

    public void setDoSaturation(Double doSaturation) {
        this.doSaturation = doSaturation;
    }

    public Double getDnSaturation() {
        return dnSaturation;
    }

    public void setDnSaturation(Double dnSaturation) {
        this.dnSaturation = dnSaturation;
    }

    public Double getDo1() {
        return do1;
    }

    public void setDo1(Double do1) {
        this.do1 = do1;
    }

    public Double getDo2() {
        return do2;
    }

    public void setDo2(Double do2) {
        this.do2 = do2;
    }

    public Double getDo3() {
        return do3;
    }

    public void setDo3(Double do3) {
        this.do3 = do3;
    }

    public Double getTitration() {
        return titration;
    }

    public void setTitration(Double titration) {
        this.titration = titration;
    }

    public Double getDoSatInst() {
        return doSatInst;
    }

    public void setDoSatInst(Double doSatInst) {
        this.doSatInst = doSatInst;
    }

    public Double getTdgSaturation() {
        return tdgSaturation;
    }

    public void setTdgSaturation(Double tdgSaturation) {
        this.tdgSaturation = tdgSaturation;
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