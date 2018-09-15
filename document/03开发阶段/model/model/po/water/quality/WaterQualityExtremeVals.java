package com.rdc.kingsa.model.po.water.quality;

import com.rdc.kingsa.annotation.water.quality.Extreme;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/20.
 */
public class WaterQualityExtremeVals {
    String sectionId;
    String sectionName;
    Short drainOutlet;
    Short qaPlan;
    @Extreme(prop = "waterTemp", type = "Max")
    BigDecimal waterTempMax;
    @Extreme(prop = "waterTemp", type = "Min")
    BigDecimal waterTempMin;
    @Extreme(prop = "waterTemp", type = "Min")
    BigDecimal waterTempAvg;
    @Extreme(prop = "phValue", type = "Max")
    BigDecimal phValueMax;
    @Extreme(prop = "phValue", type = "Min")
    BigDecimal phValueMin;
    BigDecimal phValueAvg;
    @Extreme(prop = "disOxygen", type = "Max")
    BigDecimal disOxygenMax;
    @Extreme(prop = "disOxygen", type = "Min")
    BigDecimal disOxygenMin;
    BigDecimal disOxygenAvg;
    @Extreme(prop = "permanganate", type = "Max")
    BigDecimal permanganteMax;
    @Extreme(prop = "permanganate", type = "Min")
    BigDecimal permanganteMin;
    BigDecimal permanganteAvg;
    @Extreme(prop = "oxDemand", type = "Max")
    BigDecimal oxDemandMax;
    @Extreme(prop = "oxDemand", type = "Min")
    BigDecimal oxDemandMin;
    BigDecimal oxDemandAvg;
    @Extreme(prop = "boDemand", type = "Max")
    BigDecimal boDemandMax;
    @Extreme(prop = "boDemand", type = "Min")
    BigDecimal boDemandMin;
    BigDecimal boDemandAvg;
    @Extreme(prop = "ammonia", type = "Max")
    BigDecimal ammoniaMax;
    @Extreme(prop = "ammonia", type = "Min")
    BigDecimal ammoniaMin;
    BigDecimal ammoniaAvg;
    @Extreme(prop = "phosphorus", type = "Max")
    BigDecimal phosphorusMax;
    @Extreme(prop = "phosphorus", type = "Min")
    BigDecimal phosphorusMin;
    BigDecimal phosphorusAvg;
    @Extreme(prop = "nitrogen", type = "Max")
    BigDecimal nitrogenMax;
    @Extreme(prop = "nitrogen", type = "Min")
    BigDecimal nitrogenMin;
    BigDecimal nitrogenAvg;
    @Extreme(prop = "copper", type = "Max")
    BigDecimal copperMax;
    @Extreme(prop = "copper", type = "Min")
    BigDecimal copperMin;
    BigDecimal copperAvg;
    @Extreme(prop = "zinc", type = "Max")
    BigDecimal zincMax;
    @Extreme(prop = "zinc", type = "Min")
    BigDecimal zincMin;
    BigDecimal zincAvg;
    @Extreme(prop = "fluoride", type = "Max")
    BigDecimal fluorideMax;
    @Extreme(prop = "fluoride", type = "Min")
    BigDecimal fluorideMin;
    BigDecimal fluorideAvg;
    @Extreme(prop = "selenium", type = "Max")
    BigDecimal seleniumMax;
    @Extreme(prop = "selenium", type = "Min")
    BigDecimal seleniumMin;
    BigDecimal seleniumAvg;
    @Extreme(prop = "arsenic", type = "Max")
    BigDecimal arsenicMax;
    @Extreme(prop = "arsenic", type = "Min")
    BigDecimal arsenicMin;
    BigDecimal arsenicAvg;
    @Extreme(prop = "mercury", type = "Max")
    BigDecimal mercuryMax;
    @Extreme(prop = "mercury", type = "Min")
    BigDecimal mercuryMin;
    BigDecimal mercuryAvg;
    @Extreme(prop = "cadmium", type = "Max")
    BigDecimal cadmiumMax;
    @Extreme(prop = "cadmium", type = "Min")
    BigDecimal cadmiumMin;
    BigDecimal cadmiumAvg;
    @Extreme(prop = "chromium", type = "Max")
    BigDecimal chromiumMax;
    @Extreme(prop = "chromium", type = "Min")
    BigDecimal chromiumMin;
    BigDecimal chromiumAvg;
    @Extreme(prop = "lead", type = "Max")
    BigDecimal leadMax;
    @Extreme(prop = "lead", type = "Min")
    BigDecimal leadMin;
    BigDecimal leadAvg;
    @Extreme(prop = "cyanide", type = "Max")
    BigDecimal cyanideMax;
    @Extreme(prop = "cyanide", type = "Min")
    BigDecimal cyanideMin;
    BigDecimal cyanideAvg;
    @Extreme(prop = "phenol", type = "Max")
    BigDecimal phenolMax;
    @Extreme(prop = "phenol", type = "Min")
    BigDecimal phenolMin;
    BigDecimal phenolAvg;
    @Extreme(prop = "petroleum", type = "Max")
    BigDecimal petroleumMax;
    @Extreme(prop = "petroleum", type = "Min")
    BigDecimal petroleumMin;
    BigDecimal petroleumAvg;
    @Extreme(prop = "surfactant", type = "Max")
    BigDecimal surfactantMax;
    @Extreme(prop = "surfactant", type = "Min")
    BigDecimal surfactantMin;
    BigDecimal surfactantAvg;
    @Extreme(prop = "sulfide", type = "Max")
    BigDecimal sulfideMax;
    @Extreme(prop = "sulfide", type = "Min")
    BigDecimal sulfideMin;
    BigDecimal sulfideAvg;
    @Extreme(prop = "coliform", type = "Max")
    BigDecimal coliformMax;
    @Extreme(prop = "coliform", type = "Min")
    BigDecimal coliformMin;
    BigDecimal coliformAvg;
    @Extreme(prop = "chlorA", type = "Max")
    BigDecimal chlorAMax;
    @Extreme(prop = "chlorA", type = "Min")
    BigDecimal chlorAMin;
    BigDecimal chlorAAvg;
    @Extreme(prop = "transparency", type = "Max")
    BigDecimal transparencyMax;
    @Extreme(prop = "transparency", type = "Min")
    BigDecimal transparencyMin;
    BigDecimal transparencyAvg;
    @Extreme(prop = "suspended", type = "Max")
    BigDecimal suspendedMax;
    @Extreme(prop = "suspended", type = "Min")
    BigDecimal suspendedMin;
    BigDecimal suspendedAvg;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Short getDrainOutlet() {
        return drainOutlet;
    }

    public void setDrainOutlet(Short drainOutlet) {
        this.drainOutlet = drainOutlet;
    }

    public Short getQaPlan() {
        return qaPlan;
    }

    public void setQaPlan(Short qaPlan) {
        this.qaPlan = qaPlan;
    }

    public BigDecimal getWaterTempMin() {
        return waterTempMin;
    }

    public void setWaterTempMin(BigDecimal waterTempMin) {
        this.waterTempMin = waterTempMin;
    }

    public BigDecimal getWaterTempMax() {
        return waterTempMax;
    }

    public void setWaterTempMax(BigDecimal waterTempMax) {
        this.waterTempMax = waterTempMax;
    }

    public BigDecimal getWaterTempAvg() {
        return waterTempAvg;
    }

    public void setWaterTempAvg(BigDecimal waterTempAvg) {
        this.waterTempAvg = waterTempAvg;
    }

    public BigDecimal getPhValueMax() {
        return phValueMax;
    }

    public void setPhValueMax(BigDecimal phValueMax) {
        this.phValueMax = phValueMax;
    }

    public BigDecimal getPhValueMin() {
        return phValueMin;
    }

    public void setPhValueMin(BigDecimal phValueMin) {
        this.phValueMin = phValueMin;
    }

    public BigDecimal getPhValueAvg() {
        return phValueAvg;
    }

    public void setPhValueAvg(BigDecimal phValueAvg) {
        this.phValueAvg = phValueAvg;
    }

    public BigDecimal getPhenolMax() {
        return phenolMax;
    }

    public void setPhenolMax(BigDecimal phenolMax) {
        this.phenolMax = phenolMax;
    }

    public BigDecimal getPhenolMin() {
        return phenolMin;
    }

    public void setPhenolMin(BigDecimal phenolMin) {
        this.phenolMin = phenolMin;
    }

    public BigDecimal getPhenolAvg() {
        return phenolAvg;
    }

    public void setPhenolAvg(BigDecimal phenolAvg) {
        this.phenolAvg = phenolAvg;
    }

    public BigDecimal getDisOxygenMin() {
        return disOxygenMin;
    }

    public void setDisOxygenMin(BigDecimal disOxygenMin) {
        this.disOxygenMin = disOxygenMin;
    }

    public BigDecimal getDisOxygenMax() {
        return disOxygenMax;
    }

    public void setDisOxygenMax(BigDecimal disOxygenMax) {
        this.disOxygenMax = disOxygenMax;
    }

    public BigDecimal getDisOxygenAvg() {
        return disOxygenAvg;
    }

    public void setDisOxygenAvg(BigDecimal disOxygenAvg) {
        this.disOxygenAvg = disOxygenAvg;
    }

    public BigDecimal getPermanganteMin() {
        return permanganteMin;
    }

    public void setPermanganteMin(BigDecimal permanganteMin) {
        this.permanganteMin = permanganteMin;
    }

    public BigDecimal getPermanganteMax() {
        return permanganteMax;
    }

    public void setPermanganteMax(BigDecimal permanganteMax) {
        this.permanganteMax = permanganteMax;
    }

    public BigDecimal getPermanganteAvg() {
        return permanganteAvg;
    }

    public void setPermanganteAvg(BigDecimal permanganteAvg) {
        this.permanganteAvg = permanganteAvg;
    }

    public BigDecimal getOxDemandMin() {
        return oxDemandMin;
    }

    public void setOxDemandMin(BigDecimal oxDemandMin) {
        this.oxDemandMin = oxDemandMin;
    }

    public BigDecimal getOxDemandMax() {
        return oxDemandMax;
    }

    public void setOxDemandMax(BigDecimal oxDemandMax) {
        this.oxDemandMax = oxDemandMax;
    }

    public BigDecimal getOxDemandAvg() {
        return oxDemandAvg;
    }

    public void setOxDemandAvg(BigDecimal oxDemandAvg) {
        this.oxDemandAvg = oxDemandAvg;
    }

    public BigDecimal getBoDemandMax() {
        return boDemandMax;
    }

    public void setBoDemandMax(BigDecimal boDemandMax) {
        this.boDemandMax = boDemandMax;
    }

    public BigDecimal getBoDemandMin() {
        return boDemandMin;
    }

    public void setBoDemandMin(BigDecimal boDemandMin) {
        this.boDemandMin = boDemandMin;
    }

    public BigDecimal getBoDemandAvg() {
        return boDemandAvg;
    }

    public void setBoDemandAvg(BigDecimal boDemandAvg) {
        this.boDemandAvg = boDemandAvg;
    }

    public BigDecimal getAmmoniaMax() {
        return ammoniaMax;
    }

    public void setAmmoniaMax(BigDecimal ammoniaMax) {
        this.ammoniaMax = ammoniaMax;
    }

    public BigDecimal getAmmoniaMin() {
        return ammoniaMin;
    }

    public void setAmmoniaMin(BigDecimal ammoniaMin) {
        this.ammoniaMin = ammoniaMin;
    }

    public BigDecimal getAmmoniaAvg() {
        return ammoniaAvg;
    }

    public void setAmmoniaAvg(BigDecimal ammoniaAvg) {
        this.ammoniaAvg = ammoniaAvg;
    }

    public BigDecimal getPhosphorusMin() {
        return phosphorusMin;
    }

    public void setPhosphorusMin(BigDecimal phosphorusMin) {
        this.phosphorusMin = phosphorusMin;
    }

    public BigDecimal getPhosphorusMax() {
        return phosphorusMax;
    }

    public void setPhosphorusMax(BigDecimal phosphorusMax) {
        this.phosphorusMax = phosphorusMax;
    }

    public BigDecimal getPhosphorusAvg() {
        return phosphorusAvg;
    }

    public void setPhosphorusAvg(BigDecimal phosphorusAvg) {
        this.phosphorusAvg = phosphorusAvg;
    }

    public BigDecimal getNitrogenMin() {
        return nitrogenMin;
    }

    public void setNitrogenMin(BigDecimal nitrogenMin) {
        this.nitrogenMin = nitrogenMin;
    }

    public BigDecimal getNitrogenMax() {
        return nitrogenMax;
    }

    public void setNitrogenMax(BigDecimal nitrogenMax) {
        this.nitrogenMax = nitrogenMax;
    }

    public BigDecimal getNitrogenAvg() {
        return nitrogenAvg;
    }

    public void setNitrogenAvg(BigDecimal nitrogenAvg) {
        this.nitrogenAvg = nitrogenAvg;
    }

    public BigDecimal getCopperMax() {
        return copperMax;
    }

    public void setCopperMax(BigDecimal copperMax) {
        this.copperMax = copperMax;
    }

    public BigDecimal getCopperMin() {
        return copperMin;
    }

    public void setCopperMin(BigDecimal copperMin) {
        this.copperMin = copperMin;
    }

    public BigDecimal getCopperAvg() {
        return copperAvg;
    }

    public void setCopperAvg(BigDecimal copperAvg) {
        this.copperAvg = copperAvg;
    }

    public BigDecimal getZincMax() {
        return zincMax;
    }

    public void setZincMax(BigDecimal zincMax) {
        this.zincMax = zincMax;
    }

    public BigDecimal getZincMin() {
        return zincMin;
    }

    public void setZincMin(BigDecimal zincMin) {
        this.zincMin = zincMin;
    }

    public BigDecimal getZincAvg() {
        return zincAvg;
    }

    public void setZincAvg(BigDecimal zincAvg) {
        this.zincAvg = zincAvg;
    }

    public BigDecimal getFluorideMax() {
        return fluorideMax;
    }

    public void setFluorideMax(BigDecimal fluorideMax) {
        this.fluorideMax = fluorideMax;
    }

    public BigDecimal getFluorideMin() {
        return fluorideMin;
    }

    public void setFluorideMin(BigDecimal fluorideMin) {
        this.fluorideMin = fluorideMin;
    }

    public BigDecimal getFluorideAvg() {
        return fluorideAvg;
    }

    public void setFluorideAvg(BigDecimal fluorideAvg) {
        this.fluorideAvg = fluorideAvg;
    }

    public BigDecimal getSeleniumMax() {
        return seleniumMax;
    }

    public void setSeleniumMax(BigDecimal seleniumMax) {
        this.seleniumMax = seleniumMax;
    }

    public BigDecimal getSeleniumMin() {
        return seleniumMin;
    }

    public void setSeleniumMin(BigDecimal seleniumMin) {
        this.seleniumMin = seleniumMin;
    }

    public BigDecimal getSeleniumAvg() {
        return seleniumAvg;
    }

    public void setSeleniumAvg(BigDecimal seleniumAvg) {
        this.seleniumAvg = seleniumAvg;
    }

    public BigDecimal getArsenicMax() {
        return arsenicMax;
    }

    public void setArsenicMax(BigDecimal arsenicMax) {
        this.arsenicMax = arsenicMax;
    }

    public BigDecimal getArsenicMin() {
        return arsenicMin;
    }

    public void setArsenicMin(BigDecimal arsenicMin) {
        this.arsenicMin = arsenicMin;
    }

    public BigDecimal getArsenicAvg() {
        return arsenicAvg;
    }

    public void setArsenicAvg(BigDecimal arsenicAvg) {
        this.arsenicAvg = arsenicAvg;
    }

    public BigDecimal getMercuryMax() {
        return mercuryMax;
    }

    public void setMercuryMax(BigDecimal mercuryMax) {
        this.mercuryMax = mercuryMax;
    }

    public BigDecimal getMercuryMin() {
        return mercuryMin;
    }

    public void setMercuryMin(BigDecimal mercuryMin) {
        this.mercuryMin = mercuryMin;
    }

    public BigDecimal getMercuryAvg() {
        return mercuryAvg;
    }

    public void setMercuryAvg(BigDecimal mercuryAvg) {
        this.mercuryAvg = mercuryAvg;
    }

    public BigDecimal getCadmiumMax() {
        return cadmiumMax;
    }

    public void setCadmiumMax(BigDecimal cadmiumMax) {
        this.cadmiumMax = cadmiumMax;
    }

    public BigDecimal getCadmiumMin() {
        return cadmiumMin;
    }

    public void setCadmiumMin(BigDecimal cadmiumMin) {
        this.cadmiumMin = cadmiumMin;
    }

    public BigDecimal getCadmiumAvg() {
        return cadmiumAvg;
    }

    public void setCadmiumAvg(BigDecimal cadmiumAvg) {
        this.cadmiumAvg = cadmiumAvg;
    }

    public BigDecimal getChromiumMax() {
        return chromiumMax;
    }

    public void setChromiumMax(BigDecimal chromiumMax) {
        this.chromiumMax = chromiumMax;
    }

    public BigDecimal getChromiumMin() {
        return chromiumMin;
    }

    public void setChromiumMin(BigDecimal chromiumMin) {
        this.chromiumMin = chromiumMin;
    }

    public BigDecimal getChromiumAvg() {
        return chromiumAvg;
    }

    public void setChromiumAvg(BigDecimal chromiumAvg) {
        this.chromiumAvg = chromiumAvg;
    }

    public BigDecimal getLeadMax() {
        return leadMax;
    }

    public void setLeadMax(BigDecimal leadMax) {
        this.leadMax = leadMax;
    }

    public BigDecimal getLeadMin() {
        return leadMin;
    }

    public void setLeadMin(BigDecimal leadMin) {
        this.leadMin = leadMin;
    }

    public BigDecimal getLeadAvg() {
        return leadAvg;
    }

    public void setLeadAvg(BigDecimal leadAvg) {
        this.leadAvg = leadAvg;
    }

    public BigDecimal getCyanideMax() {
        return cyanideMax;
    }

    public void setCyanideMax(BigDecimal cyanideMax) {
        this.cyanideMax = cyanideMax;
    }

    public BigDecimal getCyanideMin() {
        return cyanideMin;
    }

    public void setCyanideMin(BigDecimal cyanideMin) {
        this.cyanideMin = cyanideMin;
    }

    public BigDecimal getCyanideAvg() {
        return cyanideAvg;
    }

    public void setCyanideAvg(BigDecimal cyanideAvg) {
        this.cyanideAvg = cyanideAvg;
    }

    public BigDecimal getPetroleumMax() {
        return petroleumMax;
    }

    public void setPetroleumMax(BigDecimal petroleumMax) {
        this.petroleumMax = petroleumMax;
    }

    public BigDecimal getPetroleumMin() {
        return petroleumMin;
    }

    public void setPetroleumMin(BigDecimal petroleumMin) {
        this.petroleumMin = petroleumMin;
    }

    public BigDecimal getPetroleumAvg() {
        return petroleumAvg;
    }

    public void setPetroleumAvg(BigDecimal petroleumAvg) {
        this.petroleumAvg = petroleumAvg;
    }

    public BigDecimal getSurfactantMax() {
        return surfactantMax;
    }

    public void setSurfactantMax(BigDecimal surfactantMax) {
        this.surfactantMax = surfactantMax;
    }

    public BigDecimal getSurfactantMin() {
        return surfactantMin;
    }

    public void setSurfactantMin(BigDecimal surfactantMin) {
        this.surfactantMin = surfactantMin;
    }

    public BigDecimal getSurfactantAvg() {
        return surfactantAvg;
    }

    public void setSurfactantAvg(BigDecimal surfactantAvg) {
        this.surfactantAvg = surfactantAvg;
    }

    public BigDecimal getSulfideMax() {
        return sulfideMax;
    }

    public void setSulfideMax(BigDecimal sulfideMax) {
        this.sulfideMax = sulfideMax;
    }

    public BigDecimal getSulfideMin() {
        return sulfideMin;
    }

    public void setSulfideMin(BigDecimal sulfideMin) {
        this.sulfideMin = sulfideMin;
    }

    public BigDecimal getSulfideAvg() {
        return sulfideAvg;
    }

    public void setSulfideAvg(BigDecimal sulfideAvg) {
        this.sulfideAvg = sulfideAvg;
    }

    public BigDecimal getColiformMax() {
        return coliformMax;
    }

    public void setColiformMax(BigDecimal coliformMax) {
        this.coliformMax = coliformMax;
    }

    public BigDecimal getColiformMin() {
        return coliformMin;
    }

    public void setColiformMin(BigDecimal coliformMin) {
        this.coliformMin = coliformMin;
    }

    public BigDecimal getColiformAvg() {
        return coliformAvg;
    }

    public void setColiformAvg(BigDecimal coliformAvg) {
        this.coliformAvg = coliformAvg;
    }

    public BigDecimal getChlorAMax() {
        return chlorAMax;
    }

    public void setChlorAMax(BigDecimal chlorAMax) {
        this.chlorAMax = chlorAMax;
    }

    public BigDecimal getChlorAMin() {
        return chlorAMin;
    }

    public void setChlorAMin(BigDecimal chlorAMin) {
        this.chlorAMin = chlorAMin;
    }

    public BigDecimal getChlorAAvg() {
        return chlorAAvg;
    }

    public void setChlorAAvg(BigDecimal chlorAAvg) {
        this.chlorAAvg = chlorAAvg;
    }

    public BigDecimal getTransparencyMax() {
        return transparencyMax;
    }

    public void setTransparencyMax(BigDecimal transparencyMax) {
        this.transparencyMax = transparencyMax;
    }

    public BigDecimal getTransparencyMin() {
        return transparencyMin;
    }

    public void setTransparencyMin(BigDecimal transparencyMin) {
        this.transparencyMin = transparencyMin;
    }

    public BigDecimal getTransparencyAvg() {
        return transparencyAvg;
    }

    public void setTransparencyAvg(BigDecimal transparencyAvg) {
        this.transparencyAvg = transparencyAvg;
    }

    public BigDecimal getSuspendedMax() {
        return suspendedMax;
    }

    public void setSuspendedMax(BigDecimal suspendedMax) {
        this.suspendedMax = suspendedMax;
    }

    public BigDecimal getSuspendedMin() {
        return suspendedMin;
    }

    public void setSuspendedMin(BigDecimal suspendedMin) {
        this.suspendedMin = suspendedMin;
    }

    public BigDecimal getSuspendedAvg() {
        return suspendedAvg;
    }

    public void setSuspendedAvg(BigDecimal suspendedAvg) {
        this.suspendedAvg = suspendedAvg;
    }
}
