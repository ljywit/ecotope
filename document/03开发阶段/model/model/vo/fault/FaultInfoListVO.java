package com.rdc.kingsa.model.vo.fault;

import io.swagger.annotations.ApiModelProperty;

public class FaultInfoListVO {
    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("起点距")
    private Double startPointDistant;

    @ApiModelProperty("高程")
    private Double elevation;

    @ApiModelProperty("测量日期  yyyy-mm")
    private String dateTime;

    @ApiModelProperty("断层id")
    private String faultId;

    @ApiModelProperty("水面高")
    private Double waterHall;

    public Double getWaterHall() {
        return waterHall;
    }

    public void setWaterHall(Double waterHall) {
        this.waterHall = waterHall;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getStartPointDistant() {
        return startPointDistant;
    }

    public void setStartPointDistant(Double startPointDistant) {
        this.startPointDistant = startPointDistant;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getFaultId() {
        return faultId;
    }

    public void setFaultId(String faultId) {
        this.faultId = faultId;
    }
}
