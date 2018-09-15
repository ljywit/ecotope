package com.rdc.kingsa.model.dto.section;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("断面基本信息-保存")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SectionView {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("断面名称")
    @NotNull(message = "断面名称不能为空")
    @Length(min = 0, max = 30, message = "断面名称不能超过{max}")
    private String sectionName;

    @ApiModelProperty("序号")
    @NotNull(message = "序号不能为空")
    @Range(min = 0, max = 999, message = "序号必须在{min}与{max}之间")
    private Short serialNum;

    @ApiModelProperty("水域类型")
    @NotNull(message = "水域类型不能为空")
    @Range(min = 0, max = 999, message = "水域类型必须在{min}与{max}之间")
    private Short riverType;

    @ApiModelProperty("断面位置")
    @NotNull(message = "断面位置不能为空")
    @Length(min = 0, max = 30, message = "断面位置不能超过{max}")
    private String location;

    @ApiModelProperty("所在河流")
    @NotNull(message = "所在河流不能为空")
    @Length(min = 0, max = 30, message = "所在河流不能超过{max}")
    private String belongRiver;

    @ApiModelProperty("经度")
    @NotNull(message = "经度不能为空")
    @Range(min = 0, max = 999, message = "经度必须在{min}与{max}之间")
    private Double longitude;

    @ApiModelProperty("纬度")
    @NotNull(message = "纬度不能为空")
    @Range(min = 0, max = 999, message = "纬度必须在{min}与{max}之间")
    private Double latitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Short getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

    public Short getRiverType() {
        return riverType;
    }

    public void setRiverType(Short riverType) {
        this.riverType = riverType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getBelongRiver() {
        return belongRiver;
    }

    public void setBelongRiver(String belongRiver) {
        this.belongRiver = belongRiver == null ? null : belongRiver.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}