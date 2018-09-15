package com.rdc.kingsa.model.entity.water.quality.estimate;

import java.math.BigDecimal;
import java.util.Date;

public class WaterQualityEstimateCPOI {
    private String id;

    private String secId;

    private String qaId;

    private Date monitorTime;

    private String evaluationMethod;

    private BigDecimal phT;

    private BigDecimal disOxygenT;

    private BigDecimal permanganateT;

    private BigDecimal oxDemandT;

    private BigDecimal boDemandT;

    private BigDecimal ammoniaT;

    private BigDecimal phosphorusT;

    private BigDecimal copperT;

    private BigDecimal zincT;

    private BigDecimal fluorideT;

    private BigDecimal seleniumT;

    private BigDecimal arsenicT;

    private BigDecimal mercuryT;

    private BigDecimal cadmiumT;

    private BigDecimal chromiumT;

    private BigDecimal leadT;

    private BigDecimal cyanideT;

    private BigDecimal phenolT;

    private BigDecimal petroleumT;

    private BigDecimal surfactantT;

    private BigDecimal sulfideT;

    private BigDecimal qaType;

    private String qaStatus;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId == null ? null : secId.trim();
    }

    public String getQaId() {
        return qaId;
    }

    public void setQaId(String qaId) {
        this.qaId = qaId == null ? null : qaId.trim();
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod == null ? null : evaluationMethod.trim();
    }

    public BigDecimal getPhT() {
        return phT;
    }

    public void setPhT(BigDecimal phT) {
        this.phT = phT;
    }

    public BigDecimal getDisOxygenT() {
        return disOxygenT;
    }

    public void setDisOxygenT(BigDecimal disOxygenT) {
        this.disOxygenT = disOxygenT;
    }

    public BigDecimal getPermanganateT() {
        return permanganateT;
    }

    public void setPermanganateT(BigDecimal permanganateT) {
        this.permanganateT = permanganateT;
    }

    public BigDecimal getOxDemandT() {
        return oxDemandT;
    }

    public void setOxDemandT(BigDecimal oxDemandT) {
        this.oxDemandT = oxDemandT;
    }

    public BigDecimal getBoDemandT() {
        return boDemandT;
    }

    public void setBoDemandT(BigDecimal boDemandT) {
        this.boDemandT = boDemandT;
    }

    public BigDecimal getAmmoniaT() {
        return ammoniaT;
    }

    public void setAmmoniaT(BigDecimal ammoniaT) {
        this.ammoniaT = ammoniaT;
    }

    public BigDecimal getPhosphorusT() {
        return phosphorusT;
    }

    public void setPhosphorusT(BigDecimal phosphorusT) {
        this.phosphorusT = phosphorusT;
    }

    public BigDecimal getCopperT() {
        return copperT;
    }

    public void setCopperT(BigDecimal copperT) {
        this.copperT = copperT;
    }

    public BigDecimal getZincT() {
        return zincT;
    }

    public void setZincT(BigDecimal zincT) {
        this.zincT = zincT;
    }

    public BigDecimal getFluorideT() {
        return fluorideT;
    }

    public void setFluorideT(BigDecimal fluorideT) {
        this.fluorideT = fluorideT;
    }

    public BigDecimal getSeleniumT() {
        return seleniumT;
    }

    public void setSeleniumT(BigDecimal seleniumT) {
        this.seleniumT = seleniumT;
    }

    public BigDecimal getArsenicT() {
        return arsenicT;
    }

    public void setArsenicT(BigDecimal arsenicT) {
        this.arsenicT = arsenicT;
    }

    public BigDecimal getMercuryT() {
        return mercuryT;
    }

    public void setMercuryT(BigDecimal mercuryT) {
        this.mercuryT = mercuryT;
    }

    public BigDecimal getCadmiumT() {
        return cadmiumT;
    }

    public void setCadmiumT(BigDecimal cadmiumT) {
        this.cadmiumT = cadmiumT;
    }

    public BigDecimal getChromiumT() {
        return chromiumT;
    }

    public void setChromiumT(BigDecimal chromiumT) {
        this.chromiumT = chromiumT;
    }

    public BigDecimal getLeadT() {
        return leadT;
    }

    public void setLeadT(BigDecimal leadT) {
        this.leadT = leadT;
    }

    public BigDecimal getCyanideT() {
        return cyanideT;
    }

    public void setCyanideT(BigDecimal cyanideT) {
        this.cyanideT = cyanideT;
    }

    public BigDecimal getPhenolT() {
        return phenolT;
    }

    public void setPhenolT(BigDecimal phenolT) {
        this.phenolT = phenolT;
    }

    public BigDecimal getPetroleumT() {
        return petroleumT;
    }

    public void setPetroleumT(BigDecimal petroleumT) {
        this.petroleumT = petroleumT;
    }

    public BigDecimal getSurfactantT() {
        return surfactantT;
    }

    public void setSurfactantT(BigDecimal surfactantT) {
        this.surfactantT = surfactantT;
    }

    public BigDecimal getSulfideT() {
        return sulfideT;
    }

    public void setSulfideT(BigDecimal sulfideT) {
        this.sulfideT = sulfideT;
    }

    public BigDecimal getQaType() {
        return qaType;
    }

    public void setQaType(BigDecimal qaType) {
        this.qaType = qaType;
    }

    public String getQaStatus() {
        return qaStatus;
    }

    public void setQaStatus(String qaStatus) {
        this.qaStatus = qaStatus == null ? null : qaStatus.trim();
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
}