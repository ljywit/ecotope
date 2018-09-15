package com.rdc.kingsa.model.vo.section;

/**
 * @ClassName:AquaticEcologySectionResult
 * @Description:水生生态断面
 * @Author:Shelly Chan
 * @CreateTime:2018年6月21日下午3:00:36
 */
public class WaterEcoSectionVO extends SectionBaseInfo {

    private String region;

    private Double fromWdd;

    private Short rareFish;

    private Short economicFish;

    private Short reproEcology;

    private Short fisheryEnv;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }

    public Short getRareFish() {
        return rareFish;
    }

    public void setRareFish(Short rareFish) {
        this.rareFish = rareFish;
    }

    public Short getEconomicFish() {
        return economicFish;
    }

    public void setEconomicFish(Short economicFish) {
        this.economicFish = economicFish;
    }

    public Short getReproEcology() {
        return reproEcology;
    }

    public void setReproEcology(Short reproEcology) {
        this.reproEcology = reproEcology;
    }

    public Short getFisheryEnv() {
        return fisheryEnv;
    }

    public void setFisheryEnv(Short fisheryEnv) {
        this.fisheryEnv = fisheryEnv;
    }
}