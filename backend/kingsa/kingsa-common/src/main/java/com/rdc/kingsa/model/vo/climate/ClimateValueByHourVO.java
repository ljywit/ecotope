package com.rdc.kingsa.model.vo.climate;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/6.
 */
public class ClimateValueByHourVO {
    BigDecimal monitorVal;

    String monitorDate;

    public BigDecimal getMonitorVal() {
        return monitorVal;
    }

    public void setMonitorVal(BigDecimal monitorVal) {
        this.monitorVal = monitorVal;
    }

    public String getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(String monitorDate) {
        this.monitorDate = monitorDate;
    }
}
