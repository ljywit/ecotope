package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

import com.base.dal.object.AbstractDO;

public class GssMi extends AbstractDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.SECTION_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String sectionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.MONITOR_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date monitorTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.MEASURE_LINE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String measureLine;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.PRESSURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double pressure;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.WATER_DEPTH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double waterDepth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.WATER_TEMPER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double waterTemper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DO_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double doInstrument;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DO_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double doContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DN_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double dnContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DO_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double doSaturation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DN_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double dnSaturation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DO1
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double do1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DO2
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double do2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DO3
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double do3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.TITRATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double titration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.DO_SAT_INST
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double doSatInst;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.TDG_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double tdgSaturation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_MI.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.ID
     *
     * @return the value of GSS_MI.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.ID
     *
     * @param id the value for GSS_MI.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.SECTION_ID
     *
     * @return the value of GSS_MI.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.SECTION_ID
     *
     * @param sectionId the value for GSS_MI.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.SECTION_NAME
     *
     * @return the value of GSS_MI.SECTION_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.SECTION_NAME
     *
     * @param sectionName the value for GSS_MI.SECTION_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.MONITOR_TIME
     *
     * @return the value of GSS_MI.MONITOR_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getMonitorTime() {
        return monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.MONITOR_TIME
     *
     * @param monitorTime the value for GSS_MI.MONITOR_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.MEASURE_LINE
     *
     * @return the value of GSS_MI.MEASURE_LINE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getMeasureLine() {
        return measureLine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.MEASURE_LINE
     *
     * @param measureLine the value for GSS_MI.MEASURE_LINE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMeasureLine(String measureLine) {
        this.measureLine = measureLine == null ? null : measureLine.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.PRESSURE
     *
     * @return the value of GSS_MI.PRESSURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getPressure() {
        return pressure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.PRESSURE
     *
     * @param pressure the value for GSS_MI.PRESSURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.WATER_DEPTH
     *
     * @return the value of GSS_MI.WATER_DEPTH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getWaterDepth() {
        return waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.WATER_DEPTH
     *
     * @param waterDepth the value for GSS_MI.WATER_DEPTH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWaterDepth(Double waterDepth) {
        this.waterDepth = waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.WATER_TEMPER
     *
     * @return the value of GSS_MI.WATER_TEMPER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getWaterTemper() {
        return waterTemper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.WATER_TEMPER
     *
     * @param waterTemper the value for GSS_MI.WATER_TEMPER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWaterTemper(Double waterTemper) {
        this.waterTemper = waterTemper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DO_INSTRUMENT
     *
     * @return the value of GSS_MI.DO_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDoInstrument() {
        return doInstrument;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DO_INSTRUMENT
     *
     * @param doInstrument the value for GSS_MI.DO_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDoInstrument(Double doInstrument) {
        this.doInstrument = doInstrument;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DO_CONTENT
     *
     * @return the value of GSS_MI.DO_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDoContent() {
        return doContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DO_CONTENT
     *
     * @param doContent the value for GSS_MI.DO_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDoContent(Double doContent) {
        this.doContent = doContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DN_CONTENT
     *
     * @return the value of GSS_MI.DN_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDnContent() {
        return dnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DN_CONTENT
     *
     * @param dnContent the value for GSS_MI.DN_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDnContent(Double dnContent) {
        this.dnContent = dnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DO_SATURATION
     *
     * @return the value of GSS_MI.DO_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDoSaturation() {
        return doSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DO_SATURATION
     *
     * @param doSaturation the value for GSS_MI.DO_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDoSaturation(Double doSaturation) {
        this.doSaturation = doSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DN_SATURATION
     *
     * @return the value of GSS_MI.DN_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDnSaturation() {
        return dnSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DN_SATURATION
     *
     * @param dnSaturation the value for GSS_MI.DN_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDnSaturation(Double dnSaturation) {
        this.dnSaturation = dnSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DO1
     *
     * @return the value of GSS_MI.DO1
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDo1() {
        return do1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DO1
     *
     * @param do1 the value for GSS_MI.DO1
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDo1(Double do1) {
        this.do1 = do1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DO2
     *
     * @return the value of GSS_MI.DO2
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDo2() {
        return do2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DO2
     *
     * @param do2 the value for GSS_MI.DO2
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDo2(Double do2) {
        this.do2 = do2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DO3
     *
     * @return the value of GSS_MI.DO3
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDo3() {
        return do3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DO3
     *
     * @param do3 the value for GSS_MI.DO3
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDo3(Double do3) {
        this.do3 = do3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.TITRATION
     *
     * @return the value of GSS_MI.TITRATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getTitration() {
        return titration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.TITRATION
     *
     * @param titration the value for GSS_MI.TITRATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setTitration(Double titration) {
        this.titration = titration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.DO_SAT_INST
     *
     * @return the value of GSS_MI.DO_SAT_INST
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getDoSatInst() {
        return doSatInst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.DO_SAT_INST
     *
     * @param doSatInst the value for GSS_MI.DO_SAT_INST
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDoSatInst(Double doSatInst) {
        this.doSatInst = doSatInst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.TDG_SATURATION
     *
     * @return the value of GSS_MI.TDG_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getTdgSaturation() {
        return tdgSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.TDG_SATURATION
     *
     * @param tdgSaturation the value for GSS_MI.TDG_SATURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setTdgSaturation(Double tdgSaturation) {
        this.tdgSaturation = tdgSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.CREATE_TIME
     *
     * @return the value of GSS_MI.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.CREATE_TIME
     *
     * @param createTime the value for GSS_MI.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.MODIFY_TIME
     *
     * @return the value of GSS_MI.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.MODIFY_TIME
     *
     * @param modifyTime the value for GSS_MI.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_MI.REMARKS
     *
     * @return the value of GSS_MI.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_MI.REMARKS
     *
     * @param remarks the value for GSS_MI.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}