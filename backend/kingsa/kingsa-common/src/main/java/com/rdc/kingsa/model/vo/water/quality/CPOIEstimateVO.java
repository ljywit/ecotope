package com.rdc.kingsa.model.vo.water.quality;

import com.rdc.kingsa.annotation.convert.MappedColumn;

import java.math.BigDecimal;

/**
 * 水质综合污染指数法评价结果
 * Created by lxf on 18/7/11.
 */
public class CPOIEstimateVO {

    private Short serialNum;

    private String sectionName;

    //溶解氧
    @MappedColumn(sourceName = "disOxygenT")
    private BigDecimal disOxygen;

    //高锰酸钾
    @MappedColumn(sourceName = "permanganateT")
    private BigDecimal permanganate;

    //五日生化需氧量
    @MappedColumn(sourceName = "boDemandT")
    private BigDecimal boDemand;

    //化学需氧量
    @MappedColumn(sourceName = "oxDemandT")
    private BigDecimal oxDemand;

    //氨氮
    @MappedColumn(sourceName = "ammoniaT")
    private BigDecimal ammonia;

    //石油类
    @MappedColumn(sourceName = "petroleumT")
    private BigDecimal petroleum;

    //挥发酚
    @MappedColumn(sourceName = "phenolT")
    private BigDecimal phenol;

    //总磷
    @MappedColumn(sourceName = "phosphorusT")
    private BigDecimal phosphorus;

    //汞
    @MappedColumn(sourceName = "mercuryT")
    private BigDecimal mercury;

    //综合指数
    private BigDecimal qaType;

    //水质状况
    private String qaStatus;

    private String remarks;

    public Short getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public BigDecimal getDisOxygen() {
        return disOxygen;
    }

    public void setDisOxygen(BigDecimal disOxygen) {
        this.disOxygen = disOxygen;
    }

    public BigDecimal getPermanganate() {
        return permanganate;
    }

    public void setPermanganate(BigDecimal permanganate) {
        this.permanganate = permanganate;
    }

    public BigDecimal getBoDemand() {
        return boDemand;
    }

    public void setBoDemand(BigDecimal boDemand) {
        this.boDemand = boDemand;
    }

    public BigDecimal getOxDemand() {
        return oxDemand;
    }

    public void setOxDemand(BigDecimal oxDemand) {
        this.oxDemand = oxDemand;
    }

    public BigDecimal getAmmonia() {
        return ammonia;
    }

    public void setAmmonia(BigDecimal ammonia) {
        this.ammonia = ammonia;
    }

    public BigDecimal getPetroleum() {
        return petroleum;
    }

    public void setPetroleum(BigDecimal petroleum) {
        this.petroleum = petroleum;
    }

    public BigDecimal getPhenol() {
        return phenol;
    }

    public void setPhenol(BigDecimal phenol) {
        this.phenol = phenol;
    }

    public BigDecimal getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(BigDecimal phosphorus) {
        this.phosphorus = phosphorus;
    }

    public BigDecimal getMercury() {
        return mercury;
    }

    public void setMercury(BigDecimal mercury) {
        this.mercury = mercury;
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
        this.qaStatus = qaStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
