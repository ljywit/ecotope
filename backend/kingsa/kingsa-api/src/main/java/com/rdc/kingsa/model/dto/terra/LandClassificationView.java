package com.rdc.kingsa.model.dto.terra;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("土地分类体系-保存")
public class LandClassificationView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("一级编号")
	@NotNull(message = "一级编号不能为空")
	@Length(max = 12, message = "一级编号长度不能超过{max}")
	private String primaryIdentifier;

	@ApiModelProperty("一级名称")
	@NotNull(message = "一级名称不能为空")
	@Length(max = 25, message = "一级名称长度不能超过{max}")
	private String primaryName;

	@ApiModelProperty("二级编号")
	@NotNull(message = "二级编号不能为空")
	@Length(max = 12, message = "二级编号长度不能超过{max}")
	private String secondaryIdentifier;

	@ApiModelProperty("二级名称")
	@NotNull(message = "二级名称不能为空")
	@Length(max = 25, message = "二级名称长度不能超过{max}")
	private String secondaryName;

	@ApiModelProperty("二级含义")
	@NotNull(message = "二级含义不能为空")
	@Length(max = 75, message = "二级含义长度不能超过{max}")
	private String secondaryMeanings;

	@ApiModelProperty("备注信息")
	@Length(max = 25, message = "备注信息长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrimaryIdentifier() {
		return primaryIdentifier;
	}

	public void setPrimaryIdentifier(String primaryIdentifier) {
		this.primaryIdentifier = primaryIdentifier;
	}

	public String getPrimaryName() {
		return primaryName;
	}

	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}

	public String getSecondaryIdentifier() {
		return secondaryIdentifier;
	}

	public void setSecondaryIdentifier(String secondaryIdentifier) {
		this.secondaryIdentifier = secondaryIdentifier;
	}

	public String getSecondaryName() {
		return secondaryName;
	}

	public void setSecondaryName(String secondaryName) {
		this.secondaryName = secondaryName;
	}

	public String getSecondaryMeanings() {
		return secondaryMeanings;
	}

	public void setSecondaryMeanings(String secondaryMeanings) {
		this.secondaryMeanings = secondaryMeanings;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}