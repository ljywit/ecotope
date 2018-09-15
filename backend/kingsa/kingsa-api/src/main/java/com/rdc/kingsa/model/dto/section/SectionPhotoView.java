package com.rdc.kingsa.model.dto.section;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("断面照片-保存")
public class SectionPhotoView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("拍摄时间")
	@NotNull(message = "拍摄时间不能为空")
	private Date photoTime;

	@ApiModelProperty("照片名称")
	@NotNull(message = "照片名称不能为空")
	@Length(max = 50, message = "照片名称长度不能超过{max}")
	private String picName;

	@ApiModelProperty("照片链接")
	@NotNull(message = "照片链接不能为空")
	@Length(max = 100, message = "照片链接长度不能超过{max}")
	private String picUrl;

	@ApiModelProperty("上传人")
	@NotNull(message = "上传人不能为空")
	@Length(max = 25, message = "上传人长度不能超过{max}")
	private String uploader;

	@ApiModelProperty("描述")
	@Length(max = 50, message = "描述长度不能超过{max}")
	private String description;

	@ApiModelProperty("备注")
	@Length(max = 25, message = "备注长度不能超过{max}")
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

	public Date getPhotoTime() {
		return photoTime;
	}

	public void setPhotoTime(Date photoTime) {
		this.photoTime = photoTime;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}