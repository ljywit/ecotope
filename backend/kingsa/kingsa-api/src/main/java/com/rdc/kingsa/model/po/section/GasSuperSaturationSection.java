package com.rdc.kingsa.model.po.section;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/24.
 */
public class GasSuperSaturationSection extends BaseSection {

    private String region;

    private String samplingType;

    private String monitorFrequency;

    private BigDecimal fromXld;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSamplingType() {
        return samplingType;
    }

    public void setSamplingType(String samplingType) {
        this.samplingType = samplingType;
    }

    public String getMonitorFrequency() {
        return monitorFrequency;
    }

    public void setMonitorFrequency(String monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
    }

    public BigDecimal getFromXld() {
        return fromXld;
    }

    public void setFromXld(BigDecimal fromXld) {
        this.fromXld = fromXld;
    }
}
