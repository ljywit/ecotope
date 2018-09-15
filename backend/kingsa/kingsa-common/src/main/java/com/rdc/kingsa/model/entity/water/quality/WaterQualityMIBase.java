package com.rdc.kingsa.model.entity.water.quality;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 水质监测值对象，用于进行分析评价，统一FC表格和MI表格
 * Created by lxf on 18/7/13.
 */
public class WaterQualityMIBase {
    protected String id;

    protected String secId;

    protected Date monitorTime;

    protected BigDecimal waterTemp;

    protected String waterTempSy;

    protected BigDecimal phValue;

    protected String phValueSy;

    protected BigDecimal disOxygen;

    protected String disOxygenSy;

    protected BigDecimal permanganate;

    protected String permanganateSy;

    protected BigDecimal oxDemand;

    protected String oxDemandSy;

    protected BigDecimal boDemand;

    protected String boDemandSy;

    protected BigDecimal ammonia;

    protected String ammoniaSy;

    protected BigDecimal phosphorus;

    protected String phosphorusSy;

    protected BigDecimal nitrogen;

    protected String nitrogenSy;

    protected BigDecimal copper;

    protected String copperSy;

    protected BigDecimal zinc;

    protected String zincSy;

    protected BigDecimal fluoride;

    protected String fluorideSy;

    protected BigDecimal selenium;

    protected String seleniumSy;

    protected BigDecimal arsenic;

    protected String arsenicSy;

    protected BigDecimal mercury;

    protected String mercurySy;

    protected BigDecimal cadmium;

    protected String cadmiumSy;

    protected BigDecimal chromium;

    protected String chromiumSy;

    protected BigDecimal lead;

    protected String leadSy;

    protected BigDecimal cyanide;

    protected String cyanideSy;

    protected BigDecimal phenol;

    protected String phenolSy;

    protected BigDecimal petroleum;

    protected String petroleumSy;

    protected BigDecimal surfactant;

    protected String surfactantSy;

    protected BigDecimal sulfide;

    protected String sulfideSy;

    protected BigDecimal coliform;

    protected String coliformSy;

    protected BigDecimal chlorA;

    protected String chlorASy;

    protected BigDecimal transparency;

    protected String transparencySy;

    protected BigDecimal suspended;

    protected String suspendedSy;

    protected String reportId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public BigDecimal getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(BigDecimal waterTemp) {
        this.waterTemp = waterTemp;
    }

    public String getWaterTempSy() {
        return waterTempSy;
    }

    public void setWaterTempSy(String waterTempSy) {
        this.waterTempSy = waterTempSy;
    }

    public BigDecimal getPhValue() {
        return phValue;
    }

    public void setPhValue(BigDecimal phValue) {
        this.phValue = phValue;
    }

    public String getPhValueSy() {
        return phValueSy;
    }

    public void setPhValueSy(String phValueSy) {
        this.phValueSy = phValueSy;
    }

    public BigDecimal getDisOxygen() {
        return disOxygen;
    }

    public void setDisOxygen(BigDecimal disOxygen) {
        this.disOxygen = disOxygen;
    }

    public String getDisOxygenSy() {
        return disOxygenSy;
    }

    public void setDisOxygenSy(String disOxygenSy) {
        this.disOxygenSy = disOxygenSy;
    }

    public BigDecimal getPermanganate() {
        return permanganate;
    }

    public void setPermanganate(BigDecimal permanganate) {
        this.permanganate = permanganate;
    }

    public String getPermanganateSy() {
        return permanganateSy;
    }

    public void setPermanganateSy(String permanganateSy) {
        this.permanganateSy = permanganateSy;
    }

    public BigDecimal getOxDemand() {
        return oxDemand;
    }

    public void setOxDemand(BigDecimal oxDemand) {
        this.oxDemand = oxDemand;
    }

    public String getOxDemandSy() {
        return oxDemandSy;
    }

    public void setOxDemandSy(String oxDemandSy) {
        this.oxDemandSy = oxDemandSy;
    }

    public BigDecimal getBoDemand() {
        return boDemand;
    }

    public void setBoDemand(BigDecimal boDemand) {
        this.boDemand = boDemand;
    }

    public String getBoDemandSy() {
        return boDemandSy;
    }

    public void setBoDemandSy(String boDemandSy) {
        this.boDemandSy = boDemandSy;
    }

    public BigDecimal getAmmonia() {
        return ammonia;
    }

    public void setAmmonia(BigDecimal ammonia) {
        this.ammonia = ammonia;
    }

    public String getAmmoniaSy() {
        return ammoniaSy;
    }

    public void setAmmoniaSy(String ammoniaSy) {
        this.ammoniaSy = ammoniaSy;
    }

    public BigDecimal getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(BigDecimal phosphorus) {
        this.phosphorus = phosphorus;
    }

    public String getPhosphorusSy() {
        return phosphorusSy;
    }

    public void setPhosphorusSy(String phosphorusSy) {
        this.phosphorusSy = phosphorusSy;
    }

    public BigDecimal getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(BigDecimal nitrogen) {
        this.nitrogen = nitrogen;
    }

    public String getNitrogenSy() {
        return nitrogenSy;
    }

    public void setNitrogenSy(String nitrogenSy) {
        this.nitrogenSy = nitrogenSy;
    }

    public BigDecimal getCopper() {
        return copper;
    }

    public void setCopper(BigDecimal copper) {
        this.copper = copper;
    }

    public String getCopperSy() {
        return copperSy;
    }

    public void setCopperSy(String copperSy) {
        this.copperSy = copperSy;
    }

    public BigDecimal getZinc() {
        return zinc;
    }

    public void setZinc(BigDecimal zinc) {
        this.zinc = zinc;
    }

    public String getZincSy() {
        return zincSy;
    }

    public void setZincSy(String zincSy) {
        this.zincSy = zincSy;
    }

    public BigDecimal getFluoride() {
        return fluoride;
    }

    public void setFluoride(BigDecimal fluoride) {
        this.fluoride = fluoride;
    }

    public String getFluorideSy() {
        return fluorideSy;
    }

    public void setFluorideSy(String fluorideSy) {
        this.fluorideSy = fluorideSy;
    }

    public BigDecimal getSelenium() {
        return selenium;
    }

    public void setSelenium(BigDecimal selenium) {
        this.selenium = selenium;
    }

    public String getSeleniumSy() {
        return seleniumSy;
    }

    public void setSeleniumSy(String seleniumSy) {
        this.seleniumSy = seleniumSy;
    }

    public BigDecimal getArsenic() {
        return arsenic;
    }

    public void setArsenic(BigDecimal arsenic) {
        this.arsenic = arsenic;
    }

    public String getArsenicSy() {
        return arsenicSy;
    }

    public void setArsenicSy(String arsenicSy) {
        this.arsenicSy = arsenicSy;
    }

    public BigDecimal getMercury() {
        return mercury;
    }

    public void setMercury(BigDecimal mercury) {
        this.mercury = mercury;
    }

    public String getMercurySy() {
        return mercurySy;
    }

    public void setMercurySy(String mercurySy) {
        this.mercurySy = mercurySy;
    }

    public BigDecimal getCadmium() {
        return cadmium;
    }

    public void setCadmium(BigDecimal cadmium) {
        this.cadmium = cadmium;
    }

    public String getCadmiumSy() {
        return cadmiumSy;
    }

    public void setCadmiumSy(String cadmiumSy) {
        this.cadmiumSy = cadmiumSy;
    }

    public BigDecimal getChromium() {
        return chromium;
    }

    public void setChromium(BigDecimal chromium) {
        this.chromium = chromium;
    }

    public String getChromiumSy() {
        return chromiumSy;
    }

    public void setChromiumSy(String chromiumSy) {
        this.chromiumSy = chromiumSy;
    }

    public BigDecimal getLead() {
        return lead;
    }

    public void setLead(BigDecimal lead) {
        this.lead = lead;
    }

    public String getLeadSy() {
        return leadSy;
    }

    public void setLeadSy(String leadSy) {
        this.leadSy = leadSy;
    }

    public BigDecimal getCyanide() {
        return cyanide;
    }

    public void setCyanide(BigDecimal cyanide) {
        this.cyanide = cyanide;
    }

    public String getCyanideSy() {
        return cyanideSy;
    }

    public void setCyanideSy(String cyanideSy) {
        this.cyanideSy = cyanideSy;
    }

    public BigDecimal getPhenol() {
        return phenol;
    }

    public void setPhenol(BigDecimal phenol) {
        this.phenol = phenol;
    }

    public String getPhenolSy() {
        return phenolSy;
    }

    public void setPhenolSy(String phenolSy) {
        this.phenolSy = phenolSy;
    }

    public BigDecimal getPetroleum() {
        return petroleum;
    }

    public void setPetroleum(BigDecimal petroleum) {
        this.petroleum = petroleum;
    }

    public String getPetroleumSy() {
        return petroleumSy;
    }

    public void setPetroleumSy(String petroleumSy) {
        this.petroleumSy = petroleumSy;
    }

    public BigDecimal getSurfactant() {
        return surfactant;
    }

    public void setSurfactant(BigDecimal surfactant) {
        this.surfactant = surfactant;
    }

    public String getSurfactantSy() {
        return surfactantSy;
    }

    public void setSurfactantSy(String surfactantSy) {
        this.surfactantSy = surfactantSy;
    }

    public BigDecimal getSulfide() {
        return sulfide;
    }

    public void setSulfide(BigDecimal sulfide) {
        this.sulfide = sulfide;
    }

    public String getSulfideSy() {
        return sulfideSy;
    }

    public void setSulfideSy(String sulfideSy) {
        this.sulfideSy = sulfideSy;
    }

    public BigDecimal getColiform() {
        return coliform;
    }

    public void setColiform(BigDecimal coliform) {
        this.coliform = coliform;
    }

    public String getColiformSy() {
        return coliformSy;
    }

    public void setColiformSy(String coliformSy) {
        this.coliformSy = coliformSy;
    }

    public BigDecimal getChlorA() {
        return chlorA;
    }

    public void setChlorA(BigDecimal chlorA) {
        this.chlorA = chlorA;
    }

    public String getChlorASy() {
        return chlorASy;
    }

    public void setChlorASy(String chlorASy) {
        this.chlorASy = chlorASy;
    }

    public BigDecimal getTransparency() {
        return transparency;
    }

    public void setTransparency(BigDecimal transparency) {
        this.transparency = transparency;
    }

    public String getTransparencySy() {
        return transparencySy;
    }

    public void setTransparencySy(String transparencySy) {
        this.transparencySy = transparencySy;
    }

    public BigDecimal getSuspended() {
        return suspended;
    }

    public void setSuspended(BigDecimal suspended) {
        this.suspended = suspended;
    }

    public String getSuspendedSy() {
        return suspendedSy;
    }

    public void setSuspendedSy(String suspendedSy) {
        this.suspendedSy = suspendedSy;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

}
