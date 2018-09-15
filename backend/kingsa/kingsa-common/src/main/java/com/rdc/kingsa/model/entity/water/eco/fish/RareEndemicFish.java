package com.rdc.kingsa.model.entity.water.eco.fish;

import java.util.Date;

public class RareEndemicFish {

	private String id;

	private String bioOrder;

	private String family;

	private String subFamily;

	private String genus;

	private String speciesName;

	private Date createTime;

	private Date modifyTime;

	private String remarks;

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

}