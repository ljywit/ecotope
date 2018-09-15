package com.rdc.kingsa.model.entity.terra;

import java.util.Date;

public class PlantComposition {
	
    private String id;

    private String region;

    private Date monitorTime;

    private Long vascularFamily;

    private Long vascularGenus;

    private Long vascularSpecies;

    private Long fernFamily;

    private Long fernGenus;

    private Long fernSpecies;

    private Long gymnospermFamily;

    private Long gymnospermGenus;

    private Long gymnospermSpecies;

    private Long angiospermFamily;

    private Long angiospermGenus;

    private Long angiospermSpecies;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Long getVascularFamily() {
        return vascularFamily;
    }

    public void setVascularFamily(Long vascularFamily) {
        this.vascularFamily = vascularFamily;
    }

    public Long getVascularGenus() {
        return vascularGenus;
    }

    public void setVascularGenus(Long vascularGenus) {
        this.vascularGenus = vascularGenus;
    }

    public Long getVascularSpecies() {
        return vascularSpecies;
    }

    public void setVascularSpecies(Long vascularSpecies) {
        this.vascularSpecies = vascularSpecies;
    }

    public Long getFernFamily() {
        return fernFamily;
    }

    public void setFernFamily(Long fernFamily) {
        this.fernFamily = fernFamily;
    }

    public Long getFernGenus() {
        return fernGenus;
    }

    public void setFernGenus(Long fernGenus) {
        this.fernGenus = fernGenus;
    }

    public Long getFernSpecies() {
        return fernSpecies;
    }

    public void setFernSpecies(Long fernSpecies) {
        this.fernSpecies = fernSpecies;
    }

    public Long getGymnospermFamily() {
        return gymnospermFamily;
    }

    public void setGymnospermFamily(Long gymnospermFamily) {
        this.gymnospermFamily = gymnospermFamily;
    }

    public Long getGymnospermGenus() {
        return gymnospermGenus;
    }

    public void setGymnospermGenus(Long gymnospermGenus) {
        this.gymnospermGenus = gymnospermGenus;
    }

    public Long getGymnospermSpecies() {
        return gymnospermSpecies;
    }

    public void setGymnospermSpecies(Long gymnospermSpecies) {
        this.gymnospermSpecies = gymnospermSpecies;
    }

    public Long getAngiospermFamily() {
        return angiospermFamily;
    }

    public void setAngiospermFamily(Long angiospermFamily) {
        this.angiospermFamily = angiospermFamily;
    }

    public Long getAngiospermGenus() {
        return angiospermGenus;
    }

    public void setAngiospermGenus(Long angiospermGenus) {
        this.angiospermGenus = angiospermGenus;
    }

    public Long getAngiospermSpecies() {
        return angiospermSpecies;
    }

    public void setAngiospermSpecies(Long angiospermSpecies) {
        this.angiospermSpecies = angiospermSpecies;
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