package com.rdc.kingsa.model.vo.water.eco.fish;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/7/30.
 */
@ApiModel("渔业繁殖生态-物种组成")
public class SpawnCompositionResult {
    String id;

    @ApiModelProperty("断面名称")
    String sectionName;

    @ApiModelProperty("鱼类名称")
    String speciesName;

    @ApiModelProperty("卵苗数量")
    BigDecimal spawnCount;

    @ApiModelProperty("卵苗所占百分比")
    BigDecimal spawnPercentage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getSpawnCount() {
        return spawnCount;
    }

    public void setSpawnCount(BigDecimal spawnCount) {
        this.spawnCount = spawnCount;
    }

    public BigDecimal getSpawnPercentage() {
        return spawnPercentage;
    }

    public void setSpawnPercentage(BigDecimal spawnPercentage) {
        this.spawnPercentage = spawnPercentage;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
