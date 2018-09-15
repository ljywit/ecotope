package com.rdc.kingsa.model.entity.atomization;

import java.math.BigDecimal;

public class FdaMonitorSpot {
    private String id;

    private String stationSpotId;

    private String spotCode;

    private String instrumentType;

    private BigDecimal elevation;

    private Short backgoundValue;

    private String stationSide;

    private String usageType;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStationSpotId() {
        return stationSpotId;
    }

    public void setStationSpotId(String stationSpotId) {
        this.stationSpotId = stationSpotId == null ? null : stationSpotId.trim();
    }

    public String getSpotCode() {
        return spotCode;
    }

    public void setSpotCode(String spotCode) {
        this.spotCode = spotCode == null ? null : spotCode.trim();
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType == null ? null : instrumentType.trim();
    }

    public BigDecimal getElevation() {
        return elevation;
    }

    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    public Short getBackgoundValue() {
        return backgoundValue;
    }

    public void setBackgoundValue(Short backgoundValue) {
        this.backgoundValue = backgoundValue;
    }

    public String getStationSide() {
        return stationSide;
    }

    public void setStationSide(String stationSide) {
        this.stationSide = stationSide == null ? null : stationSide.trim();
    }

    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType == null ? null : usageType.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}