package com.rdc.kingsa.model.vo.water.quality.estimate;

import com.rdc.kingsa.model.entity.water.quality.WaterQualityMI;
import com.rdc.kingsa.model.entity.water.quality.estimate.WaterQualityEstimate;
import com.rdc.kingsa.model.po.section.WaterQualitySection;

/**
 * Created by lxf on 18/8/25.
 */
public class LatestEstimateVO {
    WaterQualitySection section;
    WaterQualityMI monitorVals;
    WaterQualityEstimate estimateVals;

    public WaterQualitySection getSection() {
        return section;
    }

    public void setSection(WaterQualitySection section) {
        this.section = section;
    }

    public WaterQualityMI getMonitorVals() {
        return monitorVals;
    }

    public void setMonitorVals(WaterQualityMI monitorVals) {
        this.monitorVals = monitorVals;
    }

    public WaterQualityEstimate getEstimateVals() {
        return estimateVals;
    }

    public void setEstimateVals(WaterQualityEstimate estimateVals) {
        this.estimateVals = estimateVals;
    }
}
