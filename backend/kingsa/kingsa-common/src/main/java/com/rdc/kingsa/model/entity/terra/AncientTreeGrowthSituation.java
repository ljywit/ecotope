package com.rdc.kingsa.model.entity.terra;

import java.util.Date;

public class AncientTreeGrowthSituation {
	
    private String id;

    private String treeId;

    private String picIdentifier;

    private String picUrl;

    private String growthSituation;

    private Date monitorTime;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId == null ? null : treeId.trim();
    }

    public String getPicIdentifier() {
        return picIdentifier;
    }

    public void setPicIdentifier(String picIdentifier) {
        this.picIdentifier = picIdentifier == null ? null : picIdentifier.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getGrowthSituation() {
        return growthSituation;
    }

    public void setGrowthSituation(String growthSituation) {
        this.growthSituation = growthSituation == null ? null : growthSituation.trim();
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
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