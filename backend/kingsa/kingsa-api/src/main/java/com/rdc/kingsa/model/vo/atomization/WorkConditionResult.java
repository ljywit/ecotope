package com.rdc.kingsa.model.vo.atomization;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lxf on 18/8/1.
 */
@ApiModel("工况信息")
public class WorkConditionResult {
    private String id;

    @ApiModelProperty("水电站")
    private String stationName;

    @ApiModelProperty("监测时间")
    private Date startTime;

    @ApiModelProperty("监测时间")
    private Date endTime;

    @ApiModelProperty("入库流量")
    private BigDecimal inputFlowMin;

    @ApiModelProperty("入库流量")
    private BigDecimal inputFlowMax;

    @ApiModelProperty("出库流量")
    private BigDecimal outputFlowMin;

    @ApiModelProperty("出库流量")
    private BigDecimal outputFlowMax;

    @ApiModelProperty("开启方式")
    private String openMode;

    @ApiModelProperty("上游水位")
    private BigDecimal upstreamWaterlineMin;

    @ApiModelProperty("上游水位")
    private BigDecimal upstreamWaterlineMax;

    @ApiModelProperty("下游水位")
    private BigDecimal downstreamWaterlineMin;

    @ApiModelProperty("下游水位")
    private BigDecimal downstreamWaterlineMax;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getInputFlowMin() {
        return inputFlowMin;
    }

    public void setInputFlowMin(BigDecimal inputFlowMin) {
        this.inputFlowMin = inputFlowMin;
    }

    public BigDecimal getInputFlowMax() {
        return inputFlowMax;
    }

    public void setInputFlowMax(BigDecimal inputFlowMax) {
        this.inputFlowMax = inputFlowMax;
    }

    public BigDecimal getOutputFlowMin() {
        return outputFlowMin;
    }

    public void setOutputFlowMin(BigDecimal outputFlowMin) {
        this.outputFlowMin = outputFlowMin;
    }

    public BigDecimal getOutputFlowMax() {
        return outputFlowMax;
    }

    public void setOutputFlowMax(BigDecimal outputFlowMax) {
        this.outputFlowMax = outputFlowMax;
    }

    public String getOpenMode() {
        return openMode;
    }

    public void setOpenMode(String openMode) {
        this.openMode = openMode;
    }

    public BigDecimal getUpstreamWaterlineMin() {
        return upstreamWaterlineMin;
    }

    public void setUpstreamWaterlineMin(BigDecimal upstreamWaterlineMin) {
        this.upstreamWaterlineMin = upstreamWaterlineMin;
    }

    public BigDecimal getUpstreamWaterlineMax() {
        return upstreamWaterlineMax;
    }

    public void setUpstreamWaterlineMax(BigDecimal upstreamWaterlineMax) {
        this.upstreamWaterlineMax = upstreamWaterlineMax;
    }

    public BigDecimal getDownstreamWaterlineMin() {
        return downstreamWaterlineMin;
    }

    public void setDownstreamWaterlineMin(BigDecimal downstreamWaterlineMin) {
        this.downstreamWaterlineMin = downstreamWaterlineMin;
    }

    public BigDecimal getDownstreamWaterlineMax() {
        return downstreamWaterlineMax;
    }

    public void setDownstreamWaterlineMax(BigDecimal downstreamWaterlineMax) {
        this.downstreamWaterlineMax = downstreamWaterlineMax;
    }
}
