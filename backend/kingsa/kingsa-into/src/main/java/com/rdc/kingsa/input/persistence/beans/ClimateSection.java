package com.rdc.kingsa.input.persistence.beans;

import java.math.BigDecimal;
import java.util.Date;

public class ClimateSection {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.SECTION_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String sectionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.SECTION_CODE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String sectionCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.LONGITUDE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.LATITUDE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.ELEVATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal elevation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.ADDRESS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.AIR_PRESSURE_GAUGE_ELEVATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal airPressureGaugeElevation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.WIND_SPEED_GAUGE_HEIGHT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal windSpeedGaugeHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.OBSERVE_PLATFORM_HEIGHT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal observePlatformHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.SECTION_LEADER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String sectionLeader;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.TEMPERATURE_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short temperatureMonitor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.RAIN_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short rainMonitor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.WET_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short wetMonitor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.POWER_STATION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String powerStationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.CREATOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CLIMATE_SECTION.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.ID
     *
     * @return the value of CLIMATE_SECTION.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.ID
     *
     * @param id the value for CLIMATE_SECTION.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.SECTION_NAME
     *
     * @return the value of CLIMATE_SECTION.SECTION_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.SECTION_NAME
     *
     * @param sectionName the value for CLIMATE_SECTION.SECTION_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.SECTION_CODE
     *
     * @return the value of CLIMATE_SECTION.SECTION_CODE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.SECTION_CODE
     *
     * @param sectionCode the value for CLIMATE_SECTION.SECTION_CODE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode == null ? null : sectionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.LONGITUDE
     *
     * @return the value of CLIMATE_SECTION.LONGITUDE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.LONGITUDE
     *
     * @param longitude the value for CLIMATE_SECTION.LONGITUDE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.LATITUDE
     *
     * @return the value of CLIMATE_SECTION.LATITUDE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.LATITUDE
     *
     * @param latitude the value for CLIMATE_SECTION.LATITUDE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.ELEVATION
     *
     * @return the value of CLIMATE_SECTION.ELEVATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getElevation() {
        return elevation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.ELEVATION
     *
     * @param elevation the value for CLIMATE_SECTION.ELEVATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.ADDRESS
     *
     * @return the value of CLIMATE_SECTION.ADDRESS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.ADDRESS
     *
     * @param address the value for CLIMATE_SECTION.ADDRESS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.AIR_PRESSURE_GAUGE_ELEVATION
     *
     * @return the value of CLIMATE_SECTION.AIR_PRESSURE_GAUGE_ELEVATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getAirPressureGaugeElevation() {
        return airPressureGaugeElevation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.AIR_PRESSURE_GAUGE_ELEVATION
     *
     * @param airPressureGaugeElevation the value for CLIMATE_SECTION.AIR_PRESSURE_GAUGE_ELEVATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setAirPressureGaugeElevation(BigDecimal airPressureGaugeElevation) {
        this.airPressureGaugeElevation = airPressureGaugeElevation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.WIND_SPEED_GAUGE_HEIGHT
     *
     * @return the value of CLIMATE_SECTION.WIND_SPEED_GAUGE_HEIGHT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getWindSpeedGaugeHeight() {
        return windSpeedGaugeHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.WIND_SPEED_GAUGE_HEIGHT
     *
     * @param windSpeedGaugeHeight the value for CLIMATE_SECTION.WIND_SPEED_GAUGE_HEIGHT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWindSpeedGaugeHeight(BigDecimal windSpeedGaugeHeight) {
        this.windSpeedGaugeHeight = windSpeedGaugeHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.OBSERVE_PLATFORM_HEIGHT
     *
     * @return the value of CLIMATE_SECTION.OBSERVE_PLATFORM_HEIGHT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getObservePlatformHeight() {
        return observePlatformHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.OBSERVE_PLATFORM_HEIGHT
     *
     * @param observePlatformHeight the value for CLIMATE_SECTION.OBSERVE_PLATFORM_HEIGHT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setObservePlatformHeight(BigDecimal observePlatformHeight) {
        this.observePlatformHeight = observePlatformHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.SECTION_LEADER
     *
     * @return the value of CLIMATE_SECTION.SECTION_LEADER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionLeader() {
        return sectionLeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.SECTION_LEADER
     *
     * @param sectionLeader the value for CLIMATE_SECTION.SECTION_LEADER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionLeader(String sectionLeader) {
        this.sectionLeader = sectionLeader == null ? null : sectionLeader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.TEMPERATURE_MONITOR
     *
     * @return the value of CLIMATE_SECTION.TEMPERATURE_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getTemperatureMonitor() {
        return temperatureMonitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.TEMPERATURE_MONITOR
     *
     * @param temperatureMonitor the value for CLIMATE_SECTION.TEMPERATURE_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setTemperatureMonitor(Short temperatureMonitor) {
        this.temperatureMonitor = temperatureMonitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.RAIN_MONITOR
     *
     * @return the value of CLIMATE_SECTION.RAIN_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getRainMonitor() {
        return rainMonitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.RAIN_MONITOR
     *
     * @param rainMonitor the value for CLIMATE_SECTION.RAIN_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRainMonitor(Short rainMonitor) {
        this.rainMonitor = rainMonitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.WET_MONITOR
     *
     * @return the value of CLIMATE_SECTION.WET_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getWetMonitor() {
        return wetMonitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.WET_MONITOR
     *
     * @param wetMonitor the value for CLIMATE_SECTION.WET_MONITOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWetMonitor(Short wetMonitor) {
        this.wetMonitor = wetMonitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.POWER_STATION_ID
     *
     * @return the value of CLIMATE_SECTION.POWER_STATION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getPowerStationId() {
        return powerStationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.POWER_STATION_ID
     *
     * @param powerStationId the value for CLIMATE_SECTION.POWER_STATION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setPowerStationId(String powerStationId) {
        this.powerStationId = powerStationId == null ? null : powerStationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.CREATOR
     *
     * @return the value of CLIMATE_SECTION.CREATOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.CREATOR
     *
     * @param creator the value for CLIMATE_SECTION.CREATOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.CREATE_TIME
     *
     * @return the value of CLIMATE_SECTION.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.CREATE_TIME
     *
     * @param createTime the value for CLIMATE_SECTION.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.MODIFY_TIME
     *
     * @return the value of CLIMATE_SECTION.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.MODIFY_TIME
     *
     * @param modifyTime the value for CLIMATE_SECTION.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CLIMATE_SECTION.REMARKS
     *
     * @return the value of CLIMATE_SECTION.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CLIMATE_SECTION.REMARKS
     *
     * @param remarks the value for CLIMATE_SECTION.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}