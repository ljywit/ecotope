package com.rdc.kingsa.model.entity.atomization;

import java.math.BigDecimal;
import java.util.Date;

public class FdaMonitorValWind {
    private String id;

    private String monitorSpotId;

    private String monitorRecordId;

    private BigDecimal windSpeed;

    private BigDecimal duration;

    private String windType;

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

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public String getWindType() {
        return windType;
    }

    public void setWindType(String windType) {
        this.windType = windType == null ? null : windType.trim();
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