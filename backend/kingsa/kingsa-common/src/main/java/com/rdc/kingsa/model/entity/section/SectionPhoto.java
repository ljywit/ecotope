package com.rdc.kingsa.model.entity.section;

import java.util.Date;

public class SectionPhoto {
	
	private String id;

	private String sectionId;

	private Date photoTime;

	private String picName;

	private String picUrl;

	private String uploader;

	private String description;

	private Date createTime;

	private Date modifyTime;

	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId == null ? null : sectionId.trim();
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
		this.picName = picName == null ? null : picName.trim();
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl == null ? null : picUrl.trim();
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader == null ? null : uploader.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}
	
}