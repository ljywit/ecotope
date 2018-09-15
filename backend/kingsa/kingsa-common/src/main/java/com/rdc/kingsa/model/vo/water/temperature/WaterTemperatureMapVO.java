package com.rdc.kingsa.model.vo.water.temperature;

import com.rdc.kingsa.model.po.section.WaterTemperatureSection;

import java.util.Date;

/**
 * Created by lxf on 18/8/25.
 */
public class WaterTemperatureMapVO {
    private String sectionId;
    private String sectionName;
    private Double longitude;
    private Double latitude;
    private Double temperature;
    private Date monitorTime;

    public WaterTemperatureMapVO() {
    }

    public WaterTemperatureMapVO(WaterTemperatureSection section) {
        this.setSectionId(section.getSectionId());
        this.setSectionName(section.getSectionName());
        this.setLatitude(section.getLatitude());
        this.setLongitude(section.getLongitude());
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

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }
}
