package com.rdc.kingsa.model.entity.water.temperature;

import java.math.BigDecimal;
import java.util.Date;

public class VWTMI {
    private String id;

    private String sectionId;

    private Date monitorTime;

    private BigDecimal waterDepth;

    private BigDecimal waterTemper;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private BigDecimal waterLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public BigDecimal getWaterDepth() {
        return waterDepth;
    }

    public void setWaterDepth(BigDecimal waterDepth) {
        this.waterDepth = waterDepth;
    }

    public BigDecimal getWaterTemper() {
        return waterTemper;
    }

    public void setWaterTemper(BigDecimal waterTemper) {
        this.waterTemper = waterTemper;
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

    public BigDecimal getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(BigDecimal waterLevel) {
        this.waterLevel = waterLevel;
    }
}