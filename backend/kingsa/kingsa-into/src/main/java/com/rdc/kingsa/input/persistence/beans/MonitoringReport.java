package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

import com.base.dal.object.AbstractDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测数据填报记录")
public class MonitoringReport extends AbstractDO{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("主键")
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.REPORTER_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("填报人ID")
    private String reporterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.REPORTER_R_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("填报人真实姓名")
    private String reporterRName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.REPORTER_USER_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("填报人系统用户名")
    private String reporterUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.REPORT_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("填报时间")
    private Date reportTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.EXPLANATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("数据说明")
    private String explanation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.MODIFICATION_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    @ApiModelProperty("修改时间")
    private Date modificationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.REPORT_TITLE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String reportTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.AUTHOR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.REVISER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String reviser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.CHECKER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String checker;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MONITORING_REPORT.PUBLISHER
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String publisher;

    @ApiModelProperty("监测因子类型")
    private int type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.ID
     *
     * @return the value of MONITORING_REPORT.ID
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.ID
     *
     * @param id the value for MONITORING_REPORT.ID
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.REPORTER_ID
     *
     * @return the value of MONITORING_REPORT.REPORTER_ID
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getReporterId() {
        return reporterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.REPORTER_ID
     *
     * @param reporterId the value for MONITORING_REPORT.REPORTER_ID
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setReporterId(String reporterId) {
        this.reporterId = reporterId == null ? null : reporterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.REPORTER_R_NAME
     *
     * @return the value of MONITORING_REPORT.REPORTER_R_NAME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getReporterRName() {
        return reporterRName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.REPORTER_R_NAME
     *
     * @param reporterRName the value for MONITORING_REPORT.REPORTER_R_NAME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setReporterRName(String reporterRName) {
        this.reporterRName = reporterRName == null ? null : reporterRName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.REPORTER_USER_NAME
     *
     * @return the value of MONITORING_REPORT.REPORTER_USER_NAME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getReporterUserName() {
        return reporterUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.REPORTER_USER_NAME
     *
     * @param reporterUserName the value for MONITORING_REPORT.REPORTER_USER_NAME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setReporterUserName(String reporterUserName) {
        this.reporterUserName = reporterUserName == null ? null : reporterUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.REPORT_TIME
     *
     * @return the value of MONITORING_REPORT.REPORT_TIME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getReportTime() {
        return reportTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.REPORT_TIME
     *
     * @param reportTime the value for MONITORING_REPORT.REPORT_TIME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.EXPLANATION
     *
     * @return the value of MONITORING_REPORT.EXPLANATION
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.EXPLANATION
     *
     * @param explanation the value for MONITORING_REPORT.EXPLANATION
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation == null ? null : explanation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.MODIFICATION_TIME
     *
     * @return the value of MONITORING_REPORT.MODIFICATION_TIME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getModificationTime() {
        return modificationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.MODIFICATION_TIME
     *
     * @param modificationTime the value for MONITORING_REPORT.MODIFICATION_TIME
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.REPORT_TITLE
     *
     * @return the value of MONITORING_REPORT.REPORT_TITLE
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.REPORT_TITLE
     *
     * @param reportTitle the value for MONITORING_REPORT.REPORT_TITLE
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.AUTHOR
     *
     * @return the value of MONITORING_REPORT.AUTHOR
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.AUTHOR
     *
     * @param author the value for MONITORING_REPORT.AUTHOR
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.REVISER
     *
     * @return the value of MONITORING_REPORT.REVISER
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getReviser() {
        return reviser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.REVISER
     *
     * @param reviser the value for MONITORING_REPORT.REVISER
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setReviser(String reviser) {
        this.reviser = reviser == null ? null : reviser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.CHECKER
     *
     * @return the value of MONITORING_REPORT.CHECKER
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getChecker() {
        return checker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.CHECKER
     *
     * @param checker the value for MONITORING_REPORT.CHECKER
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MONITORING_REPORT.PUBLISHER
     *
     * @return the value of MONITORING_REPORT.PUBLISHER
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MONITORING_REPORT.PUBLISHER
     *
     * @param publisher the value for MONITORING_REPORT.PUBLISHER
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    /**
     * 获取 type
     *
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * 设置 type
     *
     * @param type type
     */
    public void setType(int type) {
        this.type = type;
    }
}