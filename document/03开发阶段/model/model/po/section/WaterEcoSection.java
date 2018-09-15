package com.rdc.kingsa.model.po.section;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/24.
 */
public class WaterEcoSection extends BaseSection {
    String region;

    BigDecimal fromWdd;

    Short rareFish;

    Short economicFish;

    Short reproEcology;

    Short fisheryEnv;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(BigDecimal fromWdd) {
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
