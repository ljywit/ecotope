package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

import com.base.dal.object.AbstractDO;

public class ReproductionEcologyFc extends AbstractDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.ID
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.SECTION_ID
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private String sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.SECTION_NAME
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private String sectionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.MONITOR_TIME
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Date monitorTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.FRY_NUMBER
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Integer fryNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.FRY_RUNOFF
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Double fryRunoff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.WATER_TEMP
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Double waterTemp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.FRY_FLOWS
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Long fryFlows;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.TRANSPARENCY
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Integer transparency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.DISSOLVE_OXYGEN
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Double dissolveOxygen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.CREATE_TIME
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.MODIFY_TIME
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPRODUCTION_ECOLOGY_FC.REMARKS
     *
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    private String remarks;

    private String reportId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.ID
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.ID
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.ID
     *
     * @param id the value for REPRODUCTION_ECOLOGY_FC.ID
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.SECTION_ID
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.SECTION_ID
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.SECTION_ID
     *
     * @param sectionId the value for REPRODUCTION_ECOLOGY_FC.SECTION_ID
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.SECTION_NAME
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.SECTION_NAME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.SECTION_NAME
     *
     * @param sectionName the value for REPRODUCTION_ECOLOGY_FC.SECTION_NAME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.MONITOR_TIME
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.MONITOR_TIME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Date getMonitorTime() {
        return monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.MONITOR_TIME
     *
     * @param monitorTime the value for REPRODUCTION_ECOLOGY_FC.MONITOR_TIME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.FRY_NUMBER
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.FRY_NUMBER
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Integer getFryNumber() {
        return fryNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.FRY_NUMBER
     *
     * @param fryNumber the value for REPRODUCTION_ECOLOGY_FC.FRY_NUMBER
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setFryNumber(Integer fryNumber) {
        this.fryNumber = fryNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.FRY_RUNOFF
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.FRY_RUNOFF
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Double getFryRunoff() {
        return fryRunoff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.FRY_RUNOFF
     *
     * @param fryRunoff the value for REPRODUCTION_ECOLOGY_FC.FRY_RUNOFF
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setFryRunoff(Double fryRunoff) {
        this.fryRunoff = fryRunoff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.WATER_TEMP
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.WATER_TEMP
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Double getWaterTemp() {
        return waterTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.WATER_TEMP
     *
     * @param waterTemp the value for REPRODUCTION_ECOLOGY_FC.WATER_TEMP
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setWaterTemp(Double waterTemp) {
        this.waterTemp = waterTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.FRY_FLOWS
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.FRY_FLOWS
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Long getFryFlows() {
        return fryFlows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.FRY_FLOWS
     *
     * @param fryFlows the value for REPRODUCTION_ECOLOGY_FC.FRY_FLOWS
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setFryFlows(Long fryFlows) {
        this.fryFlows = fryFlows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.TRANSPARENCY
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.TRANSPARENCY
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Integer getTransparency() {
        return transparency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.TRANSPARENCY
     *
     * @param transparency the value for REPRODUCTION_ECOLOGY_FC.TRANSPARENCY
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setTransparency(Integer transparency) {
        this.transparency = transparency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.DISSOLVE_OXYGEN
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.DISSOLVE_OXYGEN
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Double getDissolveOxygen() {
        return dissolveOxygen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.DISSOLVE_OXYGEN
     *
     * @param dissolveOxygen the value for REPRODUCTION_ECOLOGY_FC.DISSOLVE_OXYGEN
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setDissolveOxygen(Double dissolveOxygen) {
        this.dissolveOxygen = dissolveOxygen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.CREATE_TIME
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.CREATE_TIME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.CREATE_TIME
     *
     * @param createTime the value for REPRODUCTION_ECOLOGY_FC.CREATE_TIME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.MODIFY_TIME
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.MODIFY_TIME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.MODIFY_TIME
     *
     * @param modifyTime the value for REPRODUCTION_ECOLOGY_FC.MODIFY_TIME
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPRODUCTION_ECOLOGY_FC.REMARKS
     *
     * @return the value of REPRODUCTION_ECOLOGY_FC.REMARKS
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPRODUCTION_ECOLOGY_FC.REMARKS
     *
     * @param remarks the value for REPRODUCTION_ECOLOGY_FC.REMARKS
     * @mbggenerated Sat Sep 29 23:14:58 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 获取 reportId
     *
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * 设置 reportId
     *
     * @param reportId reportId
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }
}