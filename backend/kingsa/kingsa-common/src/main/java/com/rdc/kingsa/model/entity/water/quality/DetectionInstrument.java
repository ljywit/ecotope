package com.rdc.kingsa.model.entity.water.quality;

import java.util.Date;

public class DetectionInstrument {
	
    private String id;

    private String source;

    private Short serialNum;

    private String detectItem;

    private String detectMethod;

    private String methodSource;
    
    private Date createTime;
    
    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Short getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Short serialNum) {
        this.serialNum = serialNum;
    }

    public String getDetectItem() {
        return detectItem;
    }

    public void setDetectItem(String detectItem) {
        this.detectItem = detectItem == null ? null : detectItem.trim();
    }

    public String getDetectMethod() {
        return detectMethod;
    }

    public void setDetectMethod(String detectMethod) {
        this.detectMethod = detectMethod == null ? null : detectMethod.trim();
    }

    public String getMethodSource() {
        return methodSource;
    }

    public void setMethodSource(String methodSource) {
        this.methodSource = methodSource == null ? null : methodSource.trim();
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