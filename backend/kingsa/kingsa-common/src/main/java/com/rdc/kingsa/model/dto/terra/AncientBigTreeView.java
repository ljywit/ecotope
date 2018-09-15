package com.rdc.kingsa.model.dto.terra;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("古大树-保存")
public class AncientBigTreeView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("序号")
	@Range(min = 0, max = 9999999999L, message = "序号必须在{min}与{max}之间")
	private Long serialNumber;

	@ApiModelProperty("树种")
	@NotNull(message = "树种不能为空")
	@Length(max = 25, message = "树种长度不能超过{max}")
	private String treeSpecies;

	@ApiModelProperty("海拔高度（米）")
	@Range(min = 0, max = 99999, message = "海拔高度（米）必须在{min}与{max}之间")
	private Double altitude;

	@ApiModelProperty("所属县")
	@NotNull(message = "所属县不能为空")
	@Length(max = 25, message = "所属县长度不能超过{max}")
	private String county;

	@ApiModelProperty("乡镇")
	@Length(max = 25, message = "乡镇长度不能超过{max}")
	private String towns;

	@ApiModelProperty("具体地点")
	@Length(max = 25, message = "具体地点长度不能超过{max}")
	private String location;

	@ApiModelProperty("备注信息")
	@Length(max = 25, message = "备注信息长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getTreeSpecies() {
		return treeSpecies;
	}

	public void setTreeSpecies(String treeSpecies) {
		this.treeSpecies = treeSpecies;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTowns() {
		return towns;
	}

	public void setTowns(String towns) {
		this.towns = towns;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}