package com.rdc.kingsa.model.vo.section;

public class WaterTemperatureSectionVO extends SectionBaseInfo {

    private String monitorContent;

    private String description;

    private String monitorType;

    private String riverLink;

    private Double fromWdd;

    public String getMonitorContent() {
        return monitorContent;
    }

    public void setMonitorContent(String monitorContent) {
        this.monitorContent = monitorContent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public String getRiverLink() {
        return riverLink;
    }

    public void setRiverLink(String riverLink) {
        this.riverLink = riverLink;
    }

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }
}