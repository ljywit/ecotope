package com.rdc.kingsa.model.dto.section;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("断面过饱和气体监测-保存")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecGSMView extends SectionView {

    @ApiModelProperty("断面ID")
    private String sectionId;

    @ApiModelProperty("区域")
    @NotNull(message = "区域不能为空")
    @Length(min = 0, max = 30, message = "区域不能超过{max}")
    private String region;

    @ApiModelProperty("取样类型")
    @NotNull(message = "取样类型不能为空")
    @Length(min = 0, max = 30, message = "取样类型不能超过{max}")
    private String samplingType;

    @ApiModelProperty("监测频率")
    @NotNull(message = "监测频率不能为空")
    @Length(min = 0, max = 30, message = "监测频率不能超过{max}")
    private String monitorFrequency;

    @ApiModelProperty("距溪洛渡里程")
    @NotNull(message = "距溪洛渡里程不能为空")
    @Range(min = 0, max = 99999, message = "序号必须在{min}与{max}之间")
    private Double fromXld;

    @ApiModelProperty("备注信息")
    @Length(min = 0, max = 30, message = "监测频率不能超过{max}")
    private String remarks;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

}