package com.rdc.kingsa.model.entity.water.quality;

import java.math.BigDecimal;
import java.util.Date;

public class WaterQualityMI extends WaterQualityMIBase {

    private String monUnit;

    private String monitor;

    private String inputer;

    private String auditor;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private String reportId;

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
        this.waterTempSy = waterTempSy == null ? null : waterTempSy.trim();
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
        this.phValueSy = phValueSy == null ? null : phValueSy.trim();
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
        this.disOxygenSy = disOxygenSy == null ? null : disOxygenSy.trim();
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
        this.permanganateSy = permanganateSy == null ? null : permanganateSy.trim();
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
        this.oxDemandSy = oxDemandSy == null ? null : oxDemandSy.trim();
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
        this.boDemandSy = boDemandSy == null ? null : boDemandSy.trim();
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
        this.ammoniaSy = ammoniaSy == null ? null : ammoniaSy.trim();
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
        this.phosphorusSy = phosphorusSy == null ? null : phosphorusSy.trim();
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
        this.nitrogenSy = nitrogenSy == null ? null : nitrogenSy.trim();
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
        this.copperSy = copperSy == null ? null : copperSy.trim();
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
        this.zincSy = zincSy == null ? null : zincSy.trim();
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
        this.fluorideSy = fluorideSy == null ? null : fluorideSy.trim();
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
        this.seleniumSy = seleniumSy == null ? null : seleniumSy.trim();
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
        this.arsenicSy = arsenicSy == null ? null : arsenicSy.trim();
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
        this.mercurySy = mercurySy == null ? null : mercurySy.trim();
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
        this.cadmiumSy = cadmiumSy == null ? null : cadmiumSy.trim();
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
        this.chromiumSy = chromiumSy == null ? null : chromiumSy.trim();
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
        this.leadSy = leadSy == null ? null : leadSy.trim();
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
        this.cyanideSy = cyanideSy == null ? null : cyanideSy.trim();
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
        this.phenolSy = phenolSy == null ? null : phenolSy.trim();
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
        this.petroleumSy = petroleumSy == null ? null : petroleumSy.trim();
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
        this.surfactantSy = surfactantSy == null ? null : surfactantSy.trim();
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
        this.sulfideSy = sulfideSy == null ? null : sulfideSy.trim();
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
        this.coliformSy = coliformSy == null ? null : coliformSy.trim();
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
        this.chlorASy = chlorASy == null ? null : chlorASy.trim();
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
        this.transparencySy = transparencySy == null ? null : transparencySy.trim();
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
        this.suspendedSy = suspendedSy == null ? null : suspendedSy.trim();
    }

    public String getMonUnit() {
        return monUnit;
    }

    public void setMonUnit(String monUnit) {
        this.monUnit = monUnit == null ? null : monUnit.trim();
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor == null ? null : monitor.trim();
    }

    public String getInputer() {
        return inputer;
    }

    public void setInputer(String inputer) {
        this.inputer = inputer == null ? null : inputer.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }
}