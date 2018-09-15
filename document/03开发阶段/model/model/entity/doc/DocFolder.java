package com.rdc.kingsa.model.entity.doc;

import java.util.Date;

public class DocFolder {
    private String id;

    private String folderName;

    private String parentId;

    private Date createTime;

    private String creatorId;

    private String remarks;

    private String creatorDeptId;

    private String creatorName;

    private String creatorDeptName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName == null ? null : folderName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getCreatorDeptId() {
        return creatorDeptId;
    }

    public void setCreatorDeptId(String creatorDeptId) {
        this.creatorDeptId = creatorDeptId == null ? null : creatorDeptId.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getCreatorDeptName() {
        return creatorDeptName;
    }

    public void setCreatorDeptName(String creatorDeptName) {
        this.creatorDeptName = creatorDeptName == null ? null : creatorDeptName.trim();
    }
}