package com.rdc.kingsa.model.vo.climate;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/7.
 */
public class ClimateRainHistoryValueVO {
    String month;

    BigDecimal historyAvgVal;

    BigDecimal currentAvgVal;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getHistoryAvgVal() {
        return historyAvgVal;
    }

    public void setHistoryAvgVal(BigDecimal historyAvgVal) {
        this.historyAvgVal = historyAvgVal;
    }

    public BigDecimal getCurrentAvgVal() {
        return currentAvgVal;
    }

    public void setCurrentAvgVal(BigDecimal currentAvgVal) {
        this.currentAvgVal = currentAvgVal;
    }
}
