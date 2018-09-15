package com.rdc.kingsa.model.dto.water.eco.fish;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("珍稀特有鱼类-保存")
public class RareEndemicFishView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("目")
	@Length(max = 25, message = "目长度不能超过{max}")
	private String bioOrder;

	@ApiModelProperty("科")
	@Length(max = 25, message = "科长度不能超过{max}")
	private String family;

	@ApiModelProperty("亚科")
	@Length(max = 25, message = "亚科长度不能超过{max}")
	private String subFamily;

	@ApiModelProperty("属")
	@Length(max = 25, message = "属长度不能超过{max}")
	private String genus;

	@ApiModelProperty("种")
	@NotNull(message = "种不能为空")
	@Length(max = 25, message = "种长度不能超过{max}")
	private String speciesName;

	@ApiModelProperty("备注")
	@Length(max = 25, message = "备注长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBioOrder() {
		return bioOrder;
	}

	public void setBioOrder(String bioOrder) {
		this.bioOrder = bioOrder;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getSubFamily() {
		return subFamily;
	}

	public void setSubFamily(String subFamily) {
		this.subFamily = subFamily;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}