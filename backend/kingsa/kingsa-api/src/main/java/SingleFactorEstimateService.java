import model.WaterQualityEstimateBO;
import model.WaterQualityMIBase;
import service.DrainOutletEstimate;
import service.TrunkEstimate;
import service.inf.Estimate;
import service.inf.SingleFactorEstimate;
import utils.EstimateStandardUtil;

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
