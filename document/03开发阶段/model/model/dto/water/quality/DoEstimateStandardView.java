package com.rdc.kingsa.model.dto.water.quality;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("排污口评价标准-保存")
public class DoEstimateStandardView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("序号")
	@NotNull(message = "序号不能为空")
	@Range(min = 0, max = 99, message = "序号必须在{min}与{max}之间")
	private Short serialNum;

	@ApiModelProperty("评价项目")
	@NotNull(message = "评价项目不能为空")
	@Length(min = 0, max = 25, message = "评价项目不能超过{max}")
	private String evaluateItem;

	@ApiModelProperty("I类上限")
	@NotNull(message = "I类上限不能为空")
	@Range(min = 0, max = 99999, message = "I类上限必须在{min}与{max}之间")
	private Double typeIUl;

	@ApiModelProperty("I类上限区间开闭")
	@NotNull(message = "I类上限区间开闭不能为空")
	@Range(min = 0, max = 1, message = "I类上线区间开闭必须在{min}与{max}之间")
	private Short typeIUlSoc;

	@ApiModelProperty("I类下限")
	@NotNull(message = "I类下限不能为空")
	@Range(min = 0, max = 99999, message = "I类下限必须在{min}与{max}之间")
	private Double typeILl;

	@ApiModelProperty("I类下限区间开闭")
	@NotNull(message = "I类下限区间开闭不能为空")
	@Range(min = 0, max = 1, message = "I类下限区间开闭必须在{min}与{max}之间")
	private Short typeILlSoc;

	@ApiModelProperty("II类上限")
	@NotNull(message = "II类上限不能为空")
	@Range(min = 0, max = 99999, message = "II类上限必须在{min}与{max}之间")
	private Double typeIiUl;

	@ApiModelProperty("II类上线区间开闭")
	@NotNull(message = "II类上限区间开闭不能为空")
	@Range(min = 0, max = 1, message = "II类上线区间开闭必须在{min}与{max}之间")
	private Short typeIiUlSoc;

	@ApiModelProperty("II类下限")
	@NotNull(message = "II类下限不能为空")
	@Range(min = 0, max = 99999, message = "II类下限必须在{min}与{max}之间")
	private Double typeIiLl;

	@ApiModelProperty("II类下限区间开闭")
	@NotNull(message = "II类下限区间开闭不能为空")
	@Range(min = 0, max = 1, message = "II类下限区间开闭必须在{min}与{max}之间")
	private Short typeIiLlSoc;

	@ApiModelProperty("III类上限")
	@NotNull(message = "III类上限不能为空")
	@Range(min = 0, max = 99999, message = "III类上限必须在{min}与{max}之间")
	private Double typeIiiUl;

	@ApiModelProperty("III类上限区间开闭")
	@NotNull(message = "III类上限区间开闭不能为空")
	@Range(min = 0, max = 1, message = "III类上限区间开闭必须在{min}与{max}之间")
	private Short typeIiiUlSoc;

	@ApiModelProperty("III类下限")
	@NotNull(message = "III类下限不能为空")
	@Range(min = 0, max = 99999, message = "III类下限必须在{min}与{max}之间")
	private Double typeIiiLl;

	@ApiModelProperty("III类下限区间开闭")
	@NotNull(message = "III类下限区间开闭不能为空")
	@Range(min = 0, max = 1, message = "III类下限区间开闭必须在{min}与{max}之间")
	private Short typeIiiLlSoc;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

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

	public String getEvaluateItem() {
		return evaluateItem;
	}

	public void setEvaluateItem(String evaluateItem) {
		this.evaluateItem = evaluateItem == null ? null : evaluateItem.trim();
	}

	public Double getTypeIUl() {
		return typeIUl;
	}

	public void setTypeIUl(Double typeIUl) {
		this.typeIUl = typeIUl;
	}

	public Short getTypeIUlSoc() {
		return typeIUlSoc;
	}

	public void setTypeIUlSoc(Short typeIUlSoc) {
		this.typeIUlSoc = typeIUlSoc;
	}

	public Double getTypeILl() {
		return typeILl;
	}

	public void setTypeILl(Double typeILl) {
		this.typeILl = typeILl;
	}

	public Short getTypeILlSoc() {
		return typeILlSoc;
	}

	public void setTypeILlSoc(Short typeILlSoc) {
		this.typeILlSoc = typeILlSoc;
	}

	public Double getTypeIiUl() {
		return typeIiUl;
	}

	public void setTypeIiUl(Double typeIiUl) {
		this.typeIiUl = typeIiUl;
	}

	public Short getTypeIiUlSoc() {
		return typeIiUlSoc;
	}

	public void setTypeIiUlSoc(Short typeIiUlSoc) {
		this.typeIiUlSoc = typeIiUlSoc;
	}

	public Double getTypeIiLl() {
		return typeIiLl;
	}

	public void setTypeIiLl(Double typeIiLl) {
		this.typeIiLl = typeIiLl;
	}

	public Short getTypeIiLlSoc() {
		return typeIiLlSoc;
	}

	public void setTypeIiLlSoc(Short typeIiLlSoc) {
		this.typeIiLlSoc = typeIiLlSoc;
	}

	public Double getTypeIiiUl() {
		return typeIiiUl;
	}

	public void setTypeIiiUl(Double typeIiiUl) {
		this.typeIiiUl = typeIiiUl;
	}

	public Short getTypeIiiUlSoc() {
		return typeIiiUlSoc;
	}

	public void setTypeIiiUlSoc(Short typeIiiUlSoc) {
		this.typeIiiUlSoc = typeIiiUlSoc;
	}

	public Double getTypeIiiLl() {
		return typeIiiLl;
	}

	public void setTypeIiiLl(Double typeIiiLl) {
		this.typeIiiLl = typeIiiLl;
	}

	public Short getTypeIiiLlSoc() {
		return typeIiiLlSoc;
	}

	public void setTypeIiiLlSoc(Short typeIiiLlSoc) {
		this.typeIiiLlSoc = typeIiiLlSoc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}