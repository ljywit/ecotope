package com.rdc.kingsa.model.dto.fault;

import io.swagger.annotations.ApiModelProperty;

public class UpdateFaultInfoDTO {
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
