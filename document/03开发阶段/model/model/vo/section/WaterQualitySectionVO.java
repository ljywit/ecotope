package com.rdc.kingsa.model.vo.section;

/**
 * @ClassName:WaterQualitySectionResult
 * @Description:水质断面查询结果
 * @Author:Shelly Chan
 * @CreateTime:2018年6月21日上午8:27:44
 */
public class WaterQualitySectionVO extends SectionBaseInfo {

    private Short drainOutlet;

    private String monitorContent;

    private String monitorFrequency;

    private String qaPlanCate;

    private String samp;

    private String conformance;

    private Double fromWdd;

    public Short getDrainOutlet() {
        return drainOutlet;
    }

    public void setDrainOutlet(Short drainOutlet) {
        this.drainOutlet = drainOutlet;
    }

    public String getMonitorContent() {
        return monitorContent;
    }

    public void setMonitorContent(String monitorContent) {
        this.monitorContent = monitorContent;
    }

    public String getMonitorFrequency() {
        return monitorFrequency;
    }

    public void setMonitorFrequency(String monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
    }

    public String getQaPlanCate() {
        return qaPlanCate;
    }

    public void setQaPlanCate(String qaPlanCate) {
        this.qaPlanCate = qaPlanCate;
    }

    public String getSamp() {
        return samp;
    }

    public void setSamp(String samp) {
        this.samp = samp;
    }

    public String getConformance() {
        return conformance;
    }

    public void setConformance(String conformance) {
        this.conformance = conformance;
    }

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }
}