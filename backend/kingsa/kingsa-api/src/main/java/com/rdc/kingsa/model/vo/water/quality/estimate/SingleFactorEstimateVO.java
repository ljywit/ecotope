package com.rdc.kingsa.model.vo.water.quality.estimate;

import java.util.Date;

/**
 * Created by lxf on 18/8/17.
 */
public class SingleFactorEstimateVO {
    Short qaPlan;
    String sectionName;
    Date monitorTime;
    Short qaResult;
    Short drainOutlet;
    String overItems;
    Object monitorVals;
    Object estimateVals;

    public String getOverItems() {
        return overItems;
    }

    public void setOverItems(String overItems) {
        this.overItems = overItems;
    }

    public Short getDrainOutlet() {
        return drainOutlet;
    }

    public void setDrainOutlet(Short drainOutlet) {
        this.drainOutlet = drainOutlet;
    }

    public Short getQaPlan() {
        return qaPlan;
    }

    public void setQaPlan(Short qaPlan) {
        this.qaPlan = qaPlan;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Short getQaResult() {
        return qaResult;
    }

    public void setQaResult(Short qaResult) {
        this.qaResult = qaResult;
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
}
