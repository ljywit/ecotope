package com.rdc.kingsa.model.bo.water.quality;

import com.rdc.kingsa.model.entity.water.quality.WaterQualityMI;

import java.util.Date;

/**
 * Created by lxf on 18/8/22.
 */
public class WaterQualityValueWithEstimateBO {
    private WaterQualityMI values;
    private Short qaResult;
    private Date monitorTime;

    public WaterQualityMI getValues() {
        return values;
    }

    public void setValues(WaterQualityMI values) {
        this.values = values;
    }

    public Short getQaResult() {
        return qaResult;
    }

    public void setQaResult(Short qaResult) {
        this.qaResult = qaResult;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }
}
