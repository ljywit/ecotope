package com.rdc.kingsa.model.entity.fault;

import java.math.BigDecimal;

public class Fault {
    private String id;

    private String faultNum;

    private Double damDistance;

    private Double estuaryDistance;

    private String riverName;

    private Double leftBankX;

    private Double leftBankY;

    private Double rightBankX;

    private Double rightBankY;

    private Double leftBankElevation;

    private Double rightBankElevation;

    private String locationReservoir;

    private String type;

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