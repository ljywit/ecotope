package com.rdc.kingsa.model.dto.section;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("断面水质监测-保存")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecWQMView extends SectionView {

    @ApiModelProperty("断面ID")
    private String sectionId;

    @ApiModelProperty("监测内容")
    @NotNull(message = "监测内容不能为空")
    @Length(min = 0, max = 30, message = "监测内容不能超过{max}")
    private String monitorContent;

    @ApiModelProperty("监测频率")
    @NotNull(message = "监测频率不能为空")
    @Length(min = 0, max = 30, message = "监测频率不能超过{max}")
    private String monitorFrequency;

    @ApiModelProperty("水质规划类别")
    @NotNull(message = "水质规划类别不能为空")
    @Length(min = 0, max = 30, message = "水质规划类别不能超过{max}")
    private String qaPlanCate;

    @ApiModelProperty("采样垂线（点）")
    @NotNull(message = "采样垂线（点）不能为空")
    @Length(min = 0, max = 30, message = "采样垂线（点）不能超过{max}")
    private String samp;

    @ApiModelProperty("与规范符合性")
    @NotNull(message = "与规范符合性不能为空")
    @Length(min = 0, max = 30, message = "与规范符合性不能超过{max}")
    private String conformance;

    @ApiModelProperty("距乌东德里程")
    @NotNull(message = "距乌东德里程不能为空")
    @Range(min = 0, max = 99999, message = "距乌东德里程必须在{min}与{max}之间")
    private Double fromWdd;

    @ApiModelProperty("是否是排污口")
    @NotNull(message = "是否是排污口不能为空")
    @Range(min = 0, max = 1, message = "是否是排污口必须在{min}与{max}之间")
    private Short drainOutlet;

    @ApiModelProperty("是否干支流水质评价")
    @Range(min = 0, max = 1, message = "是否干支流水质评价必须在{min}与{max}之间")
    private Short valuationQ;

    @ApiModelProperty("是否排污口水质评价")
    @Range(min = 0, max = 1, message = "是否排污口水质评价必须在{min}与{max}之间")
    private Short valuationS;

    @ApiModelProperty("是否富营养化评价")
    @Range(min = 0, max = 1, message = "是否富营养化评价必须在{min}与{max}之间")
    private Short valuationE;

    @ApiModelProperty("是否底泥重金属评价")
    @Range(min = 0, max = 1, message = "是否底泥重金属评价必须在{min}与{max}之间")
    private Short valuationH;

    @ApiModelProperty("备注信息")
    @Length(min = 0, max = 25, message = "备注信息不能超过{max}")
    private String remarks;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
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
        this.qaPlanCate = qaPlanCate == null ? null : qaPlanCate.trim();
    }

    public String getSamp() {
        return samp;
    }

    public void setSamp(String samp) {
        this.samp = samp == null ? null : samp.trim();
    }

    public String getConformance() {
        return conformance;
    }

    public void setConformance(String conformance) {
        this.conformance = conformance == null ? null : conformance.trim();
    }

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }

    public Short getValuationQ() {
        return valuationQ;
    }

    public void setValuationQ(Short valuationQ) {
        this.valuationQ = valuationQ;
    }

    public Short getValuationS() {
        return valuationS;
    }

    public void setValuationS(Short valuationS) {
        this.valuationS = valuationS;
    }

    public Short getValuationE() {
        return valuationE;
    }

    public void setValuationE(Short valuationE) {
        this.valuationE = valuationE;
    }

    public Short getValuationH() {
        return valuationH;
    }

    public void setValuationH(Short valuationH) {
        this.valuationH = valuationH;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }


    public Short getDrainOutlet() {
        return drainOutlet;
    }

    public void setDrainOutlet(Short drainOutlet) {
        this.drainOutlet = drainOutlet;
    }
}