package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

import com.base.dal.object.AbstractDO;

public class GssFc extends AbstractDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.ID
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.SECTION_ID
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private String sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.SECTION_NAME
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private String sectionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.MONITOR_TIME
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Date monitorTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.MEASURE_LINE
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private String measureLine;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.PRESSURE
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double pressure;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.WATER_DEPTH
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double waterDepth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.WATER_TEMPER
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double waterTemper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DO_INSTRUMENT
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double doInstrument;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DO_CONTENT
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double doContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DN_CONTENT
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double dnContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DO_SATURATION
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double doSaturation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DN_SATURATION
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double dnSaturation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DO1
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double do1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DO2
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double do2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DO3
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double do3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.TITRATION
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double titration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.DO_SAT_INST
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double doSatInst;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.TDG_SATURATION
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Double tdgSaturation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.CREATE_TIME
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.MODIFY_TIME
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.REMARKS
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GSS_FC.REPORT_ID
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    private String reportId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.ID
     *
     * @return the value of GSS_FC.ID
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.ID
     *
     * @param id the value for GSS_FC.ID
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.SECTION_ID
     *
     * @return the value of GSS_FC.SECTION_ID
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.SECTION_ID
     *
     * @param sectionId the value for GSS_FC.SECTION_ID
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.SECTION_NAME
     *
     * @return the value of GSS_FC.SECTION_NAME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.SECTION_NAME
     *
     * @param sectionName the value for GSS_FC.SECTION_NAME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.MONITOR_TIME
     *
     * @return the value of GSS_FC.MONITOR_TIME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Date getMonitorTime() {
        return monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.MONITOR_TIME
     *
     * @param monitorTime the value for GSS_FC.MONITOR_TIME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.MEASURE_LINE
     *
     * @return the value of GSS_FC.MEASURE_LINE
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public String getMeasureLine() {
        return measureLine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.MEASURE_LINE
     *
     * @param measureLine the value for GSS_FC.MEASURE_LINE
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setMeasureLine(String measureLine) {
        this.measureLine = measureLine == null ? null : measureLine.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.PRESSURE
     *
     * @return the value of GSS_FC.PRESSURE
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getPressure() {
        return pressure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.PRESSURE
     *
     * @param pressure the value for GSS_FC.PRESSURE
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.WATER_DEPTH
     *
     * @return the value of GSS_FC.WATER_DEPTH
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getWaterDepth() {
        return waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.WATER_DEPTH
     *
     * @param waterDepth the value for GSS_FC.WATER_DEPTH
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setWaterDepth(Double waterDepth) {
        this.waterDepth = waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.WATER_TEMPER
     *
     * @return the value of GSS_FC.WATER_TEMPER
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getWaterTemper() {
        return waterTemper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.WATER_TEMPER
     *
     * @param waterTemper the value for GSS_FC.WATER_TEMPER
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setWaterTemper(Double waterTemper) {
        this.waterTemper = waterTemper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DO_INSTRUMENT
     *
     * @return the value of GSS_FC.DO_INSTRUMENT
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDoInstrument() {
        return doInstrument;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DO_INSTRUMENT
     *
     * @param doInstrument the value for GSS_FC.DO_INSTRUMENT
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDoInstrument(Double doInstrument) {
        this.doInstrument = doInstrument;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DO_CONTENT
     *
     * @return the value of GSS_FC.DO_CONTENT
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDoContent() {
        return doContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DO_CONTENT
     *
     * @param doContent the value for GSS_FC.DO_CONTENT
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDoContent(Double doContent) {
        this.doContent = doContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DN_CONTENT
     *
     * @return the value of GSS_FC.DN_CONTENT
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDnContent() {
        return dnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DN_CONTENT
     *
     * @param dnContent the value for GSS_FC.DN_CONTENT
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDnContent(Double dnContent) {
        this.dnContent = dnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DO_SATURATION
     *
     * @return the value of GSS_FC.DO_SATURATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDoSaturation() {
        return doSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DO_SATURATION
     *
     * @param doSaturation the value for GSS_FC.DO_SATURATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDoSaturation(Double doSaturation) {
        this.doSaturation = doSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DN_SATURATION
     *
     * @return the value of GSS_FC.DN_SATURATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDnSaturation() {
        return dnSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DN_SATURATION
     *
     * @param dnSaturation the value for GSS_FC.DN_SATURATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDnSaturation(Double dnSaturation) {
        this.dnSaturation = dnSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DO1
     *
     * @return the value of GSS_FC.DO1
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDo1() {
        return do1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DO1
     *
     * @param do1 the value for GSS_FC.DO1
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDo1(Double do1) {
        this.do1 = do1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DO2
     *
     * @return the value of GSS_FC.DO2
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDo2() {
        return do2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DO2
     *
     * @param do2 the value for GSS_FC.DO2
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDo2(Double do2) {
        this.do2 = do2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DO3
     *
     * @return the value of GSS_FC.DO3
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDo3() {
        return do3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DO3
     *
     * @param do3 the value for GSS_FC.DO3
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDo3(Double do3) {
        this.do3 = do3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.TITRATION
     *
     * @return the value of GSS_FC.TITRATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getTitration() {
        return titration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.TITRATION
     *
     * @param titration the value for GSS_FC.TITRATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setTitration(Double titration) {
        this.titration = titration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.DO_SAT_INST
     *
     * @return the value of GSS_FC.DO_SAT_INST
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getDoSatInst() {
        return doSatInst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.DO_SAT_INST
     *
     * @param doSatInst the value for GSS_FC.DO_SAT_INST
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setDoSatInst(Double doSatInst) {
        this.doSatInst = doSatInst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.TDG_SATURATION
     *
     * @return the value of GSS_FC.TDG_SATURATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Double getTdgSaturation() {
        return tdgSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.TDG_SATURATION
     *
     * @param tdgSaturation the value for GSS_FC.TDG_SATURATION
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setTdgSaturation(Double tdgSaturation) {
        this.tdgSaturation = tdgSaturation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.CREATE_TIME
     *
     * @return the value of GSS_FC.CREATE_TIME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.CREATE_TIME
     *
     * @param createTime the value for GSS_FC.CREATE_TIME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.MODIFY_TIME
     *
     * @return the value of GSS_FC.MODIFY_TIME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.MODIFY_TIME
     *
     * @param modifyTime the value for GSS_FC.MODIFY_TIME
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.REMARKS
     *
     * @return the value of GSS_FC.REMARKS
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.REMARKS
     *
     * @param remarks the value for GSS_FC.REMARKS
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GSS_FC.REPORT_ID
     *
     * @return the value of GSS_FC.REPORT_ID
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GSS_FC.REPORT_ID
     *
     * @param reportId the value for GSS_FC.REPORT_ID
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }
}