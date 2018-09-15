package com.rdc.kingsa.model.vo.atomization;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/2.
 */
public class MonitorWindValueResult {
    private String id;

    private String spotName;

    private String spotCode;

    private BigDecimal windSpeed;

    private BigDecimal duration;

    private String windType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public String getSpotCode() {
        return spotCode;
    }

    public void setSpotCode(String spotCode) {
        this.spotCode = spotCode;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public String getWindType() {
        return windType;
    }

    public void setWindType(String windType) {
        this.windType = windType;
    }
}
