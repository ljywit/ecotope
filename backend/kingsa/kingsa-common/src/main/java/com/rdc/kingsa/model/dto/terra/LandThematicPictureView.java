package com.rdc.kingsa.model.dto.terra;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("土地专题图-保存")
public class LandThematicPictureView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("水电站ID")
	@NotNull(message = "水电站ID不能为空")
	private String sectionId;

	@ApiModelProperty("水电站名称")
	@NotNull(message = "水电站名称不能为空")
	@Length(max = 25, message = "水电站名称长度不能超过{max}")
	private String sectionName;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("图片名称")
	@Length(max = 25, message = "图片名称长度不能超过{max}")
	private String picName;

	@ApiModelProperty("图片级别")
	@NotNull(message = "图片级别不能为空")
	@Length(max = 12, message = "图片级别长度不能超过{max}")
	private String picLevel;

	@ApiModelProperty("图片URL")
	@NotNull(message = "图片URL不能为空")
	@Length(max = 100, message = "图片URL长度不能超过{max}")
	private String picUrl;

	@ApiModelProperty("上传者")
	@Length(max = 25, message = "上传者长度不能超过{max}")
	private String uploader;

	@ApiModelProperty("备注信息")
	@Length(max = 25, message = "备注信息长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getPicLevel() {
		return picLevel;
	}

	public void setPicLevel(String picLevel) {
		this.picLevel = picLevel;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}