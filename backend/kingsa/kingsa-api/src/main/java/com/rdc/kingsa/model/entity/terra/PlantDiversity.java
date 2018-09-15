package com.rdc.kingsa.model.entity.terra;

import java.util.Date;

public class PlantDiversity {
	
    private String id;

    private Date monitorTime;

    private String sampleNumber;

    private Double longitude;

    private Double latitude;

    private String location;

    private Long speciesNumber;

    private String speciesNames;

    private Double biomassTotal;

    private String coverClass;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public String getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(String sampleNumber) {
        this.sampleNumber = sampleNumber == null ? null : sampleNumber.trim();
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Long getSpeciesNumber() {
        return speciesNumber;
    }

    public void setSpeciesNumber(Long speciesNumber) {
        this.speciesNumber = speciesNumber;
    }

    public String getSpeciesNames() {
        return speciesNames;
    }

    public void setSpeciesNames(String speciesNames) {
        this.speciesNames = speciesNames == null ? null : speciesNames.trim();
    }

    public Double getBiomassTotal() {
        return biomassTotal;
    }

    public void setBiomassTotal(Double biomassTotal) {
        this.biomassTotal = biomassTotal;
    }

    public String getCoverClass() {
        return coverClass;
    }

    public void setCoverClass(String coverClass) {
        this.coverClass = coverClass == null ? null : coverClass.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
    
}