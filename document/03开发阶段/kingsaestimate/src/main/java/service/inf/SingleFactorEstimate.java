package service.inf;

import model.WaterQualityEstimateBO;
import model.WaterQualityMIBase;

/**
 * Created by lxf on 18/9/14.
 */
public interface SingleFactorEstimate {
    /**
     * 干流水质监测信息
     *
     * @param mi 水质监测信息
     * @return
     * @throws Exception
     */
    WaterQualityEstimateBO trunkEstimate(WaterQualityMIBase mi) throws Exception;

    /**
     * 排污口水质评价
     *
     * @param mi 水质监测信息
     * @return
     * @throws Exception
     */
    WaterQualityEstimateBO drainOutletEstimate(WaterQualityMIBase mi) throws Exception;
}
