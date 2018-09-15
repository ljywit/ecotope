package com.rdc.kingsa.model.vo.section;

public class SectionBaseInfo {
    private String id;

    private String sectionId;

    private String sectionName;

    private Short serialNum;

    private Short riverType;

    private String location;

    private String belongRiver;

    private Double longitude;

    private Double latitude;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Short getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

    public Short getRiverType() {
        return riverType;
    }

    public void setRiverType(Short riverType) {
        this.riverType = riverType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBelongRiver() {
        return belongRiver;
    }

    public void setBelongRiver(String belongRiver) {
        this.belongRiver = belongRiver;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
