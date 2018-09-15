package com.rdc.kingsa.model.vo.fault;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

public class FaultListVO {
    @ApiModelProperty("断层id")
    private String id;

    @ApiModelProperty("断层编号")
    private String faultNum;

    @ApiModelProperty("距坝距离")
    private BigDecimal damDistance;

    @ApiModelProperty("距河口距离")
    private BigDecimal estuaryDistance;

    @ApiModelProperty("河流名称")
    private String riverName;

    @ApiModelProperty("左岸X")
    private BigDecimal leftBankX;

    @ApiModelProperty("左岸Y")
    private BigDecimal leftBankY;

    @ApiModelProperty("右岸X")
    private BigDecimal rightBankX;

    @ApiModelProperty("右岸Y")
    private BigDecimal rightBankY;

    @ApiModelProperty("左岸高程")
    private BigDecimal leftBankElevation;

    @ApiModelProperty("右岸高程")
    private BigDecimal rightBankElevation;

    @ApiModelProperty("所在水库")
    private String locationReservoir;

    @ApiModelProperty("测量时间")
    private List<String> measureTime;

    @ApiModelProperty("支流/干流")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(List<String> measureTime) {
        this.measureTime = measureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFaultNum() {
        return faultNum;
    }

    public void setFaultNum(String faultNum) {
        this.faultNum = faultNum;
    }

    public BigDecimal getDamDistance() {
        return damDistance;
    }

    public void setDamDistance(BigDecimal damDistance) {
        this.damDistance = damDistance;
    }

    public BigDecimal getEstuaryDistance() {
        return estuaryDistance;
    }

    public void setEstuaryDistance(BigDecimal estuaryDistance) {
        this.estuaryDistance = estuaryDistance;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }

    public BigDecimal getLeftBankX() {
        return leftBankX;
    }

    public void setLeftBankX(BigDecimal leftBankX) {
        this.leftBankX = leftBankX;
    }

    public BigDecimal getLeftBankY() {
        return leftBankY;
    }

    public void setLeftBankY(BigDecimal leftBankY) {
        this.leftBankY = leftBankY;
    }

    public BigDecimal getRightBankX() {
        return rightBankX;
    }

    public void setRightBankX(BigDecimal rightBankX) {
        this.rightBankX = rightBankX;
    }

    public BigDecimal getRightBankY() {
        return rightBankY;
    }

    public void setRightBankY(BigDecimal rightBankY) {
        this.rightBankY = rightBankY;
    }

    public BigDecimal getLeftBankElevation() {
        return leftBankElevation;
    }

    public void setLeftBankElevation(BigDecimal leftBankElevation) {
        this.leftBankElevation = leftBankElevation;
    }

    public BigDecimal getRightBankElevation() {
        return rightBankElevation;
    }

    public void setRightBankElevation(BigDecimal rightBankElevation) {
        this.rightBankElevation = rightBankElevation;
    }

    public String getLocationReservoir() {
        return locationReservoir;
    }

    public void setLocationReservoir(String locationReservoir) {
        this.locationReservoir = locationReservoir;
    }
}
