package com.rdc.kingsa.input.persistence.beans;

import java.math.BigDecimal;
import java.util.Date;

public class FdaMonitorValWind {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.MONITOR_SPOT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String monitorSpotId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.MONITOR_RECORD_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String monitorRecordId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.WIND_SPEED
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal windSpeed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.DURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal duration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.WIND_TYPE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String windType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FDA_MONITOR_VAL_WIND.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.ID
     *
     * @return the value of FDA_MONITOR_VAL_WIND.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.ID
     *
     * @param id the value for FDA_MONITOR_VAL_WIND.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.MONITOR_SPOT_ID
     *
     * @return the value of FDA_MONITOR_VAL_WIND.MONITOR_SPOT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getMonitorSpotId() {
        return monitorSpotId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.MONITOR_SPOT_ID
     *
     * @param monitorSpotId the value for FDA_MONITOR_VAL_WIND.MONITOR_SPOT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorSpotId(String monitorSpotId) {
        this.monitorSpotId = monitorSpotId == null ? null : monitorSpotId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.MONITOR_RECORD_ID
     *
     * @return the value of FDA_MONITOR_VAL_WIND.MONITOR_RECORD_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getMonitorRecordId() {
        return monitorRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.MONITOR_RECORD_ID
     *
     * @param monitorRecordId the value for FDA_MONITOR_VAL_WIND.MONITOR_RECORD_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorRecordId(String monitorRecordId) {
        this.monitorRecordId = monitorRecordId == null ? null : monitorRecordId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.WIND_SPEED
     *
     * @return the value of FDA_MONITOR_VAL_WIND.WIND_SPEED
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.WIND_SPEED
     *
     * @param windSpeed the value for FDA_MONITOR_VAL_WIND.WIND_SPEED
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.DURATION
     *
     * @return the value of FDA_MONITOR_VAL_WIND.DURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.DURATION
     *
     * @param duration the value for FDA_MONITOR_VAL_WIND.DURATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.WIND_TYPE
     *
     * @return the value of FDA_MONITOR_VAL_WIND.WIND_TYPE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getWindType() {
        return windType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.WIND_TYPE
     *
     * @param windType the value for FDA_MONITOR_VAL_WIND.WIND_TYPE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWindType(String windType) {
        this.windType = windType == null ? null : windType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.CREATE_TIME
     *
     * @return the value of FDA_MONITOR_VAL_WIND.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.CREATE_TIME
     *
     * @param createTime the value for FDA_MONITOR_VAL_WIND.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.MODIFY_TIME
     *
     * @return the value of FDA_MONITOR_VAL_WIND.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.MODIFY_TIME
     *
     * @param modifyTime the value for FDA_MONITOR_VAL_WIND.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FDA_MONITOR_VAL_WIND.REMARKS
     *
     * @return the value of FDA_MONITOR_VAL_WIND.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FDA_MONITOR_VAL_WIND.REMARKS
     *
     * @param remarks the value for FDA_MONITOR_VAL_WIND.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}