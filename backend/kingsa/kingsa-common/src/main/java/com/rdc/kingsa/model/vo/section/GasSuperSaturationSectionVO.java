package com.rdc.kingsa.model.vo.section;

/**
 * @ClassName:GasSupersaturationSectionResult
 * @Description:气体过饱和
 * @Author:Shelly Chan
 * @CreateTime:2018年4月24日下午2:13:59
 */
public class GasSuperSaturationSectionVO extends SectionBaseInfo {

    private String region;

    private String samplingType;

    private String monitorFrequency;

    private Double fromXld;

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

    public Double getFromXld() {
        return fromXld;
    }

    public void setFromXld(Double fromXld) {
        this.fromXld = fromXld;
    }
}