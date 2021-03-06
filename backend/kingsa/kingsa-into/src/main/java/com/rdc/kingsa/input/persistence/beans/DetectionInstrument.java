package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

public class DetectionInstrument {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.SOURCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.SERIAL_NUM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Short serialNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.DETECT_ITEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String detectItem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.DETECT_METHOD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String detectMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.METHOD_SOURCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String methodSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DETECTION_INSTRUMENT.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.ID
     *
     * @return the value of DETECTION_INSTRUMENT.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.ID
     *
     * @param id the value for DETECTION_INSTRUMENT.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.SOURCE
     *
     * @return the value of DETECTION_INSTRUMENT.SOURCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.SOURCE
     *
     * @param source the value for DETECTION_INSTRUMENT.SOURCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.SERIAL_NUM
     *
     * @return the value of DETECTION_INSTRUMENT.SERIAL_NUM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Short getSerialNum() {
        return serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.SERIAL_NUM
     *
     * @param serialNum the value for DETECTION_INSTRUMENT.SERIAL_NUM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.DETECT_ITEM
     *
     * @return the value of DETECTION_INSTRUMENT.DETECT_ITEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getDetectItem() {
        return detectItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.DETECT_ITEM
     *
     * @param detectItem the value for DETECTION_INSTRUMENT.DETECT_ITEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDetectItem(String detectItem) {
        this.detectItem = detectItem == null ? null : detectItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.DETECT_METHOD
     *
     * @return the value of DETECTION_INSTRUMENT.DETECT_METHOD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getDetectMethod() {
        return detectMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.DETECT_METHOD
     *
     * @param detectMethod the value for DETECTION_INSTRUMENT.DETECT_METHOD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDetectMethod(String detectMethod) {
        this.detectMethod = detectMethod == null ? null : detectMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.METHOD_SOURCE
     *
     * @return the value of DETECTION_INSTRUMENT.METHOD_SOURCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getMethodSource() {
        return methodSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.METHOD_SOURCE
     *
     * @param methodSource the value for DETECTION_INSTRUMENT.METHOD_SOURCE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMethodSource(String methodSource) {
        this.methodSource = methodSource == null ? null : methodSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.CREATE_TIME
     *
     * @return the value of DETECTION_INSTRUMENT.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.CREATE_TIME
     *
     * @param createTime the value for DETECTION_INSTRUMENT.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.MODIFY_TIME
     *
     * @return the value of DETECTION_INSTRUMENT.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.MODIFY_TIME
     *
     * @param modifyTime the value for DETECTION_INSTRUMENT.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DETECTION_INSTRUMENT.REMARKS
     *
     * @return the value of DETECTION_INSTRUMENT.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DETECTION_INSTRUMENT.REMARKS
     *
     * @param remarks the value for DETECTION_INSTRUMENT.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}