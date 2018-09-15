package com.rdc.kingsa.model.dto.water.quality;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by lxf on 18/7/18.
 */
@ApiModel("水质监测数据填报信息")
public class WaterQualityFCReportView {

    @ApiModelProperty("报告名称")
    private String reportTitle;

    @ApiModelProperty("填报人id")
    private String reporterId;

    @ApiModelProperty("填报人真实姓名")
    private String reporterRName;

    @ApiModelProperty("填报人系统中用户名")
    private String reporterUserName;

    @ApiModelProperty("数据说明")
    private String explanation;

    @ApiModelProperty("编制")
    private String author;

    @ApiModelProperty("校核")
    private String reviser;

    @ApiModelProperty("审核")
    private String checker;

    @ApiModelProperty("签发")
    private String publisher;

    @ApiModelProperty("监测数据")
    private List<WaterQualityFCView> monitoringDatas;

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReporterId() {
        return reporterId;
    }

    public void setReporterId(String reporterId) {
        this.reporterId = reporterId;
    }

    public String getReporterRName() {
        return reporterRName;
    }

    public void setReporterRName(String reporterRName) {
        this.reporterRName = reporterRName;
    }

    public String getReporterUserName() {
        return reporterUserName;
    }

    public void setReporterUserName(String reporterUserName) {
        this.reporterUserName = reporterUserName;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public List<WaterQualityFCView> getMonitoringDatas() {
        return monitoringDatas;
    }

    public void setMonitoringDatas(List<WaterQualityFCView> monitoringDatas) {
        this.monitoringDatas = monitoringDatas;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviser() {
        return reviser;
    }

    public void setReviser(String reviser) {
        this.reviser = reviser;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
