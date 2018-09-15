package com.rdc.kingsa.model.entity.atomization;

import java.math.BigDecimal;
import java.util.Date;

public class FdaMonitorValRain {
    private String id;

    private String monitorSpotId;

    private String monitorRecordId;

    private BigDecimal rainIntensity;

    private BigDecimal rainIntensityNature;

    private BigDecimal rainIntensityFda;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMonitorSpotId() {
        return monitorSpotId;
    }

    public void setMonitorSpotId(String monitorSpotId) {
        this.monitorSpotId = monitorSpotId == null ? null : monitorSpotId.trim();
    }

    public String getMonitorRecordId() {
        return monitorRecordId;
    }

    public void setMonitorRecordId(String monitorRecordId) {
        this.monitorRecordId = monitorRecordId == null ? null : monitorRecordId.trim();
    }

    public BigDecimal getRainIntensity() {
        return rainIntensity;
    }

    public void setRainIntensity(BigDecimal rainIntensity) {
        this.rainIntensity = rainIntensity;
    }

    public BigDecimal getRainIntensityNature() {
        return rainIntensityNature;
    }

    public void setRainIntensityNature(BigDecimal rainIntensityNature) {
        this.rainIntensityNature = rainIntensityNature;
    }

    public BigDecimal getRainIntensityFda() {
        return rainIntensityFda;
    }

    public void setRainIntensityFda(BigDecimal rainIntensityFda) {
        this.rainIntensityFda = rainIntensityFda;
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