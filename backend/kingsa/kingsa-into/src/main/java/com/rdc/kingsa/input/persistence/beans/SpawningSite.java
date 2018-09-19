package com.rdc.kingsa.input.persistence.beans;

import java.math.BigDecimal;
import java.util.Date;

public class SpawningSite {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.DISTANCE_START
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal distanceStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.DISTANCE_END
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private BigDecimal distanceEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.CREATOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.MONITOR_TIME_START
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date monitorTimeStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SPAWNING_SITE.MONITOR_TIME_END
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date monitorTimeEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.ID
     *
     * @return the value of SPAWNING_SITE.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.ID
     *
     * @param id the value for SPAWNING_SITE.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.SECTION_ID
     *
     * @return the value of SPAWNING_SITE.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.SECTION_ID
     *
     * @param sectionId the value for SPAWNING_SITE.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.DISTANCE_START
     *
     * @return the value of SPAWNING_SITE.DISTANCE_START
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getDistanceStart() {
        return distanceStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.DISTANCE_START
     *
     * @param distanceStart the value for SPAWNING_SITE.DISTANCE_START
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDistanceStart(BigDecimal distanceStart) {
        this.distanceStart = distanceStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.DISTANCE_END
     *
     * @return the value of SPAWNING_SITE.DISTANCE_END
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getDistanceEnd() {
        return distanceEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.DISTANCE_END
     *
     * @param distanceEnd the value for SPAWNING_SITE.DISTANCE_END
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setDistanceEnd(BigDecimal distanceEnd) {
        this.distanceEnd = distanceEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.CREATOR
     *
     * @return the value of SPAWNING_SITE.CREATOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.CREATOR
     *
     * @param creator the value for SPAWNING_SITE.CREATOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.CREATE_TIME
     *
     * @return the value of SPAWNING_SITE.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.CREATE_TIME
     *
     * @param createTime the value for SPAWNING_SITE.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.MODIFY_TIME
     *
     * @return the value of SPAWNING_SITE.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.MODIFY_TIME
     *
     * @param modifyTime the value for SPAWNING_SITE.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.REMARKS
     *
     * @return the value of SPAWNING_SITE.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.REMARKS
     *
     * @param remarks the value for SPAWNING_SITE.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.MONITOR_TIME_START
     *
     * @return the value of SPAWNING_SITE.MONITOR_TIME_START
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getMonitorTimeStart() {
        return monitorTimeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.MONITOR_TIME_START
     *
     * @param monitorTimeStart the value for SPAWNING_SITE.MONITOR_TIME_START
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorTimeStart(Date monitorTimeStart) {
        this.monitorTimeStart = monitorTimeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SPAWNING_SITE.MONITOR_TIME_END
     *
     * @return the value of SPAWNING_SITE.MONITOR_TIME_END
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getMonitorTimeEnd() {
        return monitorTimeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SPAWNING_SITE.MONITOR_TIME_END
     *
     * @param monitorTimeEnd the value for SPAWNING_SITE.MONITOR_TIME_END
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorTimeEnd(Date monitorTimeEnd) {
        this.monitorTimeEnd = monitorTimeEnd;
    }
}