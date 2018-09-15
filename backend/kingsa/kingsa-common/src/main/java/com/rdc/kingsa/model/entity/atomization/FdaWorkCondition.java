package com.rdc.kingsa.model.entity.atomization;

import java.math.BigDecimal;
import java.util.Date;

public class FdaWorkCondition {
    private String id;

    private Object startTime;

    private BigDecimal inputFlowMin;

    private BigDecimal outputFlowMin;

    private String openMode;

    private BigDecimal upstreamWaterlineMin;

    private BigDecimal downstreamWaterlineMin;

    private Object endTime;

    private String monitorRecordId;

    private BigDecimal inputFlowMax;

    private BigDecimal outputFlowMax;

    private BigDecimal upstreamWaterlineMax;

    private BigDecimal downstreamWaterlineMax;

    private Date createTime;

    private Date modifyTime;

    private String remarks;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Object getStartTime() {
        return startTime;
    }

    public void setStartTime(Object startTime) {
        this.startTime = startTime;
    }

    public BigDecimal getInputFlowMin() {
        return inputFlowMin;
    }

    public void setInputFlowMin(BigDecimal inputFlowMin) {
        this.inputFlowMin = inputFlowMin;
    }

    public BigDecimal getOutputFlowMin() {
        return outputFlowMin;
    }

    public void setOutputFlowMin(BigDecimal outputFlowMin) {
        this.outputFlowMin = outputFlowMin;
    }

    public String getOpenMode() {
        return openMode;
    }

    public void setOpenMode(String openMode) {
        this.openMode = openMode == null ? null : openMode.trim();
    }

    public BigDecimal getUpstreamWaterlineMin() {
        return upstreamWaterlineMin;
    }

    public void setUpstreamWaterlineMin(BigDecimal upstreamWaterlineMin) {
        this.upstreamWaterlineMin = upstreamWaterlineMin;
    }

    public BigDecimal getDownstreamWaterlineMin() {
        return downstreamWaterlineMin;
    }

    public void setDownstreamWaterlineMin(BigDecimal downstreamWaterlineMin) {
        this.downstreamWaterlineMin = downstreamWaterlineMin;
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

    public Object getEndTime() {
        return endTime;
    }

    public void setEndTime(Object endTime) {
        this.endTime = endTime;
    }

    public String getMonitorRecordId() {
        return monitorRecordId;
    }

    public void setMonitorRecordId(String monitorRecordId) {
        this.monitorRecordId = monitorRecordId == null ? null : monitorRecordId.trim();
    }

    public BigDecimal getInputFlowMax() {
        return inputFlowMax;
    }

    public void setInputFlowMax(BigDecimal inputFlowMax) {
        this.inputFlowMax = inputFlowMax;
    }

    public BigDecimal getOutputFlowMax() {
        return outputFlowMax;
    }

    public void setOutputFlowMax(BigDecimal outputFlowMax) {
        this.outputFlowMax = outputFlowMax;
    }

    public BigDecimal getUpstreamWaterlineMax() {
        return upstreamWaterlineMax;
    }

    public void setUpstreamWaterlineMax(BigDecimal upstreamWaterlineMax) {
        this.upstreamWaterlineMax = upstreamWaterlineMax;
    }

    public BigDecimal getDownstreamWaterlineMax() {
        return downstreamWaterlineMax;
    }

    public void setDownstreamWaterlineMax(BigDecimal downstreamWaterlineMax) {
        this.downstreamWaterlineMax = downstreamWaterlineMax;
    }
}