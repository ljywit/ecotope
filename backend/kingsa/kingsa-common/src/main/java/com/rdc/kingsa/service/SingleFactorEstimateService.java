package com.rdc.kingsa.service;

import com.rdc.kingsa.model.bo.water.quality.WaterQualityEstimateBO;
import com.rdc.kingsa.model.entity.water.quality.WaterQualityMIBase;
import com.rdc.kingsa.service.inf.Estimate;
import com.rdc.kingsa.service.inf.SingleFactorEstimate;
import com.rdc.kingsa.utils.EstimateStandardUtil;

/**
 * Created by lxf on 18/9/13.
 */
public class SingleFactorEstimateService implements SingleFactorEstimate {

    Estimate drainEstimate;
    Estimate trunkEstimate;

    public SingleFactorEstimateService() {
        EstimateStandardUtil util = new EstimateStandardUtil();
        drainEstimate = new DrainOutletEstimate(util);
        trunkEstimate = new TrunkEstimate(util);
    }

    /**
     * 干流水质监测信息
     *
     * @param mi 水质监测信息
     * @return
     * @throws Exception
     */
    @Override
    public WaterQualityEstimateBO trunkEstimate(WaterQualityMIBase mi) throws Exception {
        return trunkEstimate.doEstimate(mi);
    }

    /**
     * 排污口水质评价
     *
     * @param mi 水质监测信息
     * @return
     * @throws Exception
     */
    @Override
    public WaterQualityEstimateBO drainOutletEstimate(WaterQualityMIBase mi) throws Exception {
        return drainEstimate.doEstimate(mi);
    }
}
