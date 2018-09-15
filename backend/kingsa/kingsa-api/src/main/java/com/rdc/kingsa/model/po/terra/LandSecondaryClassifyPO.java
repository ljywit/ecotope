package com.rdc.kingsa.model.po.terra;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/25.
 */
public class LandSecondaryClassifyPO {
    private String sectionName;

    private String monitorTime;

    private String secondaryIdentifier;

    private String secondaryName;

    private BigDecimal areaCovered;

    private BigDecimal percentage;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(String monitorTime) {
        this.monitorTime = monitorTime;
    }

    public String getSecondaryIdentifier() {
        return secondaryIdentifier;
    }

    public void setSecondaryIdentifier(String secondaryIdentifier) {
        this.secondaryIdentifier = secondaryIdentifier;
    }

    public String getSecondaryName() {
        return secondaryName;
    }

    public void setSecondaryName(String secondaryName) {
        this.secondaryName = secondaryName;
    }

    public BigDecimal getAreaCovered() {
        return areaCovered;
    }

    public void setAreaCovered(BigDecimal areaCovered) {
        this.areaCovered = areaCovered;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}
