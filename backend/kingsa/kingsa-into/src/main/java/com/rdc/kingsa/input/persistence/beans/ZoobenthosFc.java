package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

import com.base.dal.object.AbstractDO;

public class ZoobenthosFc extends AbstractDO{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.SERIAL_NUMBER
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Integer serialNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.RIVER
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String river;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.SECTION_ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.SAMPLING_POINT
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String samplingPoint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.LONGITUDE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.LATITUDE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.MONITOR_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Date monitorTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.MEASURE_LINE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String measureLine;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.WATER_DEPTH
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Double waterDepth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.PHYLUM
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String phylum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.GENUS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String genus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.SPECIES_NAME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String speciesName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.DENSITY
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Double density;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.BIOMASS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Double biomass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.CREATE_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.MODIFY_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.REMARKS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZOOBENTHOS_FC.REPORT_ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    private String reportId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.ID
     *
     * @return the value of ZOOBENTHOS_FC.ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.ID
     *
     * @param id the value for ZOOBENTHOS_FC.ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.SERIAL_NUMBER
     *
     * @return the value of ZOOBENTHOS_FC.SERIAL_NUMBER
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Integer getSerialNumber() {
        return serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.SERIAL_NUMBER
     *
     * @param serialNumber the value for ZOOBENTHOS_FC.SERIAL_NUMBER
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.RIVER
     *
     * @return the value of ZOOBENTHOS_FC.RIVER
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getRiver() {
        return river;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.RIVER
     *
     * @param river the value for ZOOBENTHOS_FC.RIVER
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setRiver(String river) {
        this.river = river == null ? null : river.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.SECTION_ID
     *
     * @return the value of ZOOBENTHOS_FC.SECTION_ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.SECTION_ID
     *
     * @param sectionId the value for ZOOBENTHOS_FC.SECTION_ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.SAMPLING_POINT
     *
     * @return the value of ZOOBENTHOS_FC.SAMPLING_POINT
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getSamplingPoint() {
        return samplingPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.SAMPLING_POINT
     *
     * @param samplingPoint the value for ZOOBENTHOS_FC.SAMPLING_POINT
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setSamplingPoint(String samplingPoint) {
        this.samplingPoint = samplingPoint == null ? null : samplingPoint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.LONGITUDE
     *
     * @return the value of ZOOBENTHOS_FC.LONGITUDE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.LONGITUDE
     *
     * @param longitude the value for ZOOBENTHOS_FC.LONGITUDE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.LATITUDE
     *
     * @return the value of ZOOBENTHOS_FC.LATITUDE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.LATITUDE
     *
     * @param latitude the value for ZOOBENTHOS_FC.LATITUDE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.MONITOR_TIME
     *
     * @return the value of ZOOBENTHOS_FC.MONITOR_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Date getMonitorTime() {
        return monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.MONITOR_TIME
     *
     * @param monitorTime the value for ZOOBENTHOS_FC.MONITOR_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.MEASURE_LINE
     *
     * @return the value of ZOOBENTHOS_FC.MEASURE_LINE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getMeasureLine() {
        return measureLine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.MEASURE_LINE
     *
     * @param measureLine the value for ZOOBENTHOS_FC.MEASURE_LINE
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setMeasureLine(String measureLine) {
        this.measureLine = measureLine == null ? null : measureLine.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.WATER_DEPTH
     *
     * @return the value of ZOOBENTHOS_FC.WATER_DEPTH
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Double getWaterDepth() {
        return waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.WATER_DEPTH
     *
     * @param waterDepth the value for ZOOBENTHOS_FC.WATER_DEPTH
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setWaterDepth(Double waterDepth) {
        this.waterDepth = waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.PHYLUM
     *
     * @return the value of ZOOBENTHOS_FC.PHYLUM
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getPhylum() {
        return phylum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.PHYLUM
     *
     * @param phylum the value for ZOOBENTHOS_FC.PHYLUM
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setPhylum(String phylum) {
        this.phylum = phylum == null ? null : phylum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.GENUS
     *
     * @return the value of ZOOBENTHOS_FC.GENUS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getGenus() {
        return genus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.GENUS
     *
     * @param genus the value for ZOOBENTHOS_FC.GENUS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setGenus(String genus) {
        this.genus = genus == null ? null : genus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.SPECIES_NAME
     *
     * @return the value of ZOOBENTHOS_FC.SPECIES_NAME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getSpeciesName() {
        return speciesName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.SPECIES_NAME
     *
     * @param speciesName the value for ZOOBENTHOS_FC.SPECIES_NAME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName == null ? null : speciesName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.DENSITY
     *
     * @return the value of ZOOBENTHOS_FC.DENSITY
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Double getDensity() {
        return density;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.DENSITY
     *
     * @param density the value for ZOOBENTHOS_FC.DENSITY
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setDensity(Double density) {
        this.density = density;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.BIOMASS
     *
     * @return the value of ZOOBENTHOS_FC.BIOMASS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Double getBiomass() {
        return biomass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.BIOMASS
     *
     * @param biomass the value for ZOOBENTHOS_FC.BIOMASS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setBiomass(Double biomass) {
        this.biomass = biomass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.CREATE_TIME
     *
     * @return the value of ZOOBENTHOS_FC.CREATE_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.CREATE_TIME
     *
     * @param createTime the value for ZOOBENTHOS_FC.CREATE_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.MODIFY_TIME
     *
     * @return the value of ZOOBENTHOS_FC.MODIFY_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.MODIFY_TIME
     *
     * @param modifyTime the value for ZOOBENTHOS_FC.MODIFY_TIME
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.REMARKS
     *
     * @return the value of ZOOBENTHOS_FC.REMARKS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.REMARKS
     *
     * @param remarks the value for ZOOBENTHOS_FC.REMARKS
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZOOBENTHOS_FC.REPORT_ID
     *
     * @return the value of ZOOBENTHOS_FC.REPORT_ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZOOBENTHOS_FC.REPORT_ID
     *
     * @param reportId the value for ZOOBENTHOS_FC.REPORT_ID
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }
}