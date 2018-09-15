package com.rdc.kingsa.model.entity.climate;

import java.math.BigDecimal;

public class ClimateValueTemperature extends ClimateValueBase {

    private BigDecimal avg4;

    private BigDecimal avg24;

    private BigDecimal maxVal;

    private BigDecimal minVal;

    public BigDecimal getAvg4() {
        return avg4;
    }

    public void setAvg4(BigDecimal avg4) {
        this.avg4 = avg4;
    }

    public BigDecimal getAvg24() {
        return avg24;
    }

    public void setAvg24(BigDecimal avg24) {
        this.avg24 = avg24;
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
}