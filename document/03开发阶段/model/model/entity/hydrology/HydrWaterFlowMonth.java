package com.rdc.kingsa.model.entity.hydrology;

import java.math.BigDecimal;
import java.util.Date;

public class HydrWaterFlowMonth {
    private String id;

    private BigDecimal waterFlowMax;

    private Date waterFlowMaxDate;

    private BigDecimal waterFlowMin;

    private Date waterFlowMinDate;

    private BigDecimal waterFlowAvg;

    private String yearId;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private Short month;

    private Short year;

    private String sectionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getWaterFlowMax() {
        return waterFlowMax;
    }

    public void setWaterFlowMax(BigDecimal waterFlowMax) {
        this.waterFlowMax = waterFlowMax;
    }

    public Date getWaterFlowMaxDate() {
        return waterFlowMaxDate;
    }

    public void setWaterFlowMaxDate(Date waterFlowMaxDate) {
        this.waterFlowMaxDate = waterFlowMaxDate;
    }

    public BigDecimal getWaterFlowMin() {
        return waterFlowMin;
    }

    public void setWaterFlowMin(BigDecimal waterFlowMin) {
        this.waterFlowMin = waterFlowMin;
    }

    public Date getWaterFlowMinDate() {
        return waterFlowMinDate;
    }

    public void setWaterFlowMinDate(Date waterFlowMinDate) {
        this.waterFlowMinDate = waterFlowMinDate;
    }

    public BigDecimal getWaterFlowAvg() {
        return waterFlowAvg;
    }

    public void setWaterFlowAvg(BigDecimal waterFlowAvg) {
        this.waterFlowAvg = waterFlowAvg;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId == null ? null : yearId.trim();
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

    public Short getMonth() {
        return month;
    }

    public void setMonth(Short month) {
        this.month = month;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }
}