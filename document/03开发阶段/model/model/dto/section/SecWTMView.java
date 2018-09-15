package com.rdc.kingsa.model.dto.section;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("断面水温监测-保存")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecWTMView extends SectionView {

    @ApiModelProperty("断面ID")
    private String sectionId;

    @ApiModelProperty("监测内容")
    @NotNull(message = "监测内容不能为空")
    @Length(min = 0, max = 30, message = "监测内容不能超过{max}")
    private String monitorContent;

    @ApiModelProperty("监测内容描述")
    @NotNull(message = "监测内容描述不能为空")
    @Length(min = 0, max = 30, message = "监测内容描述不能超过{max}")
    private String contentDescription;

    @ApiModelProperty("监测方式")
    @NotNull(message = "监测方式不能为空")
    @Length(min = 0, max = 30, message = "监测方式不能超过{max}")
    private String monitorType;

    @ApiModelProperty("河名")
    @Length(min = 0, max = 30, message = "河名不能超过{max}")
    private String riverName;

    @ApiModelProperty("所在江段")
    @NotNull(message = "所在江段不能为空")
    @Length(min = 0, max = 30, message = "所在江段不能超过{max}")
    private String riverLink;

    @ApiModelProperty("距乌东德里程")
    @NotNull(message = "距乌东德里程不能为空")
    @Range(min = 0, max = 99999, message = "距乌东德里程必须在{min}与{max}之间")
    private Double fromWdd;

    @ApiModelProperty("是否监测表层水温")
    @NotNull(message = "是否监测表层水温不能为空")
    @Range(min = 0, max = 1, message = "是否监测表层水温必须在{min}与{max}之间")
    private Short surface;

    @ApiModelProperty("是否监测垂向水温")
    @NotNull(message = "是否监测垂向水温不能为空")
    @Range(min = 0, max = 1, message = "是否监测垂向水温必须在{min}与{max}之间")
    private Short vertical;

    @ApiModelProperty("备注信息")
    @Length(min = 0, max = 30, message = "备注信息不能超过{max}")
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

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName == null ? null : riverName.trim();
    }

    public String getRiverLink() {
        return riverLink;
    }

    public void setRiverLink(String riverLink) {
        this.riverLink = riverLink == null ? null : riverLink.trim();
    }

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }

    public Short getSurface() {
        return surface;
    }

    public void setSurface(Short surface) {
        this.surface = surface;
    }

    public Short getVertical() {
        return vertical;
    }

    public void setVertical(Short vertical) {
        this.vertical = vertical;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

}