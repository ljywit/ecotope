package com.rdc.kingsa.model.entity.hydrology;

import java.math.BigDecimal;
import java.util.Date;

public class HydrWaterFlowYear {
    private String id;

    private String waterFlowUnit;

    private BigDecimal waterFlowMax;

    private Date waterFlowMaxDate;

    private BigDecimal waterFlowMin;

    private Date waterFlowMinDate;

    private BigDecimal waterFlowAvg;

    private BigDecimal runoffVolume;

    private String runoffVolumeUnit;

    private BigDecimal runoffScale;

    private String runoffScaleUnit;

    private BigDecimal runoffDeepth;

    private String runoffDeepthUnit;

    private String floodUnit;

    private BigDecimal floodMax;

    private Date floodMaxDate;

    private BigDecimal floodMax3;

    private Date floodMax3Date;

    private BigDecimal floodMax7;

    private Date floodMax7Date;

    private BigDecimal floodMax15;

    private Date floodMax15Date;

    private BigDecimal floodMax30;

    private Date floodMax30Date;

    private BigDecimal floodMax60;

    private Date floodMax60Date;

    private Short year;

    private String sectionId;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private BigDecimal waterCollectingArea;

    private String waterCollectingAreaUnit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWaterFlowUnit() {
        return waterFlowUnit;
    }

    public void setWaterFlowUnit(String waterFlowUnit) {
        this.waterFlowUnit = waterFlowUnit == null ? null : waterFlowUnit.trim();
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

    public BigDecimal getRunoffVolume() {
        return runoffVolume;
    }

    public void setRunoffVolume(BigDecimal runoffVolume) {
        this.runoffVolume = runoffVolume;
    }

    public String getRunoffVolumeUnit() {
        return runoffVolumeUnit;
    }

    public void setRunoffVolumeUnit(String runoffVolumeUnit) {
        this.runoffVolumeUnit = runoffVolumeUnit == null ? null : runoffVolumeUnit.trim();
    }

    public BigDecimal getRunoffScale() {
        return runoffScale;
    }

    public void setRunoffScale(BigDecimal runoffScale) {
        this.runoffScale = runoffScale;
    }

    public String getRunoffScaleUnit() {
        return runoffScaleUnit;
    }

    public void setRunoffScaleUnit(String runoffScaleUnit) {
        this.runoffScaleUnit = runoffScaleUnit == null ? null : runoffScaleUnit.trim();
    }

    public BigDecimal getRunoffDeepth() {
        return runoffDeepth;
    }

    public void setRunoffDeepth(BigDecimal runoffDeepth) {
        this.runoffDeepth = runoffDeepth;
    }

    public String getRunoffDeepthUnit() {
        return runoffDeepthUnit;
    }

    public void setRunoffDeepthUnit(String runoffDeepthUnit) {
        this.runoffDeepthUnit = runoffDeepthUnit == null ? null : runoffDeepthUnit.trim();
    }

    public String getFloodUnit() {
        return floodUnit;
    }

    public void setFloodUnit(String floodUnit) {
        this.floodUnit = floodUnit == null ? null : floodUnit.trim();
    }

    public BigDecimal getFloodMax() {
        return floodMax;
    }

    public void setFloodMax(BigDecimal floodMax) {
        this.floodMax = floodMax;
    }

    public Date getFloodMaxDate() {
        return floodMaxDate;
    }

    public void setFloodMaxDate(Date floodMaxDate) {
        this.floodMaxDate = floodMaxDate;
    }

    public BigDecimal getFloodMax3() {
        return floodMax3;
    }

    public void setFloodMax3(BigDecimal floodMax3) {
        this.floodMax3 = floodMax3;
    }

    public Date getFloodMax3Date() {
        return floodMax3Date;
    }

    public void setFloodMax3Date(Date floodMax3Date) {
        this.floodMax3Date = floodMax3Date;
    }

    public BigDecimal getFloodMax7() {
        return floodMax7;
    }

    public void setFloodMax7(BigDecimal floodMax7) {
        this.floodMax7 = floodMax7;
    }

    public Date getFloodMax7Date() {
        return floodMax7Date;
    }

    public void setFloodMax7Date(Date floodMax7Date) {
        this.floodMax7Date = floodMax7Date;
    }

    public BigDecimal getFloodMax15() {
        return floodMax15;
    }

    public void setFloodMax15(BigDecimal floodMax15) {
        this.floodMax15 = floodMax15;
    }

    public Date getFloodMax15Date() {
        return floodMax15Date;
    }

    public void setFloodMax15Date(Date floodMax15Date) {
        this.floodMax15Date = floodMax15Date;
    }

    public BigDecimal getFloodMax30() {
        return floodMax30;
    }

    public void setFloodMax30(BigDecimal floodMax30) {
        this.floodMax30 = floodMax30;
    }

    public Date getFloodMax30Date() {
        return floodMax30Date;
    }

    public void setFloodMax30Date(Date floodMax30Date) {
        this.floodMax30Date = floodMax30Date;
    }

    public BigDecimal getFloodMax60() {
        return floodMax60;
    }

    public void setFloodMax60(BigDecimal floodMax60) {
        this.floodMax60 = floodMax60;
    }

    public Date getFloodMax60Date() {
        return floodMax60Date;
    }

    public void setFloodMax60Date(Date floodMax60Date) {
        this.floodMax60Date = floodMax60Date;
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

    public BigDecimal getWaterCollectingArea() {
        return waterCollectingArea;
    }

    public void setWaterCollectingArea(BigDecimal waterCollectingArea) {
        this.waterCollectingArea = waterCollectingArea;
    }

    public String getWaterCollectingAreaUnit() {
        return waterCollectingAreaUnit;
    }

    public void setWaterCollectingAreaUnit(String waterCollectingAreaUnit) {
        this.waterCollectingAreaUnit = waterCollectingAreaUnit == null ? null : waterCollectingAreaUnit.trim();
    }
}