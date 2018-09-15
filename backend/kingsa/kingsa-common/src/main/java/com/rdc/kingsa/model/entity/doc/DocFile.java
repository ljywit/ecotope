package com.rdc.kingsa.model.entity.doc;

import java.util.Date;

public class DocFile {
    private String id;

    private String fileName;

    private String url;

    private String uploaderId;

    private Date uploadTime;

    private String remarks;

    private Date modifyTime;

    private String uploadDeptId;

    private String uploaderName;

    private String uploadDeptName;

    private String extensionName;

    private String filePinyin;

    private String filePy;

    private String folderId;

    private String uploaderPinyin;

    private String uploaderPy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(String uploaderId) {
        this.uploaderId = uploaderId == null ? null : uploaderId.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getUploadDeptId() {
        return uploadDeptId;
    }

    public void setUploadDeptId(String uploadDeptId) {
        this.uploadDeptId = uploadDeptId == null ? null : uploadDeptId.trim();
    }

    public String getUploaderName() {
        return uploaderName;
    }

    public void setUploaderName(String uploaderName) {
        this.uploaderName = uploaderName == null ? null : uploaderName.trim();
    }

    public String getUploadDeptName() {
        return uploadDeptName;
    }

    public void setUploadDeptName(String uploadDeptName) {
        this.uploadDeptName = uploadDeptName == null ? null : uploadDeptName.trim();
    }

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName == null ? null : extensionName.trim();
    }

    public String getFilePinyin() {
        return filePinyin;
    }

    public void setFilePinyin(String filePinyin) {
        this.filePinyin = filePinyin == null ? null : filePinyin.trim();
    }

    public String getFilePy() {
        return filePy;
    }

    public void setFilePy(String filePy) {
        this.filePy = filePy == null ? null : filePy.trim();
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId == null ? null : folderId.trim();
    }

    public String getUploaderPinyin() {
        return uploaderPinyin;
    }

    public void setUploaderPinyin(String uploaderPinyin) {
        this.uploaderPinyin = uploaderPinyin == null ? null : uploaderPinyin.trim();
    }

    public String getUploaderPy() {
        return uploaderPy;
    }

    public void setUploaderPy(String uploaderPy) {
        this.uploaderPy = uploaderPy == null ? null : uploaderPy.trim();
    }
}