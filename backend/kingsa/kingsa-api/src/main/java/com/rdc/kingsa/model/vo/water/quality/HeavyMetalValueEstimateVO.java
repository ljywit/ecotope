package com.rdc.kingsa.model.vo.water.quality;

import java.util.Date;

/**
 * Created by lxf on 18/8/23.
 */
public class HeavyMetalValueEstimateVO {

    String sectionName;
    Object monitorVals;
    Object estimateVals;
    Date monitorTime;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Object getMonitorVals() {
        return monitorVals;
    }

    public void setMonitorVals(Object monitorVals) {
        this.monitorVals = monitorVals;
    }

    public Object getEstimateVals() {
        return estimateVals;
    }

    public void setEstimateVals(Object estimateVals) {
        this.estimateVals = estimateVals;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }
}
