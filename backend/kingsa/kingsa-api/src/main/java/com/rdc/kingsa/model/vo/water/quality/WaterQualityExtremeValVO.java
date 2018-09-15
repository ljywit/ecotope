package com.rdc.kingsa.model.vo.water.quality;

/**
 * Created by lxf on 18/8/20.
 */
public class WaterQualityExtremeValVO {
    Short qaPlan;
    String sectionName;
    Short qaResult;
    Short drainOutlet;
    Object monitorVals;
    Object estimateVals;
    Object extremeVals;

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

    public Short getQaResult() {
        return qaResult;
    }

    public void setQaResult(Short qaResult) {
        this.qaResult = qaResult;
    }

    public Short getDrainOutlet() {
        return drainOutlet;
    }

    public void setDrainOutlet(Short drainOutlet) {
        this.drainOutlet = drainOutlet;
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

    public Object getExtremeVals() {
        return extremeVals;
    }

    public void setExtremeVals(Object extremeVals) {
        this.extremeVals = extremeVals;
    }
}
