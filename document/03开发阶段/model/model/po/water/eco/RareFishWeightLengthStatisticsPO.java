package com.rdc.kingsa.model.po.water.eco;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lxf on 18/8/23.
 */
public class RareFishWeightLengthStatisticsPO {
    String region;
    String samplingPoint;
    Date catchTime;
    BigDecimal overallLength;
    BigDecimal bodyLength;
    BigDecimal weight;
    BigDecimal emptyWeight;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSamplingPoint() {
        return samplingPoint;
    }

    public void setSamplingPoint(String samplingPoint) {
        this.samplingPoint = samplingPoint;
    }

    public Date getCatchTime() {
        return catchTime;
    }

    public void setCatchTime(Date catchTime) {
        this.catchTime = catchTime;
    }

    public BigDecimal getOverallLength() {
        return overallLength;
    }

    public void setOverallLength(BigDecimal overallLength) {
        this.overallLength = overallLength;
    }

    public BigDecimal getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(BigDecimal bodyLength) {
        this.bodyLength = bodyLength;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(BigDecimal emptyWeight) {
        this.emptyWeight = emptyWeight;
    }
}
