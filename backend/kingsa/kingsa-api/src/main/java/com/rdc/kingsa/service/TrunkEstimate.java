package com.rdc.kingsa.service;

import com.rdc.kingsa.model.bo.water.quality.WaterQualityEstimateBO;
import com.rdc.kingsa.model.entity.water.quality.WaterQualityMIBase;
import com.rdc.kingsa.service.inf.Estimate;
import com.rdc.kingsa.utils.EstimateStandardUtil;
import com.rdc.kingsa.utils.Interval;
import com.rdc.kingsa.utils.IntervalUtil;
import com.rdc.kingsa.utils.TrunkStandard;

/**
 * Created by lxf on 18/9/14.
 */
public class TrunkEstimate extends EstimateBase implements Estimate {

    private EstimateStandardUtil standardManager;

    public TrunkEstimate(EstimateStandardUtil trunkEstimateStandardUtil) {
        this.standardManager = trunkEstimateStandardUtil;
    }

    @Override
    public WaterQualityEstimateBO doEstimate(WaterQualityMIBase mi) throws Exception {
        WaterQualityEstimateBO bo = new WaterQualityEstimateBO();
        this.estimateMainSream(mi, bo);
        this.estimateQaType(bo);
        return bo;
    }

    /**
     * 评价干流水质
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateMainSream(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        this.estimatePH(mi, estimate);
        this.estimateDO(mi, estimate);
        this.estimateKMnO4(mi, estimate);
        this.estimateCOD(mi, estimate);
        this.estimateBOD(mi, estimate);
        this.estimateNH4N(mi, estimate);
        this.estimateP(mi, estimate);
        this.estimateCu(mi, estimate);
        this.estimateZn(mi, estimate);
        this.estimateXF(mi, estimate);
        this.estimateSe(mi, estimate);
        this.estimateAs(mi, estimate);
        this.estimateHg(mi, estimate);
        this.estimateCd(mi, estimate);
        this.estimateCr6(mi, estimate);
        this.estimatePb(mi, estimate);
        this.estimateXCN(mi, estimate);
        this.estimateVP(mi, estimate);
        this.estimatePetroleum(mi, estimate);
        this.estimateAnionicSurfactant(mi, estimate);
        this.estimateXS(mi, estimate);
    }

    /**
     * PH评价
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimatePH(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard phStandard = standardManager.selectTrunkByEvaluateItem("ph值类别");
        Interval phInterval1 = new Interval(phStandard.getTypeIUl().doubleValue(), phStandard.getTypeIUlSoc(),
                phStandard.getTypeILl().doubleValue(), phStandard.getTypeILlSoc());
        Interval phInterval2 = new Interval(phStandard.getTypeILl().doubleValue(), phStandard.getTypeIiUlSoc(),
                phStandard.getTypeIiLl().doubleValue(), phStandard.getTypeIiLlSoc());
        Interval phInterval3 = new Interval(phStandard.getTypeIiiUl().doubleValue(), phStandard.getTypeIiiUlSoc(),
                phStandard.getTypeIiiLl().doubleValue(), phStandard.getTypeIiiLlSoc());
        Interval phInterval4 = new Interval(phStandard.getTypeIvUl().doubleValue(), phStandard.getTypeIvUlSoc(),
                phStandard.getTypeIvLl().doubleValue(), phStandard.getTypeIvLlSoc());
        Interval phInterval5 = new Interval(phStandard.getTypeVUl().doubleValue(), phStandard.getTypeVUlSoc(),
                phStandard.getTypeVLl().doubleValue(), phStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(phInterval1, mi.getPhValue().doubleValue())) {
            estimate.setPhT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(phInterval2, mi.getPhValue().doubleValue())) {
            estimate.setPhT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(phInterval3, mi.getPhValue().doubleValue())) {
            estimate.setPhT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(phInterval4, mi.getPhValue().doubleValue())) {
            estimate.setPhT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(phInterval5, mi.getPhValue().doubleValue())) {
            estimate.setPhT((short) 5);
        } else {
            estimate.setPhT((short) 6);
        }
    }

    /**
     * 溶解氧评价
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateDO(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard disOxygenStandard = standardManager.selectTrunkByEvaluateItem("溶解氧类别");
        Interval disOxygenInterval1 = new Interval(disOxygenStandard.getTypeIUl().doubleValue(), disOxygenStandard.getTypeIUlSoc(),
                disOxygenStandard.getTypeILl().doubleValue(), disOxygenStandard.getTypeILlSoc());
        Interval disOxygenInterval2 = new Interval(disOxygenStandard.getTypeILl().doubleValue(), disOxygenStandard.getTypeIiUlSoc(),
                disOxygenStandard.getTypeIiLl().doubleValue(), disOxygenStandard.getTypeIiLlSoc());
        Interval disOxygenInterval3 = new Interval(disOxygenStandard.getTypeIiiUl().doubleValue(),
                disOxygenStandard.getTypeIiiUlSoc(), disOxygenStandard.getTypeIiiLl().doubleValue(),
                disOxygenStandard.getTypeIiiLlSoc());
        Interval disOxygenInterval4 = new Interval(disOxygenStandard.getTypeIvUl().doubleValue(), disOxygenStandard.getTypeIvUlSoc(),
                disOxygenStandard.getTypeIvLl().doubleValue(), disOxygenStandard.getTypeIvLlSoc());
        Interval disOxygenInterval5 = new Interval(disOxygenStandard.getTypeVUl().doubleValue(), disOxygenStandard.getTypeVUlSoc(),
                disOxygenStandard.getTypeVLl().doubleValue(), disOxygenStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(disOxygenInterval1, mi.getDisOxygen().doubleValue())) {
            estimate.setDisOxygenT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(disOxygenInterval2, mi.getDisOxygen().doubleValue())) {
            estimate.setDisOxygenT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(disOxygenInterval3, mi.getDisOxygen().doubleValue())) {
            estimate.setDisOxygenT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(disOxygenInterval4, mi.getDisOxygen().doubleValue())) {
            estimate.setDisOxygenT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(disOxygenInterval5, mi.getDisOxygen().doubleValue())) {
            estimate.setDisOxygenT((short) 5);
        } else {
            estimate.setDisOxygenT((short) 6);
        }
    }

    /**
     * 高锰酸盐评价
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateKMnO4(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard permanganateStandard = standardManager.selectTrunkByEvaluateItem("高锰酸盐类别");
        Interval permanganateInterval1 = new Interval(permanganateStandard.getTypeIUl().doubleValue(),
                permanganateStandard.getTypeIUlSoc(), permanganateStandard.getTypeILl().doubleValue(),
                permanganateStandard.getTypeILlSoc());
        Interval permanganateInterval2 = new Interval(permanganateStandard.getTypeIiUl().doubleValue(),
                permanganateStandard.getTypeIiUlSoc(), permanganateStandard.getTypeIiLl().doubleValue(),
                permanganateStandard.getTypeIiLlSoc());
        Interval permanganateInterval3 = new Interval(permanganateStandard.getTypeIiiUl().doubleValue(),
                permanganateStandard.getTypeIiiUlSoc(), permanganateStandard.getTypeIiiLl().doubleValue(),
                permanganateStandard.getTypeIiiLlSoc());
        Interval permanganateInterval4 = new Interval(permanganateStandard.getTypeIvUl().doubleValue(),
                permanganateStandard.getTypeIvUlSoc(), permanganateStandard.getTypeIvLl().doubleValue(),
                permanganateStandard.getTypeIvLlSoc());
        Interval permanganateInterval5 = new Interval(permanganateStandard.getTypeVUl().doubleValue(),
                permanganateStandard.getTypeVUlSoc(), permanganateStandard.getTypeVLl().doubleValue(),
                permanganateStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(permanganateInterval1, mi.getPermanganate().doubleValue())) {
            estimate.setPermanganateT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(permanganateInterval2, mi.getPermanganate().doubleValue())) {
            estimate.setPermanganateT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(permanganateInterval3, mi.getPermanganate().doubleValue())) {
            estimate.setPermanganateT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(permanganateInterval4, mi.getPermanganate().doubleValue())) {
            estimate.setPermanganateT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(permanganateInterval5, mi.getPermanganate().doubleValue())) {
            estimate.setPermanganateT((short) 5);
        } else {
            estimate.setPermanganateT((short) 6);
        }
    }

    /**
     * 化学需氧量
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateCOD(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard oxdStandard = standardManager.selectTrunkByEvaluateItem("化学需氧量类别");
        Interval oxdInterval1 = new Interval(oxdStandard.getTypeIUl().doubleValue(), oxdStandard.getTypeIUlSoc(),
                oxdStandard.getTypeILl().doubleValue(), oxdStandard.getTypeILlSoc());
        Interval oxdInterval2 = new Interval(oxdStandard.getTypeIiUl().doubleValue(), oxdStandard.getTypeIiUlSoc(),
                oxdStandard.getTypeIiLl().doubleValue(), oxdStandard.getTypeIiLlSoc());
        Interval oxdInterval3 = new Interval(oxdStandard.getTypeIiiUl().doubleValue(), oxdStandard.getTypeIiiUlSoc(),
                oxdStandard.getTypeIiiLl().doubleValue(), oxdStandard.getTypeIiiLlSoc());
        Interval oxdInterval4 = new Interval(oxdStandard.getTypeIvUl().doubleValue(), oxdStandard.getTypeIvUlSoc(),
                oxdStandard.getTypeIvLl().doubleValue(), oxdStandard.getTypeIvLlSoc());
        Interval oxdInterval5 = new Interval(oxdStandard.getTypeVUl().doubleValue(), oxdStandard.getTypeVUlSoc(),
                oxdStandard.getTypeVLl().doubleValue(), oxdStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(oxdInterval1, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(oxdInterval2, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(oxdInterval3, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(oxdInterval4, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(oxdInterval5, mi.getOxDemand().doubleValue())) {
            estimate.setOxDemandT((short) 5);
        } else {
            estimate.setOxDemandT((short) 6);
        }
    }

    /**
     * 五日生化需氧量
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateBOD(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard bodStandard = standardManager.selectTrunkByEvaluateItem("五日生化需氧量类别");
        Interval bodInterval1 = new Interval(bodStandard.getTypeIUl().doubleValue(), bodStandard.getTypeIUlSoc(),
                bodStandard.getTypeILl().doubleValue(), bodStandard.getTypeILlSoc());
        Interval bodInterval2 = new Interval(bodStandard.getTypeIiUl().doubleValue(), bodStandard.getTypeIiUlSoc(),
                bodStandard.getTypeIiLl().doubleValue(), bodStandard.getTypeIiLlSoc());
        Interval bodInterval3 = new Interval(bodStandard.getTypeIiiUl().doubleValue(), bodStandard.getTypeIiiUlSoc(),
                bodStandard.getTypeIiiLl().doubleValue(), bodStandard.getTypeIiiLlSoc());
        Interval bodInterval4 = new Interval(bodStandard.getTypeIvUl().doubleValue(), bodStandard.getTypeIvUlSoc(),
                bodStandard.getTypeIvLl().doubleValue(), bodStandard.getTypeIvLlSoc());
        Interval bodInterval5 = new Interval(bodStandard.getTypeVUl().doubleValue(), bodStandard.getTypeVUlSoc(),
                bodStandard.getTypeVLl().doubleValue(), bodStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(bodInterval1, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(bodInterval2, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(bodInterval3, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(bodInterval4, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(bodInterval5, mi.getBoDemand().doubleValue())) {
            estimate.setBoDemandT((short) 5);
        } else {
            estimate.setBoDemandT((short) 6);
        }
    }

    /**
     * 氨氮类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateNH4N(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard ammoniaStandard = standardManager.selectTrunkByEvaluateItem("氨氮类别");
        Interval ammoniaInterval1 = new Interval(ammoniaStandard.getTypeIUl().doubleValue(), ammoniaStandard.getTypeIUlSoc(),
                ammoniaStandard.getTypeILl().doubleValue(), ammoniaStandard.getTypeILlSoc());
        Interval ammoniaInterval2 = new Interval(ammoniaStandard.getTypeIiUl().doubleValue(), ammoniaStandard.getTypeIiUlSoc(),
                ammoniaStandard.getTypeIiLl().doubleValue(), ammoniaStandard.getTypeIiLlSoc());
        Interval ammoniaInterval3 = new Interval(ammoniaStandard.getTypeIiiUl().doubleValue(), ammoniaStandard.getTypeIiiUlSoc(),
                ammoniaStandard.getTypeIiiLl().doubleValue(), ammoniaStandard.getTypeIiiLlSoc());
        Interval ammoniaInterval4 = new Interval(ammoniaStandard.getTypeIvUl().doubleValue(), ammoniaStandard.getTypeIvUlSoc(),
                ammoniaStandard.getTypeIvLl().doubleValue(), ammoniaStandard.getTypeIvLlSoc());
        Interval ammoniaInterval5 = new Interval(ammoniaStandard.getTypeVUl().doubleValue(), ammoniaStandard.getTypeVUlSoc(),
                ammoniaStandard.getTypeVLl().doubleValue(), ammoniaStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(ammoniaInterval1, mi.getAmmonia().doubleValue())) {
            estimate.setAmmoniaT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(ammoniaInterval2, mi.getAmmonia().doubleValue())) {
            estimate.setAmmoniaT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(ammoniaInterval3, mi.getAmmonia().doubleValue())) {
            estimate.setAmmoniaT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(ammoniaInterval4, mi.getAmmonia().doubleValue())) {
            estimate.setAmmoniaT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(ammoniaInterval5, mi.getAmmonia().doubleValue())) {
            estimate.setAmmoniaT((short) 5);
        } else {
            estimate.setAmmoniaT((short) 6);
        }
    }

    /**
     * 总磷
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateP(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard phosphorusStandard = standardManager.selectTrunkByEvaluateItem("总磷类别");
        Interval phosphorusInterval1 = new Interval(phosphorusStandard.getTypeIUl().doubleValue(), phosphorusStandard.getTypeIUlSoc(),
                phosphorusStandard.getTypeILl().doubleValue(), phosphorusStandard.getTypeILlSoc());
        Interval phosphorusInterval2 = new Interval(phosphorusStandard.getTypeIiUl().doubleValue(),
                phosphorusStandard.getTypeIiUlSoc(), phosphorusStandard.getTypeIiLl().doubleValue(),
                phosphorusStandard.getTypeIiLlSoc());
        Interval phosphorusInterval3 = new Interval(phosphorusStandard.getTypeIiiUl().doubleValue(),
                phosphorusStandard.getTypeIiiUlSoc(), phosphorusStandard.getTypeIiiLl().doubleValue(),
                phosphorusStandard.getTypeIiiLlSoc());
        Interval phosphorusInterval4 = new Interval(phosphorusStandard.getTypeIvUl().doubleValue(),
                phosphorusStandard.getTypeIvUlSoc(), phosphorusStandard.getTypeIvLl().doubleValue(),
                phosphorusStandard.getTypeIvLlSoc());
        Interval phosphorusInterval5 = new Interval(phosphorusStandard.getTypeVUl().doubleValue(), phosphorusStandard.getTypeVUlSoc(),
                phosphorusStandard.getTypeVLl().doubleValue(), phosphorusStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(phosphorusInterval1, mi.getPhosphorus().doubleValue())) {
            estimate.setPhosphorusT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(phosphorusInterval2, mi.getPhosphorus().doubleValue())) {
            estimate.setPhosphorusT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(phosphorusInterval3, mi.getPhosphorus().doubleValue())) {
            estimate.setPhosphorusT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(phosphorusInterval4, mi.getPhosphorus().doubleValue())) {
            estimate.setPhosphorusT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(phosphorusInterval5, mi.getPhosphorus().doubleValue())) {
            estimate.setPhosphorusT((short) 5);
        } else {
            estimate.setPhosphorusT((short) 6);
        }
    }

    /**
     * 铜
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateCu(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard copperStandard = standardManager.selectTrunkByEvaluateItem("铜类别");
        Interval copperInterval1 = new Interval(copperStandard.getTypeIUl().doubleValue(), copperStandard.getTypeIUlSoc(),
                copperStandard.getTypeILl().doubleValue(), copperStandard.getTypeILlSoc());
        Interval copperInterval2 = new Interval(copperStandard.getTypeIiUl().doubleValue(), copperStandard.getTypeIiUlSoc(),
                copperStandard.getTypeIiLl().doubleValue(), copperStandard.getTypeIiLlSoc());
        Interval copperInterval3 = new Interval(copperStandard.getTypeIiiUl().doubleValue(), copperStandard.getTypeIiiUlSoc(),
                copperStandard.getTypeIiiLl().doubleValue(), copperStandard.getTypeIiiLlSoc());
        Interval copperInterval4 = new Interval(copperStandard.getTypeIvUl().doubleValue(), copperStandard.getTypeIvUlSoc(),
                copperStandard.getTypeIvLl().doubleValue(), copperStandard.getTypeIvLlSoc());
        Interval copperInterval5 = new Interval(copperStandard.getTypeVUl().doubleValue(), copperStandard.getTypeVUlSoc(),
                copperStandard.getTypeVLl().doubleValue(), copperStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(copperInterval1, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(copperInterval2, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(copperInterval3, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(copperInterval4, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(copperInterval5, mi.getCopper().doubleValue())) {
            estimate.setCopperT((short) 5);
        } else {
            estimate.setCopperT((short) 6);
        }
    }

    /**
     * 锌
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateZn(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard zincStandard = standardManager.selectTrunkByEvaluateItem("锌类别");
        Interval zincInterval1 = new Interval(zincStandard.getTypeIUl().doubleValue(), zincStandard.getTypeIUlSoc(),
                zincStandard.getTypeILl().doubleValue(), zincStandard.getTypeILlSoc());
        Interval zincInterval2 = new Interval(zincStandard.getTypeIiUl().doubleValue(), zincStandard.getTypeIiUlSoc(),
                zincStandard.getTypeIiLl().doubleValue(), zincStandard.getTypeIiLlSoc());
        Interval zincInterval3 = new Interval(zincStandard.getTypeIiiUl().doubleValue(), zincStandard.getTypeIiiUlSoc(),
                zincStandard.getTypeIiiLl().doubleValue(), zincStandard.getTypeIiiLlSoc());
        Interval zincInterval4 = new Interval(zincStandard.getTypeIvUl().doubleValue(), zincStandard.getTypeIvUlSoc(),
                zincStandard.getTypeIvLl().doubleValue(), zincStandard.getTypeIvLlSoc());
        Interval zincInterval5 = new Interval(zincStandard.getTypeVUl().doubleValue(), zincStandard.getTypeVUlSoc(),
                zincStandard.getTypeVLl().doubleValue(), zincStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(zincInterval1, mi.getZinc().doubleValue())) {
            estimate.setZincT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(zincInterval2, mi.getZinc().doubleValue())) {
            estimate.setZincT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(zincInterval3, mi.getZinc().doubleValue())) {
            estimate.setZincT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(zincInterval4, mi.getZinc().doubleValue())) {
            estimate.setZincT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(zincInterval5, mi.getZinc().doubleValue())) {
            estimate.setZincT((short) 5);
        } else {
            estimate.setZincT((short) 6);
        }
    }

    /**
     * 氟化物
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateXF(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard fluorideStandard = standardManager.selectTrunkByEvaluateItem("氟化物类别");
        Interval fluorideInterval1 = new Interval(fluorideStandard.getTypeIUl().doubleValue(), fluorideStandard.getTypeIUlSoc(),
                fluorideStandard.getTypeILl().doubleValue(), fluorideStandard.getTypeILlSoc());
        Interval fluorideInterval2 = new Interval(fluorideStandard.getTypeIiUl().doubleValue(), fluorideStandard.getTypeIiUlSoc(),
                fluorideStandard.getTypeIiLl().doubleValue(), fluorideStandard.getTypeIiLlSoc());
        Interval fluorideInterval3 = new Interval(fluorideStandard.getTypeIiiUl().doubleValue(), fluorideStandard.getTypeIiiUlSoc(),
                fluorideStandard.getTypeIiiLl().doubleValue(), fluorideStandard.getTypeIiiLlSoc());
        Interval fluorideInterval4 = new Interval(fluorideStandard.getTypeIvUl().doubleValue(), fluorideStandard.getTypeIvUlSoc(),
                fluorideStandard.getTypeIvLl().doubleValue(), fluorideStandard.getTypeIvLlSoc());
        Interval fluorideInterval5 = new Interval(fluorideStandard.getTypeVUl().doubleValue(), fluorideStandard.getTypeVUlSoc(),
                fluorideStandard.getTypeVLl().doubleValue(), fluorideStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(fluorideInterval1, mi.getFluoride().doubleValue())) {
            estimate.setFluorideT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(fluorideInterval2, mi.getFluoride().doubleValue())) {
            estimate.setFluorideT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(fluorideInterval3, mi.getFluoride().doubleValue())) {
            estimate.setFluorideT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(fluorideInterval4, mi.getFluoride().doubleValue())) {
            estimate.setFluorideT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(fluorideInterval5, mi.getFluoride().doubleValue())) {
            estimate.setFluorideT((short) 5);
        } else {
            estimate.setFluorideT((short) 6);
        }
    }

    /**
     * 硒类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateSe(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard seleniumStandard = standardManager.selectTrunkByEvaluateItem("硒类别");
        Interval seleniumInterval1 = new Interval(seleniumStandard.getTypeIUl().doubleValue(), seleniumStandard.getTypeIUlSoc(),
                seleniumStandard.getTypeILl().doubleValue(), seleniumStandard.getTypeILlSoc());
        Interval seleniumInterval2 = new Interval(seleniumStandard.getTypeIiUl().doubleValue(), seleniumStandard.getTypeIiUlSoc(),
                seleniumStandard.getTypeIiLl().doubleValue(), seleniumStandard.getTypeIiLlSoc());
        Interval seleniumInterval3 = new Interval(seleniumStandard.getTypeIiiUl().doubleValue(), seleniumStandard.getTypeIiiUlSoc(),
                seleniumStandard.getTypeIiiLl().doubleValue(), seleniumStandard.getTypeIiiLlSoc());
        Interval seleniumInterval4 = new Interval(seleniumStandard.getTypeIvUl().doubleValue(), seleniumStandard.getTypeIvUlSoc(),
                seleniumStandard.getTypeIvLl().doubleValue(), seleniumStandard.getTypeIvLlSoc());
        Interval seleniumInterval5 = new Interval(seleniumStandard.getTypeVUl().doubleValue(), seleniumStandard.getTypeVUlSoc(),
                seleniumStandard.getTypeVLl().doubleValue(), seleniumStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(seleniumInterval1, mi.getSelenium().doubleValue())) {
            estimate.setSeleniumT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(seleniumInterval2, mi.getSelenium().doubleValue())) {
            estimate.setSeleniumT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(seleniumInterval3, mi.getSelenium().doubleValue())) {
            estimate.setSeleniumT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(seleniumInterval4, mi.getSelenium().doubleValue())) {
            estimate.setSeleniumT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(seleniumInterval5, mi.getSelenium().doubleValue())) {
            estimate.setSeleniumT((short) 5);
        } else {
            estimate.setSeleniumT((short) 6);
        }
    }

    /**
     * 砷类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateAs(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard arsenicStandard = standardManager.selectTrunkByEvaluateItem("砷类别");
        Interval arsenicInterval1 = new Interval(arsenicStandard.getTypeIUl().doubleValue(), arsenicStandard.getTypeIUlSoc(),
                arsenicStandard.getTypeILl().doubleValue(), arsenicStandard.getTypeILlSoc());
        Interval arsenicInterval2 = new Interval(arsenicStandard.getTypeIiUl().doubleValue(), arsenicStandard.getTypeIiUlSoc(),
                arsenicStandard.getTypeIiLl().doubleValue(), arsenicStandard.getTypeIiLlSoc());
        Interval arsenicInterval3 = new Interval(arsenicStandard.getTypeIiiUl().doubleValue(), arsenicStandard.getTypeIiiUlSoc(),
                arsenicStandard.getTypeIiiLl().doubleValue(), arsenicStandard.getTypeIiiLlSoc());
        Interval arsenicInterval4 = new Interval(arsenicStandard.getTypeIvUl().doubleValue(), arsenicStandard.getTypeIvUlSoc(),
                arsenicStandard.getTypeIvLl().doubleValue(), arsenicStandard.getTypeIvLlSoc());
        Interval arsenicInterval5 = new Interval(arsenicStandard.getTypeVUl().doubleValue(), arsenicStandard.getTypeVUlSoc(),
                arsenicStandard.getTypeVLl().doubleValue(), arsenicStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(arsenicInterval1, mi.getArsenic().doubleValue())) {
            estimate.setArsenicT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(arsenicInterval2, mi.getArsenic().doubleValue())) {
            estimate.setArsenicT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(arsenicInterval3, mi.getArsenic().doubleValue())) {
            estimate.setArsenicT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(arsenicInterval4, mi.getArsenic().doubleValue())) {
            estimate.setArsenicT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(arsenicInterval5, mi.getArsenic().doubleValue())) {
            estimate.setArsenicT((short) 5);
        } else {
            estimate.setArsenicT((short) 6);
        }
    }

    /**
     * 汞类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateHg(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard mercuryStandard = standardManager.selectTrunkByEvaluateItem("汞类别");
        Interval mercuryInterval1 = new Interval(mercuryStandard.getTypeIUl().doubleValue(), mercuryStandard.getTypeIUlSoc(),
                mercuryStandard.getTypeILl().doubleValue(), mercuryStandard.getTypeILlSoc());
        Interval mercuryInterval2 = new Interval(mercuryStandard.getTypeIiUl().doubleValue(), mercuryStandard.getTypeIiUlSoc(),
                mercuryStandard.getTypeIiLl().doubleValue(), mercuryStandard.getTypeIiLlSoc());
        Interval mercuryInterval3 = new Interval(mercuryStandard.getTypeIiiUl().doubleValue(), mercuryStandard.getTypeIiiUlSoc(),
                mercuryStandard.getTypeIiiLl().doubleValue(), mercuryStandard.getTypeIiiLlSoc());
        Interval mercuryInterval4 = new Interval(mercuryStandard.getTypeIvUl().doubleValue(), mercuryStandard.getTypeIvUlSoc(),
                mercuryStandard.getTypeIvLl().doubleValue(), mercuryStandard.getTypeIvLlSoc());
        Interval mercuryInterval5 = new Interval(mercuryStandard.getTypeVUl().doubleValue(), mercuryStandard.getTypeVUlSoc(),
                mercuryStandard.getTypeVLl().doubleValue(), mercuryStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(mercuryInterval1, mi.getMercury().doubleValue())) {
            estimate.setMercuryT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(mercuryInterval2, mi.getMercury().doubleValue())) {
            estimate.setMercuryT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(mercuryInterval3, mi.getMercury().doubleValue())) {
            estimate.setMercuryT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(mercuryInterval4, mi.getMercury().doubleValue())) {
            estimate.setMercuryT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(mercuryInterval5, mi.getMercury().doubleValue())) {
            estimate.setMercuryT((short) 5);
        } else {
            estimate.setMercuryT((short) 6);
        }
    }

    /**
     * 镉类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateCd(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard cadmiumStandard = standardManager.selectTrunkByEvaluateItem("镉类别");
        Interval cadmiumInterval1 = new Interval(cadmiumStandard.getTypeIUl().doubleValue(), cadmiumStandard.getTypeIUlSoc(),
                cadmiumStandard.getTypeILl().doubleValue(), cadmiumStandard.getTypeILlSoc());
        Interval cadmiumInterval2 = new Interval(cadmiumStandard.getTypeIiUl().doubleValue(), cadmiumStandard.getTypeIiUlSoc(),
                cadmiumStandard.getTypeIiLl().doubleValue(), cadmiumStandard.getTypeIiLlSoc());
        Interval cadmiumInterval3 = new Interval(cadmiumStandard.getTypeIiiUl().doubleValue(), cadmiumStandard.getTypeIiiUlSoc(),
                cadmiumStandard.getTypeIiiLl().doubleValue(), cadmiumStandard.getTypeIiiLlSoc());
        Interval cadmiumInterval4 = new Interval(cadmiumStandard.getTypeIvUl().doubleValue(), cadmiumStandard.getTypeIvUlSoc(),
                cadmiumStandard.getTypeIvLl().doubleValue(), cadmiumStandard.getTypeIvLlSoc());
        Interval cadmiumInterval5 = new Interval(cadmiumStandard.getTypeVUl().doubleValue(), cadmiumStandard.getTypeVUlSoc(),
                cadmiumStandard.getTypeVLl().doubleValue(), cadmiumStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(cadmiumInterval1, mi.getCadmium().doubleValue())) {
            estimate.setCadmiumT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(cadmiumInterval2, mi.getCadmium().doubleValue())) {
            estimate.setCadmiumT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(cadmiumInterval3, mi.getCadmium().doubleValue())) {
            estimate.setCadmiumT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(cadmiumInterval4, mi.getCadmium().doubleValue())) {
            estimate.setCadmiumT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(cadmiumInterval5, mi.getCadmium().doubleValue())) {
            estimate.setCadmiumT((short) 5);
        } else {
            estimate.setCadmiumT((short) 6);
        }
    }

    /**
     * 六价铬类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateCr6(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard chromiumStandard = standardManager.selectTrunkByEvaluateItem("六价铬类别");
        Interval chromiumInterval1 = new Interval(chromiumStandard.getTypeIUl().doubleValue(), chromiumStandard.getTypeIUlSoc(),
                chromiumStandard.getTypeILl().doubleValue(), chromiumStandard.getTypeILlSoc());
        Interval chromiumInterval2 = new Interval(chromiumStandard.getTypeIiUl().doubleValue(), chromiumStandard.getTypeIiUlSoc(),
                chromiumStandard.getTypeIiLl().doubleValue(), chromiumStandard.getTypeIiLlSoc());
        Interval chromiumInterval3 = new Interval(chromiumStandard.getTypeIiiUl().doubleValue(), chromiumStandard.getTypeIiiUlSoc(),
                chromiumStandard.getTypeIiiLl().doubleValue(), chromiumStandard.getTypeIiiLlSoc());
        Interval chromiumInterval4 = new Interval(chromiumStandard.getTypeIvUl().doubleValue(), chromiumStandard.getTypeIvUlSoc(),
                chromiumStandard.getTypeIvLl().doubleValue(), chromiumStandard.getTypeIvLlSoc());
        Interval chromiumInterval5 = new Interval(chromiumStandard.getTypeVUl().doubleValue(), chromiumStandard.getTypeVUlSoc(),
                chromiumStandard.getTypeVLl().doubleValue(), chromiumStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(chromiumInterval1, mi.getChromium().doubleValue())) {
            estimate.setChromiumT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(chromiumInterval2, mi.getChromium().doubleValue())) {
            estimate.setChromiumT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(chromiumInterval3, mi.getChromium().doubleValue())) {
            estimate.setChromiumT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(chromiumInterval4, mi.getChromium().doubleValue())) {
            estimate.setChromiumT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(chromiumInterval5, mi.getChromium().doubleValue())) {
            estimate.setChromiumT((short) 5);
        } else {
            estimate.setChromiumT((short) 6);
        }
    }

    /**
     * 铅类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimatePb(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard leadStandard = standardManager.selectTrunkByEvaluateItem("铅类别");
        Interval leadInterval1 = new Interval(leadStandard.getTypeIUl().doubleValue(), leadStandard.getTypeIUlSoc(),
                leadStandard.getTypeILl().doubleValue(), leadStandard.getTypeILlSoc());
        Interval leadInterval2 = new Interval(leadStandard.getTypeIiUl().doubleValue(), leadStandard.getTypeIiUlSoc(),
                leadStandard.getTypeIiLl().doubleValue(), leadStandard.getTypeIiLlSoc());
        Interval leadInterval3 = new Interval(leadStandard.getTypeIiiUl().doubleValue(), leadStandard.getTypeIiiUlSoc(),
                leadStandard.getTypeIiiLl().doubleValue(), leadStandard.getTypeIiiLlSoc());
        Interval leadInterval4 = new Interval(leadStandard.getTypeIvUl().doubleValue(), leadStandard.getTypeIvUlSoc(),
                leadStandard.getTypeIvLl().doubleValue(), leadStandard.getTypeIvLlSoc());
        Interval leadInterval5 = new Interval(leadStandard.getTypeVUl().doubleValue(), leadStandard.getTypeVUlSoc(),
                leadStandard.getTypeVLl().doubleValue(), leadStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(leadInterval1, mi.getLead().doubleValue())) {
            estimate.setLeadT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(leadInterval2, mi.getLead().doubleValue())) {
            estimate.setLeadT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(leadInterval3, mi.getLead().doubleValue())) {
            estimate.setLeadT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(leadInterval4, mi.getLead().doubleValue())) {
            estimate.setLeadT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(leadInterval5, mi.getLead().doubleValue())) {
            estimate.setLeadT((short) 5);
        } else {
            estimate.setLeadT((short) 6);
        }
    }

    /**
     * 氰化物类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateXCN(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard cyanideStandard = standardManager.selectTrunkByEvaluateItem("氰化物类别");
        Interval cyanideInterval1 = new Interval(cyanideStandard.getTypeIUl().doubleValue(), cyanideStandard.getTypeIUlSoc(),
                cyanideStandard.getTypeILl().doubleValue(), cyanideStandard.getTypeILlSoc());
        Interval cyanideInterval2 = new Interval(cyanideStandard.getTypeIiUl().doubleValue(), cyanideStandard.getTypeIiUlSoc(),
                cyanideStandard.getTypeIiLl().doubleValue(), cyanideStandard.getTypeIiLlSoc());
        Interval cyanideInterval3 = new Interval(cyanideStandard.getTypeIiiUl().doubleValue(), cyanideStandard.getTypeIiiUlSoc(),
                cyanideStandard.getTypeIiiLl().doubleValue(), cyanideStandard.getTypeIiiLlSoc());
        Interval cyanideInterval4 = new Interval(cyanideStandard.getTypeIvUl().doubleValue(), cyanideStandard.getTypeIvUlSoc(),
                cyanideStandard.getTypeIvLl().doubleValue(), cyanideStandard.getTypeIvLlSoc());
        Interval cyanideInterval5 = new Interval(cyanideStandard.getTypeVUl().doubleValue(), cyanideStandard.getTypeVUlSoc(),
                cyanideStandard.getTypeVLl().doubleValue(), cyanideStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(cyanideInterval1, mi.getCyanide().doubleValue())) {
            estimate.setCyanideT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(cyanideInterval2, mi.getCyanide().doubleValue())) {
            estimate.setCyanideT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(cyanideInterval3, mi.getCyanide().doubleValue())) {
            estimate.setCyanideT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(cyanideInterval4, mi.getCyanide().doubleValue())) {
            estimate.setCyanideT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(cyanideInterval5, mi.getCyanide().doubleValue())) {
            estimate.setCyanideT((short) 5);
        } else {
            estimate.setCyanideT((short) 6);
        }
    }

    /**
     * 挥发酚类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateVP(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard phenolStandard = standardManager.selectTrunkByEvaluateItem("挥发酚类别");
        Interval phenolInterval1 = new Interval(phenolStandard.getTypeIUl().doubleValue(), phenolStandard.getTypeIUlSoc(),
                phenolStandard.getTypeILl().doubleValue(), phenolStandard.getTypeILlSoc());
        Interval phenolInterval2 = new Interval(phenolStandard.getTypeIiUl().doubleValue(), phenolStandard.getTypeIiUlSoc(),
                phenolStandard.getTypeIiLl().doubleValue(), phenolStandard.getTypeIiLlSoc());
        Interval phenolInterval3 = new Interval(phenolStandard.getTypeIiiUl().doubleValue(), phenolStandard.getTypeIiiUlSoc(),
                phenolStandard.getTypeIiiLl().doubleValue(), phenolStandard.getTypeIiiLlSoc());
        Interval phenolInterval4 = new Interval(phenolStandard.getTypeIvUl().doubleValue(), phenolStandard.getTypeIvUlSoc(),
                phenolStandard.getTypeIvLl().doubleValue(), phenolStandard.getTypeIvLlSoc());
        Interval phenolInterval5 = new Interval(phenolStandard.getTypeVUl().doubleValue(), phenolStandard.getTypeVUlSoc(),
                phenolStandard.getTypeVLl().doubleValue(), phenolStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(phenolInterval1, mi.getPhenol().doubleValue())) {
            estimate.setPhenolT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(phenolInterval2, mi.getPhenol().doubleValue())) {
            estimate.setPhenolT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(phenolInterval3, mi.getPhenol().doubleValue())) {
            estimate.setPhenolT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(phenolInterval4, mi.getPhenol().doubleValue())) {
            estimate.setPhenolT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(phenolInterval5, mi.getPhenol().doubleValue())) {
            estimate.setPhenolT((short) 5);
        } else {
            estimate.setPhenolT((short) 6);
        }
    }

    /**
     * 石油类类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimatePetroleum(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard petroleumStandard = standardManager.selectTrunkByEvaluateItem("石油类类别");
        Interval petroleumInterval1 = new Interval(petroleumStandard.getTypeIUl().doubleValue(), petroleumStandard.getTypeIUlSoc(),
                petroleumStandard.getTypeILl().doubleValue(), petroleumStandard.getTypeILlSoc());
        Interval petroleumInterval2 = new Interval(petroleumStandard.getTypeIiUl().doubleValue(), petroleumStandard.getTypeIiUlSoc(),
                petroleumStandard.getTypeIiLl().doubleValue(), petroleumStandard.getTypeIiLlSoc());
        Interval petroleumInterval3 = new Interval(petroleumStandard.getTypeIiiUl().doubleValue(),
                petroleumStandard.getTypeIiiUlSoc(), petroleumStandard.getTypeIiiLl().doubleValue(),
                petroleumStandard.getTypeIiiLlSoc());
        Interval petroleumInterval4 = new Interval(petroleumStandard.getTypeIvUl().doubleValue(), petroleumStandard.getTypeIvUlSoc(),
                petroleumStandard.getTypeIvLl().doubleValue(), petroleumStandard.getTypeIvLlSoc());
        Interval petroleumInterval5 = new Interval(petroleumStandard.getTypeVUl().doubleValue(), petroleumStandard.getTypeVUlSoc(),
                petroleumStandard.getTypeVLl().doubleValue(), petroleumStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(petroleumInterval1, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(petroleumInterval2, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(petroleumInterval3, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(petroleumInterval4, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(petroleumInterval5, mi.getPetroleum().doubleValue())) {
            estimate.setPetroleumT((short) 5);
        } else {
            estimate.setPetroleumT((short) 6);
        }
    }

    /**
     * 阴离子表面活性剂类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateAnionicSurfactant(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard surfactantStandard = standardManager.selectTrunkByEvaluateItem("阴离子表面活性剂类别");
        Interval surfactantInterval1 = new Interval(surfactantStandard.getTypeIUl().doubleValue(), surfactantStandard.getTypeIUlSoc(),
                surfactantStandard.getTypeILl().doubleValue(), surfactantStandard.getTypeILlSoc());
        Interval surfactantInterval2 = new Interval(surfactantStandard.getTypeIiUl().doubleValue(),
                surfactantStandard.getTypeIiUlSoc(), surfactantStandard.getTypeIiLl().doubleValue(),
                surfactantStandard.getTypeIiLlSoc());
        Interval surfactantInterval3 = new Interval(surfactantStandard.getTypeIiiUl().doubleValue(),
                surfactantStandard.getTypeIiiUlSoc(), surfactantStandard.getTypeIiiLl().doubleValue(),
                surfactantStandard.getTypeIiiLlSoc());
        Interval surfactantInterval4 = new Interval(surfactantStandard.getTypeIvUl().doubleValue(),
                surfactantStandard.getTypeIvUlSoc(), surfactantStandard.getTypeIvLl().doubleValue(),
                surfactantStandard.getTypeIvLlSoc());
        Interval surfactantInterval5 = new Interval(surfactantStandard.getTypeVUl().doubleValue(), surfactantStandard.getTypeVUlSoc(),
                surfactantStandard.getTypeVLl().doubleValue(), surfactantStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(surfactantInterval1, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(surfactantInterval2, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(surfactantInterval3, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(surfactantInterval4, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(surfactantInterval5, mi.getSurfactant().doubleValue())) {
            estimate.setSurfactantT((short) 5);
        } else {
            estimate.setSurfactantT((short) 6);
        }
    }

    /**
     * 硫化物类别
     *
     * @param mi
     * @param estimate
     * @throws Exception
     */
    private void estimateXS(WaterQualityMIBase mi, WaterQualityEstimateBO estimate) throws Exception {
        TrunkStandard sulfideStandard = standardManager.selectTrunkByEvaluateItem("硫化物类别");
        Interval sulfideInterval1 = new Interval(sulfideStandard.getTypeIUl().doubleValue(), sulfideStandard.getTypeIUlSoc(),
                sulfideStandard.getTypeILl().doubleValue(), sulfideStandard.getTypeILlSoc());
        Interval sulfideInterval2 = new Interval(sulfideStandard.getTypeIiUl().doubleValue(), sulfideStandard.getTypeIiUlSoc(),
                sulfideStandard.getTypeIiLl().doubleValue(), sulfideStandard.getTypeIiLlSoc());
        Interval sulfideInterval3 = new Interval(sulfideStandard.getTypeIiiUl().doubleValue(), sulfideStandard.getTypeIiiUlSoc(),
                sulfideStandard.getTypeIiiLl().doubleValue(), sulfideStandard.getTypeIiiLlSoc());
        Interval sulfideInterval4 = new Interval(sulfideStandard.getTypeIvUl().doubleValue(), sulfideStandard.getTypeIvUlSoc(),
                sulfideStandard.getTypeIvLl().doubleValue(), sulfideStandard.getTypeIvLlSoc());
        Interval sulfideInterval5 = new Interval(sulfideStandard.getTypeVUl().doubleValue(), sulfideStandard.getTypeVUlSoc(),
                sulfideStandard.getTypeVLl().doubleValue(), sulfideStandard.getTypeVLlSoc());
        if (IntervalUtil.intervalContainsValue(sulfideInterval1, mi.getSulfide().doubleValue())) {
            estimate.setSulfideT((short) 1);
        } else if (IntervalUtil.intervalContainsValue(sulfideInterval2, mi.getSulfide().doubleValue())) {
            estimate.setSulfideT((short) 2);
        } else if (IntervalUtil.intervalContainsValue(sulfideInterval3, mi.getSulfide().doubleValue())) {
            estimate.setSulfideT((short) 3);
        } else if (IntervalUtil.intervalContainsValue(sulfideInterval4, mi.getSulfide().doubleValue())) {
            estimate.setSulfideT((short) 4);
        } else if (IntervalUtil.intervalContainsValue(sulfideInterval5, mi.getSulfide().doubleValue())) {
            estimate.setSulfideT((short) 5);
        } else {
            estimate.setSulfideT((short) 6);
        }
    }
}
