package com.rdc.kingsa.model.dto.fault;

import io.swagger.annotations.ApiModelProperty;

public class UpdateFaultDTO {

    @ApiModelProperty("断层编号")
    private String faultNum;

    @ApiModelProperty("距坝距离")
    private Double damDistance;

    @ApiModelProperty("距河口距离")
    private Double estuaryDistance;

    @ApiModelProperty("河流名称")
    private String riverName;

    @ApiModelProperty("左岸X")
    private Double leftBankX;

    @ApiModelProperty("左岸Y")
    private Double leftBankY;

    @ApiModelProperty("右岸X")
    private Double rightBankX;

    @ApiModelProperty("右岸Y")
    private Double rightBankY;

    @ApiModelProperty("左岸高程")
    private Double leftBankElevation;

    @ApiModelProperty("右岸高程")
    private Double rightBankElevation;

    @ApiModelProperty("所在水库")
    private String locationReservoir;

    @ApiModelProperty("干/支流")
    private String type;


    public String getFaultNum() {
        return faultNum;
    }

    public void setFaultNum(String faultNum) {
        this.faultNum = faultNum;
    }

    public Double getDamDistance() {
        return damDistance;
    }

    public void setDamDistance(Double damDistance) {
        this.damDistance = damDistance;
    }

    public Double getEstuaryDistance() {
        return estuaryDistance;
    }

    public void setEstuaryDistance(Double estuaryDistance) {
        this.estuaryDistance = estuaryDistance;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }

    public Double getLeftBankX() {
        return leftBankX;
    }

    public void setLeftBankX(Double leftBankX) {
        this.leftBankX = leftBankX;
    }

    public Double getLeftBankY() {
        return leftBankY;
    }

    public void setLeftBankY(Double leftBankY) {
        this.leftBankY = leftBankY;
    }

    public Double getRightBankX() {
        return rightBankX;
    }

    public void setRightBankX(Double rightBankX) {
        this.rightBankX = rightBankX;
    }

    public Double getRightBankY() {
        return rightBankY;
    }

    public void setRightBankY(Double rightBankY) {
        this.rightBankY = rightBankY;
    }

    public Double getLeftBankElevation() {
        return leftBankElevation;
    }

    public void setLeftBankElevation(Double leftBankElevation) {
        this.leftBankElevation = leftBankElevation;
    }

    public Double getRightBankElevation() {
        return rightBankElevation;
    }

    public void setRightBankElevation(Double rightBankElevation) {
        this.rightBankElevation = rightBankElevation;
    }

    public String getLocationReservoir() {
        return locationReservoir;
    }

    public void setLocationReservoir(String locationReservoir) {
        this.locationReservoir = locationReservoir;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
