package com.rdc.kingsa.model.entity.monitor;

import java.util.Date;

public class MonitoringReport {
    private String id;

    private String reporterId;

    private String reporterRName;

    private String reporterUserName;

    private Date reportTime;

    private String explanation;

    private Date modificationTime;

    private String reportTitle;

    private String author;

    private String reviser;

    private String checker;

    private String publisher;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getReporterId() {
        return reporterId;
    }

    public void setReporterId(String reporterId) {
        this.reporterId = reporterId == null ? null : reporterId.trim();
    }

    public String getReporterRName() {
        return reporterRName;
    }

    public void setReporterRName(String reporterRName) {
        this.reporterRName = reporterRName == null ? null : reporterRName.trim();
    }

    public String getReporterUserName() {
        return reporterUserName;
    }

    public void setReporterUserName(String reporterUserName) {
        this.reporterUserName = reporterUserName == null ? null : reporterUserName.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation == null ? null : explanation.trim();
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getReviser() {
        return reviser;
    }

    public void setReviser(String reviser) {
        this.reviser = reviser == null ? null : reviser.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }
}