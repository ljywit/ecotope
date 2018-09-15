package com.rdc.kingsa.model.dto.water.quality;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("排污口水质评价信息-保存")
public class DrainOutletEstimateView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String secId;

	@ApiModelProperty("水质信息ID")
	@NotNull(message = "水质信息ID不能为空")
	private String qaId;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("评价方法")
	@NotNull(message = "评价方法不能为空")
	@Length(min = 0, max = 12, message = "评价方法不能超过{max}")
	private String evaluationMethod;

	@ApiModelProperty("PH类型")
	@NotNull(message = "PH类型不能为空")
	@Range(min = 1, max = 5, message = "PH类型必须在{min}与{max}之间")
	private Short phT;

	@ApiModelProperty("化学需氧量类别")
	@NotNull(message = "化学需氧量不能为空")
	@Range(min = 1, max = 5, message = "化学需氧量必须在{min}与{max}之间")
	private Short oxDemandT;

	@ApiModelProperty("五日生化需氧量类别")
	@NotNull(message = "五日生化需氧量不能为空")
	@Range(min = 1, max = 5, message = "五日生化需氧量必须在{min}与{max}之间")
	private Short boDemandT;

	@ApiModelProperty("氨氮类别")
	@NotNull(message = "氨氮类别不能为空")
	@Range(min = 1, max = 5, message = "氨氮类别必须在{min}与{max}之间")
	private Short ammoniaT;

	@ApiModelProperty("总磷类别")
	@NotNull(message = "总磷类别不能为空")
	@Range(min = 1, max = 5, message = "总磷类别必须在{min}与{max}之间")
	private Short phosphorusT;

	@ApiModelProperty("硫化物类别")
	@NotNull(message = "硫化物类别不能为空")
	@Range(min = 1, max = 5, message = "硫化物类别必须在{min}与{max}之间")
	private Short sulfideT;

	@ApiModelProperty("氰化物类别")
	@NotNull(message = "氰化物类别不能为空")
	@Range(min = 1, max = 5, message = "氰化物类别必须在{min}与{max}之间")
	private Short cyanideT;

	@ApiModelProperty("氟化物类别")
	@NotNull(message = "氟化物类别不能为空")
	@Range(min = 1, max = 5, message = "氟化物类别必须在{min}与{max}之间")
	private Short fluorideT;

	@ApiModelProperty("挥发酚类别")
	@NotNull(message = "挥发酚类别不能为空")
	@Range(min = 1, max = 5, message = "挥发酚类别必须在{min}与{max}之间")
	private Short phenolT;

	@ApiModelProperty("石油类类别")
	@NotNull(message = "石油类类别不能为空")
	@Range(min = 1, max = 5, message = "石油类类别必须在{min}与{max}之间")
	private Short petroleumT;

	@ApiModelProperty("阴离子表面活性剂类别")
	@NotNull(message = "阴离子表面活性剂类别不能为空")
	@Range(min = 1, max = 5, message = "阴离子表面活性剂类别必须在{min}与{max}之间")
	private Short surfactantT;

	@ApiModelProperty("铜类别")
	@NotNull(message = "铜类别不能为空")
	@Range(min = 1, max = 5, message = "铜类别必须在{min}与{max}之间")
	private Short copperT;

	@ApiModelProperty("锌类别")
	@NotNull(message = "锌类别不能为空")
	@Range(min = 1, max = 5, message = "锌类别必须在{min}与{max}之间")
	private Short zincT;

	@ApiModelProperty("砷类别")
	@NotNull(message = "砷类别不能为空")
	@Range(min = 1, max = 5, message = "砷类别必须在{min}与{max}之间")
	private Short arsenicT;

	@ApiModelProperty("汞类别")
	@NotNull(message = "汞类别不能为空")
	@Range(min = 1, max = 5, message = "汞类别必须在{min}与{max}之间")
	private Short mercuryT;

	@ApiModelProperty("镉类别")
	@NotNull(message = "镉类别不能为空")
	@Range(min = 1, max = 5, message = "镉类别必须在{min}与{max}之间")
	private Short cadmiumT;

	@ApiModelProperty("六价铬类别")
	@NotNull(message = "六价铬类别不能为空")
	@Range(min = 1, max = 5, message = "六价铬类别必须在{min}与{max}之间")
	private Short chromiumT;

	@ApiModelProperty("铅类别")
	@NotNull(message = "铅类别不能为空")
	@Range(min = 1, max = 5, message = "铅类别必须在{min}与{max}之间")
	private Short leadT;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSecId() {
		return secId;
	}

	public void setSecId(String secId) {
		this.secId = secId == null ? null : secId.trim();
	}

	public String getQaId() {
		return qaId;
	}

	public void setQaId(String qaId) {
		this.qaId = qaId == null ? null : qaId.trim();
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public String getEvaluationMethod() {
		return evaluationMethod;
	}

	public void setEvaluationMethod(String evaluationMethod) {
		this.evaluationMethod = evaluationMethod == null ? null : evaluationMethod.trim();
	}

	public Short getPhT() {
		return phT;
	}

	public void setPhT(Short phT) {
		this.phT = phT;
	}

	public Short getOxDemandT() {
		return oxDemandT;
	}

	public void setOxDemandT(Short oxDemandT) {
		this.oxDemandT = oxDemandT;
	}

	public Short getBoDemandT() {
		return boDemandT;
	}

	public void setBoDemandT(Short boDemandT) {
		this.boDemandT = boDemandT;
	}

	public Short getAmmoniaT() {
		return ammoniaT;
	}

	public void setAmmoniaT(Short ammoniaT) {
		this.ammoniaT = ammoniaT;
	}

	public Short getPhosphorusT() {
		return phosphorusT;
	}

	public void setPhosphorusT(Short phosphorusT) {
		this.phosphorusT = phosphorusT;
	}

	public Short getSulfideT() {
		return sulfideT;
	}

	public void setSulfideT(Short sulfideT) {
		this.sulfideT = sulfideT;
	}

	public Short getCyanideT() {
		return cyanideT;
	}

	public void setCyanideT(Short cyanideT) {
		this.cyanideT = cyanideT;
	}

	public Short getFluorideT() {
		return fluorideT;
	}

	public void setFluorideT(Short fluorideT) {
		this.fluorideT = fluorideT;
	}

	public Short getPhenolT() {
		return phenolT;
	}

	public void setPhenolT(Short phenolT) {
		this.phenolT = phenolT;
	}

	public Short getPetroleumT() {
		return petroleumT;
	}

	public void setPetroleumT(Short petroleumT) {
		this.petroleumT = petroleumT;
	}

	public Short getSurfactantT() {
		return surfactantT;
	}

	public void setSurfactantT(Short surfactantT) {
		this.surfactantT = surfactantT;
	}

	public Short getCopperT() {
		return copperT;
	}

	public void setCopperT(Short copperT) {
		this.copperT = copperT;
	}

	public Short getZincT() {
		return zincT;
	}

	public void setZincT(Short zincT) {
		this.zincT = zincT;
	}

	public Short getArsenicT() {
		return arsenicT;
	}

	public void setArsenicT(Short arsenicT) {
		this.arsenicT = arsenicT;
	}

	public Short getMercuryT() {
		return mercuryT;
	}

	public void setMercuryT(Short mercuryT) {
		this.mercuryT = mercuryT;
	}

	public Short getCadmiumT() {
		return cadmiumT;
	}

	public void setCadmiumT(Short cadmiumT) {
		this.cadmiumT = cadmiumT;
	}

	public Short getChromiumT() {
		return chromiumT;
	}

	public void setChromiumT(Short chromiumT) {
		this.chromiumT = chromiumT;
	}

	public Short getLeadT() {
		return leadT;
	}

	public void setLeadT(Short leadT) {
		this.leadT = leadT;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}