package com.rdc.kingsa.model.entity.water.temperature;

import java.util.Date;

public class VWTMIFC {
	
    private String id;

    private String tableId;

    private Date monitorTime;

    private Double waterDepth;

    private Double waterTemper;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId == null ? null : tableId.trim();
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Double getWaterDepth() {
        return waterDepth;
    }

    public void setWaterDepth(Double waterDepth) {
        this.waterDepth = waterDepth;
    }

    public Double getWaterTemper() {
        return waterTemper;
    }

    public void setWaterTemper(Double waterTemper) {
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
    
}