package com.rdc.kingsa.model.po.section;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lxf on 18/8/24.
 */
public class BaseSection {
    private String id;

    private BigDecimal serialNum;

    private String sectionId;

    private String sectionName;

    private Short riverType;

    private String location;

    private String belongRiver;

    private Double longitude;

    private Double latitude;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(BigDecimal serialNum) {
        this.serialNum = serialNum;
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
        this.remarks = remarks;
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

    public Short getRiverType() {
        return riverType;
    }

    public void setRiverType(Short riverType) {
        this.riverType = riverType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBelongRiver() {
        return belongRiver;
    }

    public void setBelongRiver(String belongRiver) {
        this.belongRiver = belongRiver;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
