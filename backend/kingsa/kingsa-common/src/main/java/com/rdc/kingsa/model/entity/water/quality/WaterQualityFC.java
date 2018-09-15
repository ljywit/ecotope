package com.rdc.kingsa.model.entity.water.quality;

import java.io.Serializable;
import java.util.Date;

public class WaterQualityFC extends WaterQualityMIBase implements Serializable {
    private String processId;

    private String qaTy;

    private String monUnit;

    private String monitor;

    private String inputer;

    private String auditor;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private String phValueTy;

    private String disOxygenTy;

    private String permanganateTy;

    private String oxDemandTy;

    private String boDemandTy;

    private String ammoniaTy;

    private String phosphorusTy;

    private String copperTy;

    private String zincTy;

    private String fluorideTy;

    private String seleniumTy;

    private String arsenicTy;

    private String mercuryTy;

    private String cadmiumTy;

    private String chromiumTy;

    private String leadTy;

    private String cyanideTy;

    private String phenolTy;

    private String petroleumTy;

    private String surfactantTy;

    private String sulfideTy;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    public String getQaTy() {
        return qaTy;
    }

    public void setQaTy(String qaTy) {
        this.qaTy = qaTy == null ? null : qaTy.trim();
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

    public String getPhValueTy() {
        return phValueTy;
    }

    public void setPhValueTy(String phValueTy) {
        this.phValueTy = phValueTy;
    }

    public String getDisOxygenTy() {
        return disOxygenTy;
    }

    public void setDisOxygenTy(String disOxygenTy) {
        this.disOxygenTy = disOxygenTy;
    }

    public String getPermanganateTy() {
        return permanganateTy;
    }

    public void setPermanganateTy(String permanganateTy) {
        this.permanganateTy = permanganateTy;
    }

    public String getOxDemandTy() {
        return oxDemandTy;
    }

    public void setOxDemandTy(String oxDemandTy) {
        this.oxDemandTy = oxDemandTy;
    }

    public String getBoDemandTy() {
        return boDemandTy;
    }

    public void setBoDemandTy(String boDemandTy) {
        this.boDemandTy = boDemandTy;
    }

    public String getAmmoniaTy() {
        return ammoniaTy;
    }

    public void setAmmoniaTy(String ammoniaTy) {
        this.ammoniaTy = ammoniaTy;
    }

    public String getPhosphorusTy() {
        return phosphorusTy;
    }

    public void setPhosphorusTy(String phosphorusTy) {
        this.phosphorusTy = phosphorusTy;
    }

    public String getCopperTy() {
        return copperTy;
    }

    public void setCopperTy(String copperTy) {
        this.copperTy = copperTy;
    }

    public String getZincTy() {
        return zincTy;
    }

    public void setZincTy(String zincTy) {
        this.zincTy = zincTy;
    }

    public String getFluorideTy() {
        return fluorideTy;
    }

    public void setFluorideTy(String fluorideTy) {
        this.fluorideTy = fluorideTy;
    }

    public String getSeleniumTy() {
        return seleniumTy;
    }

    public void setSeleniumTy(String seleniumTy) {
        this.seleniumTy = seleniumTy;
    }

    public String getArsenicTy() {
        return arsenicTy;
    }

    public void setArsenicTy(String arsenicTy) {
        this.arsenicTy = arsenicTy;
    }

    public String getMercuryTy() {
        return mercuryTy;
    }

    public void setMercuryTy(String mercuryTy) {
        this.mercuryTy = mercuryTy;
    }

    public String getCadmiumTy() {
        return cadmiumTy;
    }

    public void setCadmiumTy(String cadmiumTy) {
        this.cadmiumTy = cadmiumTy;
    }

    public String getChromiumTy() {
        return chromiumTy;
    }

    public void setChromiumTy(String chromiumTy) {
        this.chromiumTy = chromiumTy;
    }

    public String getLeadTy() {
        return leadTy;
    }

    public void setLeadTy(String leadTy) {
        this.leadTy = leadTy;
    }

    public String getCyanideTy() {
        return cyanideTy;
    }

    public void setCyanideTy(String cyanideTy) {
        this.cyanideTy = cyanideTy;
    }

    public String getPhenolTy() {
        return phenolTy;
    }

    public void setPhenolTy(String phenolTy) {
        this.phenolTy = phenolTy;
    }

    public String getPetroleumTy() {
        return petroleumTy;
    }

    public void setPetroleumTy(String petroleumTy) {
        this.petroleumTy = petroleumTy;
    }

    public String getSurfactantTy() {
        return surfactantTy;
    }

    public void setSurfactantTy(String surfactantTy) {
        this.surfactantTy = surfactantTy;
    }

    public String getSulfideTy() {
        return sulfideTy;
    }

    public void setSulfideTy(String sulfideTy) {
        this.sulfideTy = sulfideTy;
    }
}