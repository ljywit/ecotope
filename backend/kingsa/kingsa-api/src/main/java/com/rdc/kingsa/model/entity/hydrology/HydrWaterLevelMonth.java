package com.rdc.kingsa.model.entity.hydrology;

import java.math.BigDecimal;
import java.util.Date;

public class HydrWaterLevelMonth {
    private String id;

    private String sectionId;

    private BigDecimal waterLevelAvg;

    private BigDecimal waterLevelMax;

    private Date waterLevelMaxDate;

    private BigDecimal waterLevelMin;

    private Date waterLevelMinDate;

    private String yearId;

    private Short month;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private Date monitorTime;

    private Short year;

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

    public BigDecimal getWaterLevelAvg() {
        return waterLevelAvg;
    }

    public void setWaterLevelAvg(BigDecimal waterLevelAvg) {
        this.waterLevelAvg = waterLevelAvg;
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

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId == null ? null : yearId.trim();
    }

    public Short getMonth() {
        return month;
    }

    public void setMonth(Short month) {
        this.month = month;
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

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }
}