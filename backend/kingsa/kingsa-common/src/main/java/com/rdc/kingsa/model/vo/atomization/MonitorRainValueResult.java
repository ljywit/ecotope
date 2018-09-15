package com.rdc.kingsa.model.vo.atomization;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/2.
 */
public class MonitorRainValueResult {
    private String id;

    private String monitorRecordId;

    private String monitorSpotId;

    private String spotCode;

    private String spotName;

    private BigDecimal rainIntensity;

    private BigDecimal rainIntensityNature;

    private BigDecimal rainIntensityFDA;

    private String stationSide;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonitorRecordId() {
        return monitorRecordId;
    }

    public void setMonitorRecordId(String monitorRecordId) {
        this.monitorRecordId = monitorRecordId;
    }

    public String getMonitorSpotId() {
        return monitorSpotId;
    }

    public void setMonitorSpotId(String monitorSpotId) {
        this.monitorSpotId = monitorSpotId;
    }

    public BigDecimal getRainIntensity() {
        return rainIntensity;
    }

    public void setRainIntensity(BigDecimal rainIntensity) {
        this.rainIntensity = rainIntensity;
    }

    public BigDecimal getRainIntensityNature() {
        return rainIntensityNature;
    }

    public void setRainIntensityNature(BigDecimal rainIntensityNature) {
        this.rainIntensityNature = rainIntensityNature;
    }

    public BigDecimal getRainIntensityFDA() {
        return rainIntensityFDA;
    }

    public void setRainIntensityFDA(BigDecimal rainIntensityFDA) {
        this.rainIntensityFDA = rainIntensityFDA;
    }

    public String getStationSide() {
        return stationSide;
    }

    public void setStationSide(String stationSide) {
        this.stationSide = stationSide;
    }

    public String getSpotCode() {
        return spotCode;
    }

    public void setSpotCode(String spotCode) {
        this.spotCode = spotCode;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }
}
