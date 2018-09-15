package com.rdc.kingsa.model.vo.atomization;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/1.
 */
@ApiModel("测点分布->测站列表")
public class MonitorSpotResult {
    private String id;
    
    @ApiModelProperty("测点编号")
    private String spotCode;

    @ApiModelProperty("测量仪器类型")
    private String instrumentType;

    @ApiModelProperty("部位")
    private String spotName;

    @ApiModelProperty("岸别")
    private String stationSide;

    @ApiModelProperty("监测内容")
    private String monitorContent;

    @ApiModelProperty("高程")
    private BigDecimal elevation;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpotCode() {
        return spotCode;
    }

    public void setSpotCode(String spotCode) {
        this.spotCode = spotCode;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public String getStationSide() {
        return stationSide;
    }

    public void setStationSide(String stationSide) {
        this.stationSide = stationSide;
    }

    public String getMonitorContent() {
        return monitorContent;
    }

    public void setMonitorContent(String monitorContent) {
        this.monitorContent = monitorContent;
    }

    public BigDecimal getElevation() {
        return elevation;
    }

    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
