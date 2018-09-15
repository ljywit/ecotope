package com.rdc.kingsa.model.entity.authentication;

import java.util.Date;

public class Authority {
	
    private String id;

    private String authorityName;

    private String authorityInfo;

    private String authoritySymbol;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getAuthorityInfo() {
        return authorityInfo;
    }

    public void setAuthorityInfo(String authorityInfo) {
        this.authorityInfo = authorityInfo == null ? null : authorityInfo.trim();
    }

    public String getAuthoritySymbol() {
        return authoritySymbol;
    }

    public void setAuthoritySymbol(String authoritySymbol) {
        this.authoritySymbol = authoritySymbol == null ? null : authoritySymbol.trim();
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