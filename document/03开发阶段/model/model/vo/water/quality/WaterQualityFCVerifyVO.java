package com.rdc.kingsa.model.vo.water.quality;

import com.rdc.kingsa.annotation.convert.MappedColumn;

import java.util.Date;

/**
 * Created by lxf on 18/7/18.
 */
public class WaterQualityFCVerifyVO {
    private String id;

    private String secId;

    private String qaId;

    private Date monitorTime;

    private String evaluationMethod;

    @MappedColumn(sourceName = "phT")
    private Short phValue;

    @MappedColumn(sourceName = "disOxygenT")
    private Short disOxygen;

    @MappedColumn(sourceName = "permanganateT")
    private Short permanganate;

    @MappedColumn(sourceName = "oxDemandT")
    private Short oxDemand;

    @MappedColumn(sourceName = "boDemandT")
    private Short boDemand;

    @MappedColumn(sourceName = "ammoniaT")
    private Short ammonia;

    @MappedColumn(sourceName = "phosphorusT")
    private Short phosphorus;

    @MappedColumn(sourceName = "copperT")
    private Short copper;

    @MappedColumn(sourceName = "zincT")
    private Short zinc;

    @MappedColumn(sourceName = "fluorideT")
    private Short fluoride;

    @MappedColumn(sourceName = "seleniumT")
    private Short selenium;

    @MappedColumn(sourceName = "arsenicT")
    private Short arsenic;

    @MappedColumn(sourceName = "mercuryT")
    private Short mercury;

    @MappedColumn(sourceName = "cadmiumT")
    private Short cadmium;

    @MappedColumn(sourceName = "chromiumT")
    private Short chromium;

    @MappedColumn(sourceName = "leadT")
    private Short lead;

    @MappedColumn(sourceName = "cyanideT")
    private Short cyanide;

    @MappedColumn(sourceName = "phenolT")
    private Short phenol;

    @MappedColumn(sourceName = "petroleumT")
    private Short petroleum;

    @MappedColumn(sourceName = "surfactantT")
    private Short surfactant;

    @MappedColumn(sourceName = "sulfideT")
    private Short sulfide;

    private Short qaType;

    private String overItems;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

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

    public String getQaId() {
        return qaId;
    }

    public void setQaId(String qaId) {
        this.qaId = qaId;
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
        this.evaluationMethod = evaluationMethod;
    }

    public Short getPhValue() {
        return phValue;
    }

    public void setPhValue(Short phValue) {
        this.phValue = phValue;
    }

    public Short getDisOxygen() {
        return disOxygen;
    }

    public void setDisOxygen(Short disOxygen) {
        this.disOxygen = disOxygen;
    }

    public Short getPermanganate() {
        return permanganate;
    }

    public void setPermanganate(Short permanganate) {
        this.permanganate = permanganate;
    }

    public Short getOxDemand() {
        return oxDemand;
    }

    public void setOxDemand(Short oxDemand) {
        this.oxDemand = oxDemand;
    }

    public Short getBoDemand() {
        return boDemand;
    }

    public void setBoDemand(Short boDemand) {
        this.boDemand = boDemand;
    }

    public Short getAmmonia() {
        return ammonia;
    }

    public void setAmmonia(Short ammonia) {
        this.ammonia = ammonia;
    }

    public Short getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(Short phosphorus) {
        this.phosphorus = phosphorus;
    }

    public Short getCopper() {
        return copper;
    }

    public void setCopper(Short copper) {
        this.copper = copper;
    }

    public Short getZinc() {
        return zinc;
    }

    public void setZinc(Short zinc) {
        this.zinc = zinc;
    }

    public Short getFluoride() {
        return fluoride;
    }

    public void setFluoride(Short fluoride) {
        this.fluoride = fluoride;
    }

    public Short getSelenium() {
        return selenium;
    }

    public void setSelenium(Short selenium) {
        this.selenium = selenium;
    }

    public Short getArsenic() {
        return arsenic;
    }

    public void setArsenic(Short arsenic) {
        this.arsenic = arsenic;
    }

    public Short getMercury() {
        return mercury;
    }

    public void setMercury(Short mercury) {
        this.mercury = mercury;
    }

    public Short getCadmium() {
        return cadmium;
    }

    public void setCadmium(Short cadmium) {
        this.cadmium = cadmium;
    }

    public Short getChromium() {
        return chromium;
    }

    public void setChromium(Short chromium) {
        this.chromium = chromium;
    }

    public Short getLead() {
        return lead;
    }

    public void setLead(Short lead) {
        this.lead = lead;
    }

    public Short getCyanide() {
        return cyanide;
    }

    public void setCyanide(Short cyanide) {
        this.cyanide = cyanide;
    }

    public Short getPhenol() {
        return phenol;
    }

    public void setPhenol(Short phenol) {
        this.phenol = phenol;
    }

    public Short getPetroleum() {
        return petroleum;
    }

    public void setPetroleum(Short petroleum) {
        this.petroleum = petroleum;
    }

    public Short getSurfactant() {
        return surfactant;
    }

    public void setSurfactant(Short surfactant) {
        this.surfactant = surfactant;
    }

    public Short getSulfide() {
        return sulfide;
    }

    public void setSulfide(Short sulfide) {
        this.sulfide = sulfide;
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
        this.overItems = overItems;
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
        this.remarks = remarks;
    }
}
