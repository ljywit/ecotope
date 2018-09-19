package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

public class SecWqm {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.SERIAL_NUM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short serialNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.MONITOR_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String monitorContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.MONITOR_FREQUENCY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String monitorFrequency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.QA_PLAN_CATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String qaPlanCate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.SAMP
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String samp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.CONFORMANCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String conformance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.FROM_WDD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Double fromWdd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.VALUATION_Q
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short valuationQ;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.VALUATION_S
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short valuationS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.VALUATION_E
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short valuationE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.VALUATION_H
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short valuationH;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.DRAIN_OUTLET
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short drainOutlet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SEC_WQM.QA_PLAN_VAL
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short qaPlanVal;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.ID
     *
     * @return the value of SEC_WQM.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.ID
     *
     * @param id the value for SEC_WQM.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.SECTION_ID
     *
     * @return the value of SEC_WQM.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.SECTION_ID
     *
     * @param sectionId the value for SEC_WQM.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.SERIAL_NUM
     *
     * @return the value of SEC_WQM.SERIAL_NUM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getSerialNum() {
        return serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.SERIAL_NUM
     *
     * @param serialNum the value for SEC_WQM.SERIAL_NUM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.MONITOR_CONTENT
     *
     * @return the value of SEC_WQM.MONITOR_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getMonitorContent() {
        return monitorContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.MONITOR_CONTENT
     *
     * @param monitorContent the value for SEC_WQM.MONITOR_CONTENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorContent(String monitorContent) {
        this.monitorContent = monitorContent == null ? null : monitorContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.MONITOR_FREQUENCY
     *
     * @return the value of SEC_WQM.MONITOR_FREQUENCY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getMonitorFrequency() {
        return monitorFrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.MONITOR_FREQUENCY
     *
     * @param monitorFrequency the value for SEC_WQM.MONITOR_FREQUENCY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorFrequency(String monitorFrequency) {
        this.monitorFrequency = monitorFrequency == null ? null : monitorFrequency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.QA_PLAN_CATE
     *
     * @return the value of SEC_WQM.QA_PLAN_CATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getQaPlanCate() {
        return qaPlanCate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.QA_PLAN_CATE
     *
     * @param qaPlanCate the value for SEC_WQM.QA_PLAN_CATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setQaPlanCate(String qaPlanCate) {
        this.qaPlanCate = qaPlanCate == null ? null : qaPlanCate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.SAMP
     *
     * @return the value of SEC_WQM.SAMP
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSamp() {
        return samp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.SAMP
     *
     * @param samp the value for SEC_WQM.SAMP
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSamp(String samp) {
        this.samp = samp == null ? null : samp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.CONFORMANCE
     *
     * @return the value of SEC_WQM.CONFORMANCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getConformance() {
        return conformance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.CONFORMANCE
     *
     * @param conformance the value for SEC_WQM.CONFORMANCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setConformance(String conformance) {
        this.conformance = conformance == null ? null : conformance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.FROM_WDD
     *
     * @return the value of SEC_WQM.FROM_WDD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Double getFromWdd() {
        return fromWdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.FROM_WDD
     *
     * @param fromWdd the value for SEC_WQM.FROM_WDD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.VALUATION_Q
     *
     * @return the value of SEC_WQM.VALUATION_Q
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getValuationQ() {
        return valuationQ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.VALUATION_Q
     *
     * @param valuationQ the value for SEC_WQM.VALUATION_Q
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setValuationQ(Short valuationQ) {
        this.valuationQ = valuationQ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.VALUATION_S
     *
     * @return the value of SEC_WQM.VALUATION_S
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getValuationS() {
        return valuationS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.VALUATION_S
     *
     * @param valuationS the value for SEC_WQM.VALUATION_S
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setValuationS(Short valuationS) {
        this.valuationS = valuationS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.VALUATION_E
     *
     * @return the value of SEC_WQM.VALUATION_E
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getValuationE() {
        return valuationE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.VALUATION_E
     *
     * @param valuationE the value for SEC_WQM.VALUATION_E
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setValuationE(Short valuationE) {
        this.valuationE = valuationE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.VALUATION_H
     *
     * @return the value of SEC_WQM.VALUATION_H
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getValuationH() {
        return valuationH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.VALUATION_H
     *
     * @param valuationH the value for SEC_WQM.VALUATION_H
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setValuationH(Short valuationH) {
        this.valuationH = valuationH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.CREATE_TIME
     *
     * @return the value of SEC_WQM.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.CREATE_TIME
     *
     * @param createTime the value for SEC_WQM.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.MODIFY_TIME
     *
     * @return the value of SEC_WQM.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.MODIFY_TIME
     *
     * @param modifyTime the value for SEC_WQM.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.REMARKS
     *
     * @return the value of SEC_WQM.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.REMARKS
     *
     * @param remarks the value for SEC_WQM.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.DRAIN_OUTLET
     *
     * @return the value of SEC_WQM.DRAIN_OUTLET
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getDrainOutlet() {
        return drainOutlet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.DRAIN_OUTLET
     *
     * @param drainOutlet the value for SEC_WQM.DRAIN_OUTLET
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDrainOutlet(Short drainOutlet) {
        this.drainOutlet = drainOutlet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SEC_WQM.QA_PLAN_VAL
     *
     * @return the value of SEC_WQM.QA_PLAN_VAL
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getQaPlanVal() {
        return qaPlanVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SEC_WQM.QA_PLAN_VAL
     *
     * @param qaPlanVal the value for SEC_WQM.QA_PLAN_VAL
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setQaPlanVal(Short qaPlanVal) {
        this.qaPlanVal = qaPlanVal;
    }
}