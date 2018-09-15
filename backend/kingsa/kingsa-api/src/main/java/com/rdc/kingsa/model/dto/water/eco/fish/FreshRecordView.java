package com.rdc.kingsa.model.dto.water.eco.fish;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("渔获记录-保存")
public class FreshRecordView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("渔获时间")
	@NotNull(message = "渔获时间不能为空")
	private Date catchTime;

	@ApiModelProperty("河段")
	@Length(max = 25, message = "河段长度不能超过{max}")
	private String riverLink;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("采样点")
	@NotNull(message = "采样点不能为空")
	private String samplingPoint;

	@ApiModelProperty("渔获类型")
	@NotNull(message = "渔获类型不能为空")
	private String fishingType;

	@ApiModelProperty("网具规格")
	@NotNull(message = "网具规格不能为空")
	private String nettingSpecification;

	@ApiModelProperty("渔获总重")
	@NotNull(message = "渔获总重不能为空")
	private Double catchTotal;

	@ApiModelProperty("渔获数量")
	@NotNull(message = "渔获数量不能为空")
	private Integer catchInNumber;

	@ApiModelProperty("备注")
	@Length(max = 25, message = "备注长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCatchTime() {
		return catchTime;
	}

	public void setCatchTime(Date catchTime) {
		this.catchTime = catchTime;
	}

	public String getRiverLink() {
		return riverLink;
	}

	public void setRiverLink(String riverLink) {
		this.riverLink = riverLink;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getSamplingPoint() {
		return samplingPoint;
	}

	public void setSamplingPoint(String samplingPoint) {
		this.samplingPoint = samplingPoint;
	}

	public String getFishingType() {
		return fishingType;
	}

	public void setFishingType(String fishingType) {
		this.fishingType = fishingType;
	}

	public String getNettingSpecification() {
		return nettingSpecification;
	}

	public void setNettingSpecification(String nettingSpecification) {
		this.nettingSpecification = nettingSpecification;
	}

	public Double getCatchTotal() {
		return catchTotal;
	}

	public void setCatchTotal(Double catchTotal) {
		this.catchTotal = catchTotal;
	}

	public Integer getCatchInNumber() {
		return catchInNumber;
	}

	public void setCatchInNumber(Integer catchInNumber) {
		this.catchInNumber = catchInNumber;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}