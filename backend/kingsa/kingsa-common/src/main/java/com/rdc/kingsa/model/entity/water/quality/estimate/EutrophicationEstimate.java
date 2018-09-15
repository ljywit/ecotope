package com.rdc.kingsa.model.entity.water.quality.estimate;

import java.util.Date;

public class EutrophicationEstimate {
	
    private String id;

    private String secId;

    private String qaId;

    private Date monitorTime;

    private String evaluationMethod;

    private Double tsiChlorA;

    private Double tsiTp;

    private Double tsiTn;

    private Double tsiSd;

    private Double tsiCodmn;

    private Double tsiAll;

    private String nutritionDegree;

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

    public Double getTsiChlorA() {
        return tsiChlorA;
    }

    public void setTsiChlorA(Double tsiChlorA) {
        this.tsiChlorA = tsiChlorA;
    }

    public Double getTsiTp() {
        return tsiTp;
    }

    public void setTsiTp(Double tsiTp) {
        this.tsiTp = tsiTp;
    }

    public Double getTsiTn() {
        return tsiTn;
    }

    public void setTsiTn(Double tsiTn) {
        this.tsiTn = tsiTn;
    }

    public Double getTsiSd() {
        return tsiSd;
    }

    public void setTsiSd(Double tsiSd) {
        this.tsiSd = tsiSd;
    }

    public Double getTsiCodmn() {
        return tsiCodmn;
    }

    public void setTsiCodmn(Double tsiCodmn) {
        this.tsiCodmn = tsiCodmn;
    }

    public Double getTsiAll() {
        return tsiAll;
    }

    public void setTsiAll(Double tsiAll) {
        this.tsiAll = tsiAll;
    }

    public String getNutritionDegree() {
        return nutritionDegree;
    }

    public void setNutritionDegree(String nutritionDegree) {
        this.nutritionDegree = nutritionDegree == null ? null : nutritionDegree.trim();
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