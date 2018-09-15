package com.rdc.kingsa.model.dto.water.quality;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rdc.kingsa.model.entity.water.quality.WaterQualityMIBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lxf on 18/7/17.
 */
@ApiModel("水质监测填报信息")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WaterQualityFCCheckView extends WaterQualityMIBase {
    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("断面ID")
    @NotNull(message = "断面ID不能为空")
    private String secId;

    @ApiModelProperty("监测时间")
    @NotNull(message = "监测时间不能为空")
    private Date monitorTime;

    @ApiModelProperty("水温")
    @Range(min = -256, max = 100, message = "水温必须在{min}与{max}之间")
    private BigDecimal waterTemp;

    @ApiModelProperty("ph值")
    @Range(min = 0, max = 14, message = "ph值必须在{min}与{max}之间")
    private BigDecimal phValue;

    @ApiModelProperty("溶解氧")
    @Range(min = 0, max = 99999, message = "溶解氧必须在{min}与{max}之间")
    private BigDecimal disOxygen;

    @ApiModelProperty("高锰酸盐指数")
    @NotNull(message = "高锰酸盐指数不能为空")
    @Range(min = 0, max = 99999, message = "高锰酸盐指数必须在{min}与{max}之间")
    private BigDecimal permanganate;

    @ApiModelProperty("化学需氧量")
    @NotNull(message = "化学需氧量不能为空")
    @Range(min = 0, max = 99999, message = "化学需氧量必须在{min}与{max}之间")
    private BigDecimal oxDemand;

    @ApiModelProperty("五日生化需氧量")
    @NotNull(message = "五日生化需氧量不能为空")
    @Range(min = 0, max = 99999, message = "五日生化需氧量必须在{min}与{max}之间")
    private BigDecimal boDemand;

    @ApiModelProperty("氨氮")
    @NotNull(message = "氨氮不能为空")
    @Range(min = 0, max = 99999, message = "氨氮必须在{min}与{max}之间")
    private BigDecimal ammonia;

    @ApiModelProperty("总磷")
    @NotNull(message = "总磷不能为空")
    @Range(min = 0, max = 99999, message = "总磷必须在{min}与{max}之间")
    private BigDecimal phosphorus;

    @ApiModelProperty("总氮")
    @NotNull(message = "总氮不能为空")
    @Range(min = 0, max = 99999, message = "总氮必须在{min}与{max}之间")
    private BigDecimal nitrogen;

    @ApiModelProperty("铜")
    @NotNull(message = "铜不能为空")
    @Range(min = 0, max = 99999, message = "铜必须在{min}与{max}之间")
    private BigDecimal copper;

    @ApiModelProperty("锌")
    @NotNull(message = "锌不能为空")
    @Range(min = 0, max = 99999, message = "锌必须在{min}与{max}之间")
    private BigDecimal zinc;

    @ApiModelProperty("氟化物")
    @NotNull(message = "氟化物不能为空")
    @Range(min = 0, max = 99999, message = "氟化物必须在{min}与{max}之间")
    private BigDecimal fluoride;

    @ApiModelProperty("硒")
    @NotNull(message = "硒不能为空")
    @Range(min = 0, max = 99999, message = "硒必须在{min}与{max}之间")
    private BigDecimal selenium;

    @ApiModelProperty("砷")
    @NotNull(message = "砷不能为空")
    @Range(min = 0, max = 99999, message = "砷必须在{min}与{max}之间")
    private BigDecimal arsenic;

    @ApiModelProperty("汞")
    @NotNull(message = "汞不能为空")
    @Range(min = 0, max = 99999, message = "汞必须在{min}与{max}之间")
    private BigDecimal mercury;

    @ApiModelProperty("镉")
    @NotNull(message = "镉不能为空")
    @Range(min = 0, max = 99999, message = "镉必须在{min}与{max}之间")
    private BigDecimal cadmium;

    @ApiModelProperty("六价铬")
    @NotNull(message = "六价铬不能为空")
    @Range(min = 0, max = 99999, message = "六价铬必须在{min}与{max}之间")
    private BigDecimal chromium;

    @ApiModelProperty("铅")
    @NotNull(message = "铅不能为空")
    @Range(min = 0, max = 99999, message = "铅必须在{min}与{max}之间")
    private BigDecimal lead;

    @ApiModelProperty("氰化物")
    @NotNull(message = "氰化物不能为空")
    @Range(min = 0, max = 99999, message = "氰化物必须在{min}与{max}之间")
    private BigDecimal cyanide;

    @ApiModelProperty("挥发酚")
    @NotNull(message = "挥发酚不能为空")
    @Range(min = 0, max = 99999, message = "挥发酚必须在{min}与{max}之间")
    private BigDecimal phenol;

    @ApiModelProperty("石油类")
    @NotNull(message = "石油类不能为空")
    @Range(min = 0, max = 99999, message = "石油类必须在{min}与{max}之间")
    private BigDecimal petroleum;

    @ApiModelProperty("阴离子表面活性剂")
    @NotNull(message = "阴离子表面活性剂不能为空")
    @Range(min = 0, max = 99999, message = "阴离子表面活性剂必须在{min}与{max}之间")
    private BigDecimal surfactant;

    @ApiModelProperty("硫化物")
    @NotNull(message = "硫化物不能为空")
    @Range(min = 0, max = 99999, message = "硫化物必须在{min}与{max}之间")
    private BigDecimal sulfide;

    @ApiModelProperty("粪大肠菌群")
    @NotNull(message = "粪大肠菌群不能为空")
    @Range(min = 0, max = 99999, message = "粪大肠菌群必须在{min}与{max}之间")
    private BigDecimal coliform;

    @ApiModelProperty("叶绿素a")
    @NotNull(message = "叶绿素a不能为空")
    @Range(min = 0, max = 99999, message = "叶绿素a必须在{min}与{max}之间")
    private BigDecimal chlorA;

    @ApiModelProperty("透明度")
    @NotNull(message = "透明度不能为空")
    @Range(min = 0, max = 99999, message = "透明度必须在{min}与{max}之间")
    private BigDecimal transparency;

    @ApiModelProperty("悬浮物")
    @NotNull(message = "悬浮物不能为空")
    @Range(min = 0, max = 99999, message = "悬浮物必须在{min}与{max}之间")
    private BigDecimal suspended;

    @ApiModelProperty("备注信息")
    @Length(min = 0, max = 25, message = "备注信息不能超过{max}")
    private String remarks;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getSecId() {
        return secId;
    }

    @Override
    public void setSecId(String secId) {
        this.secId = secId;
    }

    @Override
    public Date getMonitorTime() {
        return monitorTime;
    }

    @Override
    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    @Override
    public BigDecimal getWaterTemp() {
        return waterTemp;
    }

    @Override
    public void setWaterTemp(BigDecimal waterTemp) {
        this.waterTemp = waterTemp;
    }

    @Override
    public BigDecimal getPhValue() {
        return phValue;
    }

    @Override
    public void setPhValue(BigDecimal phValue) {
        this.phValue = phValue;
    }

    @Override
    public BigDecimal getDisOxygen() {
        return disOxygen;
    }

    @Override
    public void setDisOxygen(BigDecimal disOxygen) {
        this.disOxygen = disOxygen;
    }

    @Override
    public BigDecimal getPermanganate() {
        return permanganate;
    }

    @Override
    public void setPermanganate(BigDecimal permanganate) {
        this.permanganate = permanganate;
    }

    @Override
    public BigDecimal getOxDemand() {
        return oxDemand;
    }

    @Override
    public void setOxDemand(BigDecimal oxDemand) {
        this.oxDemand = oxDemand;
    }

    @Override
    public BigDecimal getBoDemand() {
        return boDemand;
    }

    @Override
    public void setBoDemand(BigDecimal boDemand) {
        this.boDemand = boDemand;
    }

    @Override
    public BigDecimal getAmmonia() {
        return ammonia;
    }

    @Override
    public void setAmmonia(BigDecimal ammonia) {
        this.ammonia = ammonia;
    }

    @Override
    public BigDecimal getPhosphorus() {
        return phosphorus;
    }

    @Override
    public void setPhosphorus(BigDecimal phosphorus) {
        this.phosphorus = phosphorus;
    }

    @Override
    public BigDecimal getNitrogen() {
        return nitrogen;
    }

    @Override
    public void setNitrogen(BigDecimal nitrogen) {
        this.nitrogen = nitrogen;
    }

    @Override
    public BigDecimal getCopper() {
        return copper;
    }

    @Override
    public void setCopper(BigDecimal copper) {
        this.copper = copper;
    }

    @Override
    public BigDecimal getZinc() {
        return zinc;
    }

    @Override
    public void setZinc(BigDecimal zinc) {
        this.zinc = zinc;
    }

    @Override
    public BigDecimal getFluoride() {
        return fluoride;
    }

    @Override
    public void setFluoride(BigDecimal fluoride) {
        this.fluoride = fluoride;
    }

    @Override
    public BigDecimal getSelenium() {
        return selenium;
    }

    @Override
    public void setSelenium(BigDecimal selenium) {
        this.selenium = selenium;
    }

    @Override
    public BigDecimal getArsenic() {
        return arsenic;
    }

    @Override
    public void setArsenic(BigDecimal arsenic) {
        this.arsenic = arsenic;
    }

    @Override
    public BigDecimal getMercury() {
        return mercury;
    }

    @Override
    public void setMercury(BigDecimal mercury) {
        this.mercury = mercury;
    }

    @Override
    public BigDecimal getCadmium() {
        return cadmium;
    }

    @Override
    public void setCadmium(BigDecimal cadmium) {
        this.cadmium = cadmium;
    }

    @Override
    public BigDecimal getChromium() {
        return chromium;
    }

    @Override
    public void setChromium(BigDecimal chromium) {
        this.chromium = chromium;
    }

    @Override
    public BigDecimal getLead() {
        return lead;
    }

    @Override
    public void setLead(BigDecimal lead) {
        this.lead = lead;
    }

    @Override
    public BigDecimal getCyanide() {
        return cyanide;
    }

    @Override
    public void setCyanide(BigDecimal cyanide) {
        this.cyanide = cyanide;
    }

    @Override
    public BigDecimal getPhenol() {
        return phenol;
    }

    @Override
    public void setPhenol(BigDecimal phenol) {
        this.phenol = phenol;
    }

    @Override
    public BigDecimal getPetroleum() {
        return petroleum;
    }

    @Override
    public void setPetroleum(BigDecimal petroleum) {
        this.petroleum = petroleum;
    }

    @Override
    public BigDecimal getSurfactant() {
        return surfactant;
    }

    @Override
    public void setSurfactant(BigDecimal surfactant) {
        this.surfactant = surfactant;
    }

    @Override
    public BigDecimal getSulfide() {
        return sulfide;
    }

    @Override
    public void setSulfide(BigDecimal sulfide) {
        this.sulfide = sulfide;
    }

    @Override
    public BigDecimal getColiform() {
        return coliform;
    }

    @Override
    public void setColiform(BigDecimal coliform) {
        this.coliform = coliform;
    }

    @Override
    public BigDecimal getChlorA() {
        return chlorA;
    }

    @Override
    public void setChlorA(BigDecimal chlorA) {
        this.chlorA = chlorA;
    }

    @Override
    public BigDecimal getTransparency() {
        return transparency;
    }

    @Override
    public void setTransparency(BigDecimal transparency) {
        this.transparency = transparency;
    }

    @Override
    public BigDecimal getSuspended() {
        return suspended;
    }

    @Override
    public void setSuspended(BigDecimal suspended) {
        this.suspended = suspended;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
