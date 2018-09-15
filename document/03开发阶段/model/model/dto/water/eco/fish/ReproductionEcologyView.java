package com.rdc.kingsa.model.dto.water.eco.fish;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("繁殖生态-保存")
public class ReproductionEcologyView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("断面名称")
	@NotNull(message = "断面名称不能为空")
	@Length(max = 25, message = "断面名称长度不能超过{max}")
	private String sectionName;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("卵苗数")
	@NotNull(message = "卵苗数不能为空")
	@Range(min = 0, max = 99999, message = "卵苗数必须在{min}与{max}之间")
	private Integer fryNumber;

	@ApiModelProperty("卵径流量")
	@NotNull(message = "卵径流量不能为空")
	@Range(min = 0, max = 99999, message = "卵径流量必须在{min}与{max}之间")
	private BigDecimal fryRunoff;

	@ApiModelProperty("水温")
	@NotNull(message = "水温不能为空")
	@Range(min = 0, max = 99999, message = "水温必须在{min}与{max}之间")
	private Double waterTemp;

	@ApiModelProperty("流量")
	@NotNull(message = "流量不能为空")
	@Range(min = 0, max = 9999999999L, message = "流量必须在{min}与{max}之间")
	private Long fryFlows;

	@ApiModelProperty("透明度")
	@NotNull(message = "透明度不能为空")
	@Range(min = 0, max = 99999, message = "透明度必须在{min}与{max}之间")
	private Integer transparency;

	@ApiModelProperty("溶氧")
	@NotNull(message = "溶氧不能为空")
	@Range(min = 0, max = 99999, message = "溶氧必须在{min}与{max}之间")
	private Double dissolveOxygen;

	@ApiModelProperty("备注")
	@Length(max = 25, message = "备注长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public Integer getFryNumber() {
		return fryNumber;
	}

	public void setFryNumber(Integer fryNumber) {
		this.fryNumber = fryNumber;
	}

	public BigDecimal getFryRunoff() {
		return fryRunoff;
	}

	public void setFryRunoff(BigDecimal fryRunoff) {
		this.fryRunoff = fryRunoff;
	}

	public Double getWaterTemp() {
		return waterTemp;
	}

	public void setWaterTemp(Double waterTemp) {
		this.waterTemp = waterTemp;
	}

	public Long getFryFlows() {
		return fryFlows;
	}

	public void setFryFlows(Long fryFlows) {
		this.fryFlows = fryFlows;
	}

	public Integer getTransparency() {
		return transparency;
	}

	public void setTransparency(Integer transparency) {
		this.transparency = transparency;
	}

	public Double getDissolveOxygen() {
		return dissolveOxygen;
	}

	public void setDissolveOxygen(Double dissolveOxygen) {
		this.dissolveOxygen = dissolveOxygen;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}