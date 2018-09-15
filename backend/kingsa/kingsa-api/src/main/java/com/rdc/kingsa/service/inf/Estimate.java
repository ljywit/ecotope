package com.rdc.kingsa.service.inf;

import com.rdc.kingsa.model.bo.water.quality.WaterQualityEstimateBO;
import com.rdc.kingsa.model.entity.water.quality.WaterQualityMIBase;

/**
 * Created by lxf on 18/9/14.
 */
public interface Estimate {
    WaterQualityEstimateBO doEstimate(WaterQualityMIBase mi) throws Exception;
}
