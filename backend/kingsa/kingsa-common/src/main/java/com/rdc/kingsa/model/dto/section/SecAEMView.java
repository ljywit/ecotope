package com.rdc.kingsa.model.dto.section;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("断面水生生态-保存")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecAEMView extends SectionView {


    @ApiModelProperty("断面ID")
    private String sectionId;

    @ApiModelProperty("区域")
    @NotNull(message = "区域不能为空")
    @Length(min = 0, max = 30, message = "区域不能超过{max}")
    private String region;

    @ApiModelProperty("距乌东德里程")
    @NotNull(message = "距乌东德里程不能为空")
    @Range(min = 0, max = 99999, message = "距乌东德里程必须在{min}与{max}之间")
    private Double fromWdd;

    @ApiModelProperty("珍稀特有鱼类")
    @NotNull(message = "珍稀特有鱼类不能为空")
    @Range(min = 0, max = 1, message = "珍稀特有鱼类必须在{min}与{max}之间")
    private Short rareFish;

    @ApiModelProperty("重要经济鱼类")
    @NotNull(message = "重要经济鱼类不能为空")
    @Range(min = 0, max = 1, message = "重要经济鱼类必须在{min}与{max}之间")
    private Short economicFish;

    @ApiModelProperty("产卵场和繁殖生态")
    @NotNull(message = "产卵场和繁殖生态不能为空")
    @Range(min = 0, max = 1, message = "产卵场和繁殖生态必须在{min}与{max}之间")
    private Short reproEcology;

    @ApiModelProperty("渔业生态环境")
    @NotNull(message = "渔业生态环境不能为空")
    @Range(min = 0, max = 1, message = "渔业生态环境必须在{min}与{max}之间")
    private Short fisheryEnv;

    @ApiModelProperty("备注信息")
    @Length(min = 0, max = 200, message = "区域不能超过{max}")
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

    public Double getFromWdd() {
        return fromWdd;
    }

    public void setFromWdd(Double fromWdd) {
        this.fromWdd = fromWdd;
    }

    public Short getRareFish() {
        return rareFish;
    }

    public void setRareFish(Short rareFish) {
        this.rareFish = rareFish;
    }

    public Short getEconomicFish() {
        return economicFish;
    }

    public void setEconomicFish(Short economicFish) {
        this.economicFish = economicFish;
    }

    public Short getReproEcology() {
        return reproEcology;
    }

    public void setReproEcology(Short reproEcology) {
        this.reproEcology = reproEcology;
    }

    public Short getFisheryEnv() {
        return fisheryEnv;
    }

    public void setFisheryEnv(Short fisheryEnv) {
        this.fisheryEnv = fisheryEnv;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

}