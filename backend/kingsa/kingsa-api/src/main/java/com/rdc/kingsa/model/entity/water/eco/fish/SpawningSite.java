package com.rdc.kingsa.model.entity.water.eco.fish;

import java.math.BigDecimal;
import java.util.Date;

public class SpawningSite {
    private String id;

    private String sectionId;

    private BigDecimal distanceStart;

    private BigDecimal distanceEnd;

    private String creator;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private Date monitorTimeStart;

    private Date monitorTimeEnd;

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

    public BigDecimal getDistanceStart() {
        return distanceStart;
    }

    public void setDistanceStart(BigDecimal distanceStart) {
        this.distanceStart = distanceStart;
    }

    public BigDecimal getDistanceEnd() {
        return distanceEnd;
    }

    public void setDistanceEnd(BigDecimal distanceEnd) {
        this.distanceEnd = distanceEnd;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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

    public Date getMonitorTimeStart() {
        return monitorTimeStart;
    }

    public void setMonitorTimeStart(Date monitorTimeStart) {
        this.monitorTimeStart = monitorTimeStart;
    }

    public Date getMonitorTimeEnd() {
        return monitorTimeEnd;
    }

    public void setMonitorTimeEnd(Date monitorTimeEnd) {
        this.monitorTimeEnd = monitorTimeEnd;
    }
}