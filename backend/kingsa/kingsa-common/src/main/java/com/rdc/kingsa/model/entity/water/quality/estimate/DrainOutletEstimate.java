package com.rdc.kingsa.model.entity.water.quality.estimate;

import java.util.Date;

public class DrainOutletEstimate {
	
    private String id;

    private String secId;

    private String qaId;

    private Date monitorTime;
    
    private String evaluationMethod;
    
    private Short phT;

    private Short oxDemandT;

    private Short boDemandT;

    private Short ammoniaT;

    private Short phosphorusT;

    private Short sulfideT;

    private Short cyanideT;

    private Short fluorideT;

    private Short phenolT;

    private Short petroleumT;

    private Short surfactantT;

    private Short copperT;

    private Short zincT;

    private Short arsenicT;

    private Short mercuryT;

    private Short cadmiumT;

    private Short chromiumT;

    private Short leadT;

    private Short qaType;

    private String overItems;

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
    
    public Short getPhT() {
        return phT;
    }

    public void setPhT(Short phT) {
        this.phT = phT;
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

    public Short getSulfideT() {
        return sulfideT;
    }

    public void setSulfideT(Short sulfideT) {
        this.sulfideT = sulfideT;
    }

    public Short getCyanideT() {
        return cyanideT;
    }

    public void setCyanideT(Short cyanideT) {
        this.cyanideT = cyanideT;
    }

    public Short getFluorideT() {
        return fluorideT;
    }

    public void setFluorideT(Short fluorideT) {
        this.fluorideT = fluorideT;
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

    public Short getQaType() {
        return qaType;
    }

    public void setQaType(Short qaType) {
        this.qaType = qaType;
    }

    public String getOverItems() {
        return overItems;
    }

    public void setOverItems(String overItems) {
        this.overItems = overItems == null ? null : overItems.trim();
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