package com.rdc.kingsa.model.vo.water.quality;

import com.rdc.kingsa.annotation.convert.MappedColumn;

import java.util.Date;

/**
 * Created by lxf on 18/7/11.
 */
public class HeavyMetalEstimateVO {
    private String id;

    private Short serialNum;

    @MappedColumn(sourceName = "secId")
    private String sectionId;

    private String sectionName;

    private Date monitorTime;

    private String evaluationMethod;

    private Double cadmiumShmpi;

    private Double mercuryShmpi;

    private Double arsenicShmpi;

    private Double copperShmpi;

    private Double leadShmpi;

    private Double chromiumShmpi;

    private Double zincShmpi;

    private Double nickelShmpi;

    private Double cpi;

    private String docp;

    private Double cadmiumEri;

    private Double mercuryEri;

    private Double arsenicEri;

    private Double copperEri;

    private Double leadEri;

    private Double chromiumEri;

    private Double zincEri;

    private Double nickelEri;

    private Double ceri;

    private String cper;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Short getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

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

    public Double getCadmiumShmpi() {
        return cadmiumShmpi;
    }

    public void setCadmiumShmpi(Double cadmiumShmpi) {
        this.cadmiumShmpi = cadmiumShmpi;
    }

    public Double getMercuryShmpi() {
        return mercuryShmpi;
    }

    public void setMercuryShmpi(Double mercuryShmpi) {
        this.mercuryShmpi = mercuryShmpi;
    }

    public Double getArsenicShmpi() {
        return arsenicShmpi;
    }

    public void setArsenicShmpi(Double arsenicShmpi) {
        this.arsenicShmpi = arsenicShmpi;
    }

    public Double getCopperShmpi() {
        return copperShmpi;
    }

    public void setCopperShmpi(Double copperShmpi) {
        this.copperShmpi = copperShmpi;
    }

    public Double getLeadShmpi() {
        return leadShmpi;
    }

    public void setLeadShmpi(Double leadShmpi) {
        this.leadShmpi = leadShmpi;
    }

    public Double getChromiumShmpi() {
        return chromiumShmpi;
    }

    public void setChromiumShmpi(Double chromiumShmpi) {
        this.chromiumShmpi = chromiumShmpi;
    }

    public Double getZincShmpi() {
        return zincShmpi;
    }

    public void setZincShmpi(Double zincShmpi) {
        this.zincShmpi = zincShmpi;
    }

    public Double getNickelShmpi() {
        return nickelShmpi;
    }

    public void setNickelShmpi(Double nickelShmpi) {
        this.nickelShmpi = nickelShmpi;
    }

    public Double getCpi() {
        return cpi;
    }

    public void setCpi(Double cpi) {
        this.cpi = cpi;
    }

    public String getDocp() {
        return docp;
    }

    public void setDocp(String docp) {
        this.docp = docp;
    }

    public Double getCadmiumEri() {
        return cadmiumEri;
    }

    public void setCadmiumEri(Double cadmiumEri) {
        this.cadmiumEri = cadmiumEri;
    }

    public Double getMercuryEri() {
        return mercuryEri;
    }

    public void setMercuryEri(Double mercuryEri) {
        this.mercuryEri = mercuryEri;
    }

    public Double getArsenicEri() {
        return arsenicEri;
    }

    public void setArsenicEri(Double arsenicEri) {
        this.arsenicEri = arsenicEri;
    }

    public Double getCopperEri() {
        return copperEri;
    }

    public void setCopperEri(Double copperEri) {
        this.copperEri = copperEri;
    }

    public Double getLeadEri() {
        return leadEri;
    }

    public void setLeadEri(Double leadEri) {
        this.leadEri = leadEri;
    }

    public Double getChromiumEri() {
        return chromiumEri;
    }

    public void setChromiumEri(Double chromiumEri) {
        this.chromiumEri = chromiumEri;
    }

    public Double getZincEri() {
        return zincEri;
    }

    public void setZincEri(Double zincEri) {
        this.zincEri = zincEri;
    }

    public Double getNickelEri() {
        return nickelEri;
    }

    public void setNickelEri(Double nickelEri) {
        this.nickelEri = nickelEri;
    }

    public Double getCeri() {
        return ceri;
    }

    public void setCeri(Double ceri) {
        this.ceri = ceri;
    }

    public String getCper() {
        return cper;
    }

    public void setCper(String cper) {
        this.cper = cper;
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
