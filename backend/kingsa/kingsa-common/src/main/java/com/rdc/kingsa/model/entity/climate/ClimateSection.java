package com.rdc.kingsa.model.entity.climate;

import java.math.BigDecimal;
import java.util.Date;

public class ClimateSection {
    private String id;

    private String sectionName;

    private String sectionCode;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private BigDecimal elevation;

    private String address;

    private BigDecimal airPressureGaugeElevation;

    private BigDecimal windSpeedGaugeHeight;

    private BigDecimal observePlatformHeight;

    private String sectionLeader;

    private Short temperatureMonitor;

    private Short rainMonitor;

    private Short wetMonitor;

    private String powerStationId;

    private String creator;

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

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode == null ? null : sectionCode.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getElevation() {
        return elevation;
    }

    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getAirPressureGaugeElevation() {
        return airPressureGaugeElevation;
    }

    public void setAirPressureGaugeElevation(BigDecimal airPressureGaugeElevation) {
        this.airPressureGaugeElevation = airPressureGaugeElevation;
    }

    public BigDecimal getWindSpeedGaugeHeight() {
        return windSpeedGaugeHeight;
    }

    public void setWindSpeedGaugeHeight(BigDecimal windSpeedGaugeHeight) {
        this.windSpeedGaugeHeight = windSpeedGaugeHeight;
    }

    public BigDecimal getObservePlatformHeight() {
        return observePlatformHeight;
    }

    public void setObservePlatformHeight(BigDecimal observePlatformHeight) {
        this.observePlatformHeight = observePlatformHeight;
    }

    public String getSectionLeader() {
        return sectionLeader;
    }

    public void setSectionLeader(String sectionLeader) {
        this.sectionLeader = sectionLeader == null ? null : sectionLeader.trim();
    }

    public Short getTemperatureMonitor() {
        return temperatureMonitor;
    }

    public void setTemperatureMonitor(Short temperatureMonitor) {
        this.temperatureMonitor = temperatureMonitor;
    }

    public Short getRainMonitor() {
        return rainMonitor;
    }

    public void setRainMonitor(Short rainMonitor) {
        this.rainMonitor = rainMonitor;
    }

    public Short getWetMonitor() {
        return wetMonitor;
    }

    public void setWetMonitor(Short wetMonitor) {
        this.wetMonitor = wetMonitor;
    }

    public String getPowerStationId() {
        return powerStationId;
    }

    public void setPowerStationId(String powerStationId) {
        this.powerStationId = powerStationId == null ? null : powerStationId.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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