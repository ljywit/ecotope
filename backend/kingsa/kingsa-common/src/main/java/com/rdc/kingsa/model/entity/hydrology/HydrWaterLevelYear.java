package com.rdc.kingsa.model.entity.hydrology;

import java.math.BigDecimal;
import java.util.Date;

public class HydrWaterLevelYear {
    private String id;

    private String sectionId;

    private BigDecimal waterLevelMax;

    private Date waterLevelMaxDate;

    private BigDecimal waterLevelMin;

    private Date waterLevelMinDate;

    private BigDecimal waterLevelAvg;

    private BigDecimal assuranceWaterLevelMax;

    private BigDecimal assuranceWaterLevel15;

    private BigDecimal assuranceWaterLevel30;

    private BigDecimal assuranceWaterLevel90;

    private BigDecimal assuranceWaterLevel180;

    private BigDecimal assuranceWaterLevel270;

    private BigDecimal assuranceWaterLevelMin;

    private Short year;

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

    public BigDecimal getWaterLevelMax() {
        return waterLevelMax;
    }

    public void setWaterLevelMax(BigDecimal waterLevelMax) {
        this.waterLevelMax = waterLevelMax;
    }

    public Date getWaterLevelMaxDate() {
        return waterLevelMaxDate;
    }

    public void setWaterLevelMaxDate(Date waterLevelMaxDate) {
        this.waterLevelMaxDate = waterLevelMaxDate;
    }

    public BigDecimal getWaterLevelMin() {
        return waterLevelMin;
    }

    public void setWaterLevelMin(BigDecimal waterLevelMin) {
        this.waterLevelMin = waterLevelMin;
    }

    public Date getWaterLevelMinDate() {
        return waterLevelMinDate;
    }

    public void setWaterLevelMinDate(Date waterLevelMinDate) {
        this.waterLevelMinDate = waterLevelMinDate;
    }

    public BigDecimal getWaterLevelAvg() {
        return waterLevelAvg;
    }

    public void setWaterLevelAvg(BigDecimal waterLevelAvg) {
        this.waterLevelAvg = waterLevelAvg;
    }

    public BigDecimal getAssuranceWaterLevelMax() {
        return assuranceWaterLevelMax;
    }

    public void setAssuranceWaterLevelMax(BigDecimal assuranceWaterLevelMax) {
        this.assuranceWaterLevelMax = assuranceWaterLevelMax;
    }

    public BigDecimal getAssuranceWaterLevel15() {
        return assuranceWaterLevel15;
    }

    public void setAssuranceWaterLevel15(BigDecimal assuranceWaterLevel15) {
        this.assuranceWaterLevel15 = assuranceWaterLevel15;
    }

    public BigDecimal getAssuranceWaterLevel30() {
        return assuranceWaterLevel30;
    }

    public void setAssuranceWaterLevel30(BigDecimal assuranceWaterLevel30) {
        this.assuranceWaterLevel30 = assuranceWaterLevel30;
    }

    public BigDecimal getAssuranceWaterLevel90() {
        return assuranceWaterLevel90;
    }

    public void setAssuranceWaterLevel90(BigDecimal assuranceWaterLevel90) {
        this.assuranceWaterLevel90 = assuranceWaterLevel90;
    }

    public BigDecimal getAssuranceWaterLevel180() {
        return assuranceWaterLevel180;
    }

    public void setAssuranceWaterLevel180(BigDecimal assuranceWaterLevel180) {
        this.assuranceWaterLevel180 = assuranceWaterLevel180;
    }

    public BigDecimal getAssuranceWaterLevel270() {
        return assuranceWaterLevel270;
    }

    public void setAssuranceWaterLevel270(BigDecimal assuranceWaterLevel270) {
        this.assuranceWaterLevel270 = assuranceWaterLevel270;
    }

    public BigDecimal getAssuranceWaterLevelMin() {
        return assuranceWaterLevelMin;
    }

    public void setAssuranceWaterLevelMin(BigDecimal assuranceWaterLevelMin) {
        this.assuranceWaterLevelMin = assuranceWaterLevelMin;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
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