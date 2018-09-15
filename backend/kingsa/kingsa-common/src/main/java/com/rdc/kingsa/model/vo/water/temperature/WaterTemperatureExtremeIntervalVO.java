package com.rdc.kingsa.model.vo.water.temperature;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/21.
 */
public class WaterTemperatureExtremeIntervalVO {
    String dateRange;
    BigDecimal maxVal;
    BigDecimal minVal;
    BigDecimal avgVal;

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
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
}
