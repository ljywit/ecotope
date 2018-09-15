package com.rdc.kingsa.model.dto.terra;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("古大树生长情况-保存")
public class AncientTreeGrowthSituationView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("古大树ID")
	@NotNull(message = "古大树ID不能为空")
	private String treeId;

	@ApiModelProperty("图片编号")
	@Length(max = 50, message = "图片编号长度不能超过{max}")
	private String picIdentifier;

	@ApiModelProperty("图片链接")
	@Length(max = 100, message = "图片链接长度不能超过{max}")
	private String picUrl;

	@ApiModelProperty("生产情况")
	@NotNull(message = "生产情况不能为空")
	@Length(max = 25, message = "生产情况长度不能超过{max}")
	private String growthSituation;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("备注信息")
	@Length(max = 25, message = "备注信息长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTreeId() {
		return treeId;
	}

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

	public String getPicIdentifier() {
		return picIdentifier;
	}

	public void setPicIdentifier(String picIdentifier) {
		this.picIdentifier = picIdentifier;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getGrowthSituation() {
		return growthSituation;
	}

	public void setGrowthSituation(String growthSituation) {
		this.growthSituation = growthSituation;
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}