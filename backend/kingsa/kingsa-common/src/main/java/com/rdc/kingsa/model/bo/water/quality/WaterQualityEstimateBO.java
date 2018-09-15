package com.rdc.kingsa.model.bo.water.quality;


import com.rdc.kingsa.annotation.MonitoringField;

/**
 * Created by lxf on 18/9/13.
 */
public class WaterQualityEstimateBO {

    @MonitoringField(cordon = 3, below = true)
    private Short phT;

    @MonitoringField(cordon = 3, below = false)
    private Short disOxygenT;

    @MonitoringField(cordon = 3, below = true)
    private Short permanganateT;

    @MonitoringField(cordon = 3, below = true)
    private Short oxDemandT;

    @MonitoringField(cordon = 3, below = true)
    private Short boDemandT;

    @MonitoringField(cordon = 3, below = true)
    private Short ammoniaT;

    @MonitoringField(cordon = 3, below = true)
    private Short phosphorusT;

    @MonitoringField(cordon = 3, below = true)
    private Short copperT;

    @MonitoringField(cordon = 3, below = true)
    private Short zincT;

    @MonitoringField(cordon = 3, below = true)
    private Short fluorideT;

    @MonitoringField(cordon = 3, below = true)
    private Short seleniumT;

    @MonitoringField(cordon = 3, below = true)
    private Short arsenicT;

    @MonitoringField(cordon = 3, below = true)
    private Short mercuryT;

    @MonitoringField(cordon = 3, below = true)
    private Short cadmiumT;

    @MonitoringField(cordon = 3, below = true)
    private Short chromiumT;

    @MonitoringField(cordon = 3, below = true)
    private Short leadT;

    @MonitoringField(cordon = 3, below = true)
    private Short cyanideT;

    @MonitoringField(cordon = 3, below = true)
    private Short phenolT;

    @MonitoringField(cordon = 3, below = true)
    private Short petroleumT;

    @MonitoringField(cordon = 3, below = true)
    private Short surfactantT;

    @MonitoringField(cordon = 3, below = true)
    private Short sulfideT;

    private Short qaType;

    private String qaTypeLatin;

    private String overItems;

    public Short getPhT() {
        return phT;
    }

    public void setPhT(Short phT) {
        this.phT = phT;
    }

    public Short getDisOxygenT() {
        return disOxygenT;
    }

    public void setDisOxygenT(Short disOxygenT) {
        this.disOxygenT = disOxygenT;
    }

    public Short getPermanganateT() {
        return permanganateT;
    }

    public void setPermanganateT(Short permanganateT) {
        this.permanganateT = permanganateT;
    }

    public Short getOxDemandT() {
        return oxDemandT;
    }

    public void setOxDemandT(Short oxDemandT) {
        this.oxDemandT = oxDemandT;
    }

    public Short getBoDemandT() {
        return boDemandT;
    }

    public void setBoDemandT(Short boDemandT) {
        this.boDemandT = boDemandT;
    }

    public Short getAmmoniaT() {
        return ammoniaT;
    }

    public void setAmmoniaT(Short ammoniaT) {
        this.ammoniaT = ammoniaT;
    }

    public Short getPhosphorusT() {
        return phosphorusT;
    }

    public void setPhosphorusT(Short phosphorusT) {
        this.phosphorusT = phosphorusT;
    }

    public Short getCopperT() {
        return copperT;
    }

    public void setCopperT(Short copperT) {
        this.copperT = copperT;
    }

    public Short getZincT() {
        return zincT;
    }

    public void setZincT(Short zincT) {
        this.zincT = zincT;
    }

    public Short getFluorideT() {
        return fluorideT;
    }

    public void setFluorideT(Short fluorideT) {
        this.fluorideT = fluorideT;
    }

    public Short getSeleniumT() {
        return seleniumT;
    }

    public void setSeleniumT(Short seleniumT) {
        this.seleniumT = seleniumT;
    }

    public Short getArsenicT() {
        return arsenicT;
    }

    public void setArsenicT(Short arsenicT) {
        this.arsenicT = arsenicT;
    }

    public Short getMercuryT() {
        return mercuryT;
    }

    public void setMercuryT(Short mercuryT) {
        this.mercuryT = mercuryT;
    }

    public Short getCadmiumT() {
        return cadmiumT;
    }

    public void setCadmiumT(Short cadmiumT) {
        this.cadmiumT = cadmiumT;
    }

    public Short getChromiumT() {
        return chromiumT;
    }

    public void setChromiumT(Short chromiumT) {
        this.chromiumT = chromiumT;
    }

    public Short getLeadT() {
        return leadT;
    }

    public void setLeadT(Short leadT) {
        this.leadT = leadT;
    }

    public Short getCyanideT() {
        return cyanideT;
    }

    public void setCyanideT(Short cyanideT) {
        this.cyanideT = cyanideT;
    }

    public Short getPhenolT() {
        return phenolT;
    }

    public void setPhenolT(Short phenolT) {
        this.phenolT = phenolT;
    }

    public Short getPetroleumT() {
        return petroleumT;
    }

    public void setPetroleumT(Short petroleumT) {
        this.petroleumT = petroleumT;
    }

    public Short getSurfactantT() {
        return surfactantT;
    }

    public void setSurfactantT(Short surfactantT) {
        this.surfactantT = surfactantT;
    }

    public Short getSulfideT() {
        return sulfideT;
    }

    public void setSulfideT(Short sulfideT) {
        this.sulfideT = sulfideT;
    }

    public Short getQaType() {
        return qaType;
    }

    public void setQaType(Short qaType) {
        this.qaType = qaType;
    }

    public String getQaTypeLatin() {
        return qaTypeLatin;
    }

    public void setQaTypeLatin(String qaTypeLatin) {
        this.qaTypeLatin = qaTypeLatin;
    }

    public String getOverItems() {
        return overItems;
    }

    public void setOverItems(String overItems) {
        this.overItems = overItems;
    }
}
