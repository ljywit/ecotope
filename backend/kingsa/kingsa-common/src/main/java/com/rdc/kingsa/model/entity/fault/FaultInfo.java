package com.rdc.kingsa.model.entity.fault;

import java.util.Date;

public class FaultInfo {
    private Double startPointDistant;

    private String id;

    private Double elevation;

    private Date dateTime;

    private String faultId;

    private Double status;

    private Double waterHall;

    public Double getStartPointDistant() {
        return startPointDistant;
    }

    public void setStartPointDistant(Double startPointDistant) {
        this.startPointDistant = startPointDistant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getFaultId() {
        return faultId;
    }

    public void setFaultId(String faultId) {
        this.faultId = faultId;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public Double getWaterHall() {
        return waterHall;
    }

    public void setWaterHall(Double waterHall) {
        this.waterHall = waterHall;
    }
}