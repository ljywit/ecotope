package com.rdc.kingsa.model.vo.water.eco.fish;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by lxf on 18/7/29.
 */
public class SpawningSiteResult {
    private String id;

    private String sectionName;

    private BigDecimal distanceStart;

    private BigDecimal distanceEnd;

    private Date monitorTimeStart;

    private Date monitorTimeEnd;

    private List<FishRunOffResult> fishes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public BigDecimal getDistanceStart() {
        return distanceStart;
    }

    public void setDistanceStart(BigDecimal distanceStart) {
        this.distanceStart = distanceStart;
    }

    public BigDecimal getDistanceEnd() {
        return distanceEnd;
    }

    public void setDistanceEnd(BigDecimal distanceEnd) {
        this.distanceEnd = distanceEnd;
    }

    public Date getMonitorTimeStart() {
        return monitorTimeStart;
    }

    public void setMonitorTimeStart(Date monitorTimeStart) {
        this.monitorTimeStart = monitorTimeStart;
    }

    public Date getMonitorTimeEnd() {
        return monitorTimeEnd;
    }

    public void setMonitorTimeEnd(Date monitorTimeEnd) {
        this.monitorTimeEnd = monitorTimeEnd;
    }

    public List<FishRunOffResult> getFishes() {
        return fishes;
    }

    public void setFishes(List<FishRunOffResult> fishes) {
        this.fishes = fishes;
    }
}
