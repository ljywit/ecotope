package com.rdc.kingsa.model.dto.section;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by lxf on 18/8/31.
 */
@ApiModel("断面水文断面")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecHydrView extends SectionView {

    @ApiModelProperty("断面ID")
    private String sectionId;

    @ApiModelProperty("断面编码")
    private String sectionCode;

    @ApiModelProperty("高程系统")
    private String elevationSystem;

    @ApiModelProperty("所属水库")
    private String reservior;

    @ApiModelProperty("是否进行水位测量")
    private Short waterLevel;

    @ApiModelProperty("是否进行流量测量")
    private Short waterFlow;

    @ApiModelProperty("是否进行水温测量")
    private Short waterTempurature;

    @ApiModelProperty("备注")
    private String remarks;

    @ApiModelProperty("行政区划")
    private String region;

    @ApiModelProperty("一级所属机构")
    private String agent1;

    @ApiModelProperty("二级所属机构")
    private String agent2;

    @ApiModelProperty("三级所属机构")
    private String agent3;

    @ApiModelProperty("编号")
    private String sectionNum;

    @ApiModelProperty("一级水系")
    private String riverSystem1;

    @ApiModelProperty("二级水系")
    private String riverSystem2;

    @ApiModelProperty("三级水系")
    private String riverSystem3;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getElevationSystem() {
        return elevationSystem;
    }

    public void setElevationSystem(String elevationSystem) {
        this.elevationSystem = elevationSystem;
    }

    public String getReservior() {
        return reservior;
    }

    public void setReservior(String reservior) {
        this.reservior = reservior;
    }

    public Short getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(Short waterLevel) {
        this.waterLevel = waterLevel;
    }

    public Short getWaterFlow() {
        return waterFlow;
    }

    public void setWaterFlow(Short waterFlow) {
        this.waterFlow = waterFlow;
    }

    public Short getWaterTempurature() {
        return waterTempurature;
    }

    public void setWaterTempurature(Short waterTempurature) {
        this.waterTempurature = waterTempurature;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAgent1() {
        return agent1;
    }

    public void setAgent1(String agent1) {
        this.agent1 = agent1;
    }

    public String getAgent2() {
        return agent2;
    }

    public void setAgent2(String agent2) {
        this.agent2 = agent2;
    }

    public String getAgent3() {
        return agent3;
    }

    public void setAgent3(String agent3) {
        this.agent3 = agent3;
    }

    public String getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(String sectionNum) {
        this.sectionNum = sectionNum;
    }

    public String getRiverSystem1() {
        return riverSystem1;
    }

    public void setRiverSystem1(String riverSystem1) {
        this.riverSystem1 = riverSystem1;
    }

    public String getRiverSystem2() {
        return riverSystem2;
    }

    public void setRiverSystem2(String riverSystem2) {
        this.riverSystem2 = riverSystem2;
    }

    public String getRiverSystem3() {
        return riverSystem3;
    }

    public void setRiverSystem3(String riverSystem3) {
        this.riverSystem3 = riverSystem3;
    }
}
