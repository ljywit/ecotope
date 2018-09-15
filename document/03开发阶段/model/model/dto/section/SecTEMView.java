package com.rdc.kingsa.model.dto.section;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@ApiModel("断面陆生生态-保存")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecTEMView extends SectionView {

    @ApiModelProperty("断面ID")
    private String sectionId;

    @ApiModelProperty("所属电站")
    @NotNull(message = "所属电站不能为空")
    @Length(min = 0, max = 30, message = "所属电站不能超过{max}")
    private String powerStation;

    @ApiModelProperty("样线类型")
    @NotNull(message = "样线类型不能为空")
    @Length(min = 0, max = 30, message = "样线类型不能超过{max}")
    private String sampLineType;

    @ApiModelProperty("样方数量")
    @NotNull(message = "样方数量不能为空")
    @Length(min = 0, max = 30, message = "样线类型不能超过{max}")
    private String sampNumber;

    @ApiModelProperty("备注信息")
    @Length(min = 0, max = 30, message = "备注信息不能超过{max}")
    private String remarks;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getPowerStation() {
        return powerStation;
    }

    public void setPowerStation(String powerStation) {
        this.powerStation = powerStation == null ? null : powerStation.trim();
    }

    public String getSampLineType() {
        return sampLineType;
    }

    public void setSampLineType(String sampLineType) {
        this.sampLineType = sampLineType == null ? null : sampLineType.trim();
    }

    public String getSampNumber() {
        return sampNumber;
    }

    public void setSampNumber(String sampNumber) {
        this.sampNumber = sampNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

}