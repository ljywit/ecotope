package service.inf;

import model.WaterQualityEstimateBO;
import model.WaterQualityMIBase;

/**
 * Created by lxf on 18/9/14.
 */
public interface Estimate {
    WaterQualityEstimateBO doEstimate(WaterQualityMIBase mi) throws Exception;
}
