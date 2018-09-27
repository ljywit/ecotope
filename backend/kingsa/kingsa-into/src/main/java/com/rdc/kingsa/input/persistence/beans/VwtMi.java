package com.rdc.kingsa.input.persistence.beans;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("垂向水温监测信息")
public class VwtMi {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SWT_MI.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("主键ID")
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SWT_MI.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("断面ID")
    private String sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SWT_MI.MONITOR_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("监测时间")
    private Date monitorTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VWT_MI.WATER_DEPTH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("水深")
    private BigDecimal waterDepth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SWT_MI.WATER_TEMPER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("水温")
    private BigDecimal waterTemper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SWT_MI.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("记录创建时间")
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SWT_MI.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("修改时间")
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SWT_MI.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("备注信息")
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VWT_MI.WATER_LEVEL
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("WaterLevel")
    private BigDecimal waterLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.ID
     *
     * @return the value of VWT_MI.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.ID
     *
     * @param id the value for VWT_MI.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.SECTION_ID
     *
     * @return the value of VWT_MI.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.SECTION_ID
     *
     * @param sectionId the value for VWT_MI.SECTION_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.MONITOR_TIME
     *
     * @return the value of VWT_MI.MONITOR_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getMonitorTime() {
        return monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.MONITOR_TIME
     *
     * @param monitorTime the value for VWT_MI.MONITOR_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.WATER_DEPTH
     *
     * @return the value of VWT_MI.WATER_DEPTH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getWaterDepth() {
        return waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.WATER_DEPTH
     *
     * @param waterDepth the value for VWT_MI.WATER_DEPTH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWaterDepth(BigDecimal waterDepth) {
        this.waterDepth = waterDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.WATER_TEMPER
     *
     * @return the value of VWT_MI.WATER_TEMPER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getWaterTemper() {
        return waterTemper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.WATER_TEMPER
     *
     * @param waterTemper the value for VWT_MI.WATER_TEMPER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWaterTemper(BigDecimal waterTemper) {
        this.waterTemper = waterTemper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.CREATE_TIME
     *
     * @return the value of VWT_MI.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.CREATE_TIME
     *
     * @param createTime the value for VWT_MI.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.MODIFY_TIME
     *
     * @return the value of VWT_MI.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.MODIFY_TIME
     *
     * @param modifyTime the value for VWT_MI.MODIFY_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.REMARKS
     *
     * @return the value of VWT_MI.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.REMARKS
     *
     * @param remarks the value for VWT_MI.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VWT_MI.WATER_LEVEL
     *
     * @return the value of VWT_MI.WATER_LEVEL
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public BigDecimal getWaterLevel() {
        return waterLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VWT_MI.WATER_LEVEL
     *
     * @param waterLevel the value for VWT_MI.WATER_LEVEL
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setWaterLevel(BigDecimal waterLevel) {
        this.waterLevel = waterLevel;
    }
}