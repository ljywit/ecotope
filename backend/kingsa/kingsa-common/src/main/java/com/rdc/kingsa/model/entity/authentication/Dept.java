package com.rdc.kingsa.model.entity.authentication;

import java.util.Date;

public class Dept {
	
    private String id;

    private String parentId;

    private String deptName;

    private String deptAddress;

    private String deptContact;

    private String deptLeader;

    private String deptFunction;

    private String deptIntroduction;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress == null ? null : deptAddress.trim();
    }

    public String getDeptContact() {
        return deptContact;
    }

    public void setDeptContact(String deptContact) {
        this.deptContact = deptContact == null ? null : deptContact.trim();
    }

    public String getDeptLeader() {
        return deptLeader;
    }

    public void setDeptLeader(String deptLeader) {
        this.deptLeader = deptLeader == null ? null : deptLeader.trim();
    }

    public String getDeptFunction() {
        return deptFunction;
    }

    public void setDeptFunction(String deptFunction) {
        this.deptFunction = deptFunction == null ? null : deptFunction.trim();
    }

    public String getDeptIntroduction() {
        return deptIntroduction;
    }

    public void setDeptIntroduction(String deptIntroduction) {
        this.deptIntroduction = deptIntroduction == null ? null : deptIntroduction.trim();
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