package com.rdc.kingsa.model.po.hydrology;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/30.
 */
public class FlagValuePO {

    private BigDecimal avgAvg;

    private BigDecimal maxAvg;

    private BigDecimal minAvg;

    private Integer monthAvg;

    public BigDecimal getAvgAvg() {
        return avgAvg;
    }

    public void setAvgAvg(BigDecimal avgAvg) {
        this.avgAvg = avgAvg;
    }

    public BigDecimal getMaxAvg() {
        return maxAvg;
    }

    public void setMaxAvg(BigDecimal maxAvg) {
        this.maxAvg = maxAvg;
    }

    public BigDecimal getMinAvg() {
        return minAvg;
    }

    public void setMinAvg(BigDecimal minAvg) {
        this.minAvg = minAvg;
    }

    public Integer getMonthAvg() {
        return monthAvg;
    }

    public void setMonthAvg(Integer monthAvg) {
        this.monthAvg = monthAvg;
    }
}
