package com.rdc.kingsa.service;

import com.rdc.kingsa.constant.EstimateTypes;
import com.rdc.kingsa.model.bo.water.quality.WaterQualityEstimateBO;
import com.rdc.kingsa.model.entity.water.quality.WaterQualityMIBase;
import com.rdc.kingsa.service.inf.Estimate;
import com.rdc.kingsa.utils.DrainStandard;
import com.rdc.kingsa.utils.EstimateStandardUtil;
import com.rdc.kingsa.utils.Interval;
import com.rdc.kingsa.utils.IntervalUtil;

/**
 * Created by lxf on 18/9/14.
 */
public class DrainOutletEstimate extends EstimateBase implements Estimate {
    private EstimateStandardUtil standardManager;

    public DrainOutletEstimate(EstimateStandardUtil trunkEstimateStandardUtil) {
        this.standardManager = trunkEstimateStandardUtil;
    }

    @Override
    public WaterQualityEstimateBO doEstimate(WaterQualityMIBase mi) throws Exception {
        WaterQualityEstimateBO bo = new WaterQualityEstimateBO();
        this.estimateDrainOutlet(mi, bo);
        this.estimateQaType(bo);
        return bo;
    }

    /**
     * 排污口评价
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateDrainOutlet(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        this.DOEstimatePH(mi, estimate);
        this.DOEstimateCOD(mi, estimate);
        this.DOEstimateBOD(mi, estimate);
        this.DOEstimateNH4N(mi, estimate);
        this.DOEstimateP(mi, estimate);
        this.DOEstimateXS(mi, estimate);
        this.DOEstimateXCN(mi, estimate);
        this.DOEstimateXF(mi, estimate);
        this.DOEstimateVP(mi, estimate);
        this.DOEstimatePetroleum(mi, estimate);
        this.DOEstimateAnionicSurfactant(mi, estimate);
        this.DOEstimateCu(mi, estimate);
        this.DOEstimateZn(mi, estimate);
        this.DOEstimateAs(mi, estimate);
        this.DOEstimateHg(mi, estimate);
        this.DOEstimateCd(mi, estimate);
        this.DOEstimateCr6(mi, estimate);
        this.DOEstimatePb(mi, estimate);
    }

    /**
     * ph值类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimatePH(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard phStandard = standardManager.selectDrainOutletByEvaluateItem("ph值类别");
        Interval phInterval1 = new Interval(phStandard.getTypeIUl().doubleValue(), phStandard.getTypeIUlSoc(),
                phStandard.getTypeILl().doubleValue(), phStandard.getTypeILlSoc());
        if (IntervalUtil.intervalContainsValue(phInterval1, mi.getPhValue().doubleValue())) {
            estimate.setPhT(EstimateTypes.QUALIFIED);
        } else {
            estimate.setPhT(EstimateTypes.UN_QUALIFIED);
        }
    }

    /**
     * 化学需氧量类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateCOD(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard oxdStandard = standardManager.selectDrainOutletByEvaluateItem("化学需氧量类别");
        Interval oxdInterval1 = new Interval(oxdStandard.getTypeIUl().doubleValue(), oxdStandard.getTypeIUlSoc(),
                oxdStandard.getTypeILl().doubleValue(), oxdStandard.getTypeILlSoc());
        Interval oxdInterval2 = new Interval(oxdStandard.getTypeIiUl().doubleValue(), oxdStandard.getTypeIiUlSoc(),
                oxdStandard.getTypeIiLl().doubleValue(), oxdStandard.getTypeIiLlSoc());
        Interval oxdInterval3 = new Interval(oxdStandard.getTypeIiiUl().doubleValue(), oxdStandard.getTypeIiiUlSoc(),
                oxdStandard.getTypeIiiLl().doubleValue(), oxdStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(oxdInterval1, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(oxdInterval2, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(oxdInterval3, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 3);
        } else {
            estimate.setOxDemandT((short) 4);
        }
    }

    /**
     * 五日生化需氧量类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateBOD(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard bodStandard = standardManager.selectDrainOutletByEvaluateItem("五日生化需氧量类别");
        Interval bodInterval1 = new Interval(bodStandard.getTypeIUl().doubleValue(), bodStandard.getTypeIUlSoc(),
                bodStandard.getTypeILl().doubleValue(), bodStandard.getTypeILlSoc());
        Interval bodInterval2 = new Interval(bodStandard.getTypeIiUl().doubleValue(), bodStandard.getTypeIiUlSoc(),
                bodStandard.getTypeIiLl().doubleValue(), bodStandard.getTypeIiLlSoc());
        Interval bodInterval3 = new Interval(bodStandard.getTypeIiiUl().doubleValue(), bodStandard.getTypeIiiUlSoc(),
                bodStandard.getTypeIiiLl().doubleValue(), bodStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(bodInterval1, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(bodInterval2, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(bodInterval3, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 3);
        } else {
            estimate.setBoDemandT((short) 4);
        }
    }

    /**
     * 氨氮类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateNH4N(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard ammoniaStandard = standardManager.selectDrainOutletByEvaluateItem("氨氮类别");
        Interval ammoniaInterval1 = new Interval(ammoniaStandard.getTypeIUl().doubleValue(), ammoniaStandard.getTypeIUlSoc(),
                ammoniaStandard.getTypeILl().doubleValue(), ammoniaStandard.getTypeILlSoc());
        Interval ammoniaInterval2 = new Interval(ammoniaStandard.getTypeIiUl().doubleValue(), ammoniaStandard.getTypeIiUlSoc(),
                ammoniaStandard.getTypeIiLl().doubleValue(), ammoniaStandard.getTypeIiLlSoc());
        if (IntervalUtil.intervalContainsValue(ammoniaInterval1, mi.getAmmonia().doubleValue())) {
            estimate.setAmmoniaT(EstimateTypes.CLASS_ONE);
        } else if (IntervalUtil.intervalContainsValue(ammoniaInterval2, mi.getAmmonia().doubleValue())) {
            estimate.setAmmoniaT(EstimateTypes.CLASS_TWO);
        } else {
            estimate.setAmmoniaT(EstimateTypes.CLASS_FOUR);
        }
    }

    /**
     * 总磷类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateP(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard phosphorusStandard = standardManager.selectDrainOutletByEvaluateItem("总磷类别");
        Interval phosphorusInterval1 = new Interval(phosphorusStandard.getTypeIUl().doubleValue(), phosphorusStandard.getTypeIUlSoc(),
                phosphorusStandard.getTypeILl().doubleValue(), phosphorusStandard.getTypeILlSoc());
        Interval phosphorusInterval2 = new Interval(phosphorusStandard.getTypeIiUl().doubleValue(),
                phosphorusStandard.getTypeIiUlSoc(), phosphorusStandard.getTypeIiLl().doubleValue(),
                phosphorusStandard.getTypeIiLlSoc());
        if (IntervalUtil.intervalContainsValue(phosphorusInterval1, mi.getPhosphorus().doubleValue())) {
            estimate.setPhosphorusT(EstimateTypes.CLASS_ONE);
        } else if (IntervalUtil.intervalContainsValue(phosphorusInterval2, mi.getPhosphorus().doubleValue())) {
            estimate.setPhosphorusT(EstimateTypes.CLASS_TWO);
        } else {
            estimate.setPhosphorusT(EstimateTypes.CLASS_FOUR);
        }
    }

    /**
     * 硫化物类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateXS(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard sulfideStandard = standardManager.selectDrainOutletByEvaluateItem("硫化物类别");
        Interval sulfideInterval1 = new Interval(sulfideStandard.getTypeIUl().doubleValue(), sulfideStandard.getTypeIUlSoc(),
                sulfideStandard.getTypeILl().doubleValue(), sulfideStandard.getTypeILlSoc());
        if (IntervalUtil.intervalContainsValue(sulfideInterval1, mi.getSulfide().doubleValue())) {
            estimate.setSulfideT(EstimateTypes.QUALIFIED);
        } else {
            estimate.setSulfideT(EstimateTypes.UN_QUALIFIED);
        }
    }

    /**
     * 氰化物类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateXCN(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard cyanideStandard = standardManager.selectDrainOutletByEvaluateItem("氰化物类别");
        Interval cyanideInterval1 = new Interval(cyanideStandard.getTypeIUl().doubleValue(), cyanideStandard.getTypeIUlSoc(),
                cyanideStandard.getTypeILl().doubleValue(), cyanideStandard.getTypeILlSoc());
        Interval cyanideInterval3 = new Interval(cyanideStandard.getTypeIiiUl().doubleValue(), cyanideStandard.getTypeIiiUlSoc(),
                cyanideStandard.getTypeIiiLl().doubleValue(), cyanideStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(cyanideInterval1, mi.getCyanide().doubleValue())) {
            estimate.setCyanideT(EstimateTypes.CLASS_ONE);
        } else if (IntervalUtil.intervalContainsValue(cyanideInterval3, mi.getCyanide().doubleValue())) {
            estimate.setCyanideT(EstimateTypes.CLASS_THREE);
        } else {
            estimate.setCyanideT(EstimateTypes.CLASS_FOUR);
        }
    }

    /**
     * 氟化物类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateXF(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard fluorideStandard = standardManager.selectDrainOutletByEvaluateItem("氟化物类别");
        Interval fluorideInterval1 = new Interval(fluorideStandard.getTypeIUl().doubleValue(), fluorideStandard.getTypeIUlSoc(),
                fluorideStandard.getTypeILl().doubleValue(), fluorideStandard.getTypeILlSoc());
        Interval fluorideInterval3 =
                new Interval(fluorideStandard.getTypeIiiUl().doubleValue(), fluorideStandard.getTypeIiiUlSoc(),
                        fluorideStandard.getTypeIiiLl().doubleValue(), fluorideStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(fluorideInterval1, mi.getFluoride().doubleValue())) {
            estimate.setFluorideT(EstimateTypes.CLASS_ONE);
        } else if (IntervalUtil.intervalContainsValue(fluorideInterval3, mi.getFluoride().doubleValue())) {
            estimate.setFluorideT(EstimateTypes.CLASS_THREE);
        } else {
            estimate.setFluorideT(EstimateTypes.CLASS_FOUR);
        }
    }

    /**
     * 挥发酚类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateVP(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard phenolStandard = standardManager.selectDrainOutletByEvaluateItem("挥发酚类别");
        Interval phenolInterval1 = new Interval(phenolStandard.getTypeIUl().doubleValue(), phenolStandard.getTypeIUlSoc(),
                phenolStandard.getTypeILl().doubleValue(), phenolStandard.getTypeILlSoc());
        Interval phenolInterval3 = new Interval(phenolStandard.getTypeIiiUl().doubleValue(), phenolStandard.getTypeIiiUlSoc(),
                phenolStandard.getTypeIiiLl().doubleValue(), phenolStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(phenolInterval1, mi.getPhenol().doubleValue())) {
            estimate.setPhenolT(EstimateTypes.CLASS_ONE);
        } else if (IntervalUtil.intervalContainsValue(phenolInterval3, mi.getPhenol().doubleValue())) {
            estimate.setPhenolT(EstimateTypes.CLASS_THREE);
        } else {
            estimate.setPhenolT(EstimateTypes.CLASS_FOUR);
        }
    }

    /**
     * 石油类类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimatePetroleum(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard petroleumStandard = standardManager.selectDrainOutletByEvaluateItem("石油类类别");
        Interval petroleumInterval1 = new Interval(petroleumStandard.getTypeIUl().doubleValue(), petroleumStandard.getTypeIUlSoc(),
                petroleumStandard.getTypeILl().doubleValue(), petroleumStandard.getTypeILlSoc());
        Interval petroleumInterval2 = new Interval(petroleumStandard.getTypeIiUl().doubleValue(), petroleumStandard.getTypeIiUlSoc(),
                petroleumStandard.getTypeIiLl().doubleValue(), petroleumStandard.getTypeIiLlSoc());
        Interval petroleumInterval3 = new Interval(petroleumStandard.getTypeIiiUl().doubleValue(),
                petroleumStandard.getTypeIiiUlSoc(), petroleumStandard.getTypeIiiLl().doubleValue(),
                petroleumStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(petroleumInterval1, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(petroleumInterval2, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(petroleumInterval3, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 3);
        } else {
            estimate.setPetroleumT((short) 4);
        }
    }

    /**
     * 阴离子表面活性剂类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateAnionicSurfactant(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard surfactantStandard = standardManager.selectDrainOutletByEvaluateItem("阴离子表面活性剂类别");
        Interval surfactantInterval1 = new Interval(surfactantStandard.getTypeIUl().doubleValue(), surfactantStandard.getTypeIUlSoc(),
                surfactantStandard.getTypeILl().doubleValue(), surfactantStandard.getTypeILlSoc());
        Interval surfactantInterval2 = new Interval(surfactantStandard.getTypeIiUl().doubleValue(),
                surfactantStandard.getTypeIiUlSoc(), surfactantStandard.getTypeIiLl().doubleValue(),
                surfactantStandard.getTypeIiLlSoc());
        Interval surfactantInterval3 = new Interval(surfactantStandard.getTypeIiiUl().doubleValue(),
                surfactantStandard.getTypeIiiUlSoc(), surfactantStandard.getTypeIiiLl().doubleValue(),
                surfactantStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(surfactantInterval1, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(surfactantInterval2, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(surfactantInterval3, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 3);
        } else {
            estimate.setSurfactantT((short) 4);
        }
    }

    /**
     * 铜类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateCu(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard copperStandard = standardManager.selectDrainOutletByEvaluateItem("铜类别");
        Interval copperInterval1 = new Interval(copperStandard.getTypeIUl().doubleValue(), copperStandard.getTypeIUlSoc(),
                copperStandard.getTypeILl().doubleValue(), copperStandard.getTypeILlSoc());
        Interval copperInterval2 = new Interval(copperStandard.getTypeIiUl().doubleValue(), copperStandard.getTypeIiUlSoc(),
                copperStandard.getTypeIiLl().doubleValue(), copperStandard.getTypeIiLlSoc());
        Interval copperInterval3 = new Interval(copperStandard.getTypeIiiUl().doubleValue(), copperStandard.getTypeIiiUlSoc(),
                copperStandard.getTypeIiiLl().doubleValue(), copperStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(copperInterval1, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(copperInterval2, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(copperInterval3, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 3);
        } else {
            estimate.setCopperT((short) 4);
        }
    }

    /**
     * 锌类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateZn(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard zincStandard = standardManager.selectDrainOutletByEvaluateItem("锌类别");
        Interval zincInterval1 = new Interval(zincStandard.getTypeIUl().doubleValue(), zincStandard.getTypeIUlSoc(),
                zincStandard.getTypeILl().doubleValue(), zincStandard.getTypeILlSoc());
        Interval zincInterval2 = new Interval(zincStandard.getTypeIiUl().doubleValue(), zincStandard.getTypeIiUlSoc(),
                zincStandard.getTypeIiLl().doubleValue(), zincStandard.getTypeIiLlSoc());
        //Interval zincInterval3 = new Interval(zincStandard.getTypeIiiUl().doubleValue(), zincStandard.getTypeIiiUlSoc(),
        //        zincStandard.getTypeIiiLl().doubleValue(), zincStandard.getTypeIiiLlSoc());
        if (IntervalUtil.intervalContainsValue(zincInterval1, mi.getZinc().doubleValue())) {
            estimate.setZincT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(zincInterval2, mi.getZinc().doubleValue())) {
            estimate.setZincT((short) 2);
        } else {
            estimate.setZincT((short) 4);
        }
    }

    /**
     * 砷类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateAs(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard arsenicStandard = standardManager.selectDrainOutletByEvaluateItem("砷类别");
        Interval arsenicInterval1 = new Interval(arsenicStandard.getTypeIUl().doubleValue(), arsenicStandard.getTypeIUlSoc(),
                arsenicStandard.getTypeILl().doubleValue(), arsenicStandard.getTypeILlSoc());

        if (IntervalUtil.intervalContainsValue(arsenicInterval1, mi.getArsenic().doubleValue())) {
            estimate.setArsenicT(EstimateTypes.QUALIFIED);
        } else {
            estimate.setArsenicT(EstimateTypes.UN_QUALIFIED);
        }
    }

    /**
     * 汞类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateHg(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard mercuryStandard = standardManager.selectDrainOutletByEvaluateItem("汞类别");
        Interval mercuryInterval1 = new Interval(mercuryStandard.getTypeIUl().doubleValue(), mercuryStandard.getTypeIUlSoc(),
                mercuryStandard.getTypeILl().doubleValue(), mercuryStandard.getTypeILlSoc());

        if (IntervalUtil.intervalContainsValue(mercuryInterval1, mi.getMercury().doubleValue())) {
            estimate.setMercuryT(EstimateTypes.QUALIFIED);
        } else {
            estimate.setMercuryT(EstimateTypes.UN_QUALIFIED);
        }
    }

    /**
     * 镉类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateCd(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard cadmiumStandard = standardManager.selectDrainOutletByEvaluateItem("镉类别");
        Interval cadmiumInterval1 = new Interval(cadmiumStandard.getTypeIUl().doubleValue(), cadmiumStandard.getTypeIUlSoc(),
                cadmiumStandard.getTypeILl().doubleValue(), cadmiumStandard.getTypeILlSoc());

        if (IntervalUtil.intervalContainsValue(cadmiumInterval1, mi.getCadmium().doubleValue())) {
            estimate.setCadmiumT(EstimateTypes.QUALIFIED);
        } else {
            estimate.setCadmiumT(EstimateTypes.UN_QUALIFIED);
        }
    }

    /**
     * 六价铬类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimateCr6(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard chromiumStandard = standardManager.selectDrainOutletByEvaluateItem("六价铬类别");
        Interval chromiumInterval1 = new Interval(chromiumStandard.getTypeIUl().doubleValue(), chromiumStandard.getTypeIUlSoc(),
                chromiumStandard.getTypeILl().doubleValue(), chromiumStandard.getTypeILlSoc());
        if (IntervalUtil.intervalContainsValue(chromiumInterval1, mi.getChromium().doubleValue())) {
            estimate.setChromiumT(EstimateTypes.QUALIFIED);
        } else {
            estimate.setChromiumT(EstimateTypes.UN_QUALIFIED);
        }
    }

    /**
     * 铅类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void DOEstimatePb(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        DrainStandard leadStandard = standardManager.selectDrainOutletByEvaluateItem("铅类别");
        Interval leadInterval1 = new Interval(leadStandard.getTypeIUl().doubleValue(), leadStandard.getTypeIUlSoc(),
                leadStandard.getTypeILl().doubleValue(), leadStandard.getTypeILlSoc());
        if (IntervalUtil.intervalContainsValue(leadInterval1, mi.getLead().doubleValue())) {
            estimate.setLeadT(EstimateTypes.QUALIFIED);
        } else {
            estimate.setLeadT(EstimateTypes.UN_QUALIFIED);
        }
    }
}
