package com.rdc.kingsa.model.entity.water.eco.fish;

import java.util.Date;

public class FishDirectories {
    private String id;

    private String bioOrder;

    private String family;

    private String subFamily;

    private String genus;

    private String speciesName;

    private Date createTime;

    private Date modifyTime;

    private String remarks;

    private Short emdemic;

    private Short economic;

    private String bioOrderLatin;

    private String familyLatin;

    private String subFamilyLatin;

    private String genusLatin;

    private String speciesLatin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBioOrder() {
        return bioOrder;
    }

    public void setBioOrder(String bioOrder) {
        this.bioOrder = bioOrder == null ? null : bioOrder.trim();
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family == null ? null : family.trim();
    }

    public String getSubFamily() {
        return subFamily;
    }

    public void setSubFamily(String subFamily) {
        this.subFamily = subFamily == null ? null : subFamily.trim();
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus == null ? null : genus.trim();
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName == null ? null : speciesName.trim();
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

    public Short getEmdemic() {
        return emdemic;
    }

    public void setEmdemic(Short emdemic) {
        this.emdemic = emdemic;
    }

    public Short getEconomic() {
        return economic;
    }

    public void setEconomic(Short economic) {
        this.economic = economic;
    }

    public String getBioOrderLatin() {
        return bioOrderLatin;
    }

    public void setBioOrderLatin(String bioOrderLatin) {
        this.bioOrderLatin = bioOrderLatin == null ? null : bioOrderLatin.trim();
    }

    public String getFamilyLatin() {
        return familyLatin;
    }

    public void setFamilyLatin(String familyLatin) {
        this.familyLatin = familyLatin == null ? null : familyLatin.trim();
    }

    public String getSubFamilyLatin() {
        return subFamilyLatin;
    }

    public void setSubFamilyLatin(String subFamilyLatin) {
        this.subFamilyLatin = subFamilyLatin == null ? null : subFamilyLatin.trim();
    }

    public String getGenusLatin() {
        return genusLatin;
    }

    public void setGenusLatin(String genusLatin) {
        this.genusLatin = genusLatin == null ? null : genusLatin.trim();
    }

    public String getSpeciesLatin() {
        return speciesLatin;
    }

    public void setSpeciesLatin(String speciesLatin) {
        this.speciesLatin = speciesLatin == null ? null : speciesLatin.trim();
    }
}