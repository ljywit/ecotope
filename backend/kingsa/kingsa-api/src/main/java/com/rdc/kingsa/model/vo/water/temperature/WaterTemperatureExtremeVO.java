package com.rdc.kingsa.model.vo.water.temperature;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/21.
 */
public class WaterTemperatureExtremeVO {
    String sectionName;
    String sectionId;
    BigDecimal maxVal;
    BigDecimal minVal;
    BigDecimal avgVal;
    Object intervals;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(BigDecimal maxVal) {
        this.maxVal = maxVal;
    }

    public BigDecimal getMinVal() {
        return minVal;
    }

    public void setMinVal(BigDecimal minVal) {
        this.minVal = minVal;
    }

    public BigDecimal getAvgVal() {
        return avgVal;
    }

    public void setAvgVal(BigDecimal avgVal) {
        this.avgVal = avgVal;
    }

    public Object getIntervals() {
        return intervals;
    }

    public void setIntervals(Object intervals) {
        this.intervals = intervals;
    }
}
