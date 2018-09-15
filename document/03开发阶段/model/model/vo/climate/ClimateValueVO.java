package com.rdc.kingsa.model.vo.climate;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/7.
 */
public class ClimateValueVO {
    BigDecimal minVal;

    BigDecimal maxVal;

    BigDecimal avg4;

    BigDecimal avg24;

    String monitorDate;

    public BigDecimal getMinVal() {
        return minVal;
    }

    public void setMinVal(BigDecimal minVal) {
        this.minVal = minVal;
    }

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

    public String getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(String monitorDate) {
        this.monitorDate = monitorDate;
    }

    public BigDecimal getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(BigDecimal maxVal) {
        this.maxVal = maxVal;
    }
}
