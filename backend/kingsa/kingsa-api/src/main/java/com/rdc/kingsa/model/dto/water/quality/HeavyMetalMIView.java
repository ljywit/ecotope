package com.rdc.kingsa.model.dto.water.quality;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("填报底泥重金属监测信息-保存")
public class HeavyMetalMIView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String secId;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("有机质")
	@NotNull(message = "有机质不能为空")
	@Range(min = 0, max = 99999, message = "有机质必须在{min}与{max}之间")
	private Double organic;

	@ApiModelProperty("有机质符号")
	@NotNull(message = "有机质符号不能为空")
	@Length(min = 0, max = 2, message = "有机质符号不能超过{max}")
	private String organicSy;

	@ApiModelProperty("镉")
	@NotNull(message = "镉不能为空")
	@Range(min = 0, max = 99999, message = "镉必须在{min}与{max}之间")
	private Double cadmium;

	@ApiModelProperty("镉符号")
	@NotNull(message = "镉符号不能为空")
	@Length(min = 0, max = 2, message = "镉符号不能超过{max}")
	private String cadmiumSy;

	@ApiModelProperty("汞")
	@NotNull(message = "汞不能为空")
	@Range(min = 0, max = 99999, message = "汞必须在{min}与{max}之间")
	private Double mercury;

	@ApiModelProperty("汞符号")
	@NotNull(message = "汞符号不能为空")
	@Length(min = 0, max = 2, message = "汞符号不能超过{max}")
	private String mercurySy;

	@ApiModelProperty("砷")
	@NotNull(message = "砷不能为空")
	@Range(min = 0, max = 99999, message = "砷必须在{min}与{max}之间")
	private Double arsenic;

	@ApiModelProperty("砷符号")
	@NotNull(message = "砷符号不能为空")
	@Length(min = 0, max = 2, message = "砷符号不能超过{max}")
	private String arsenicSy;

	@ApiModelProperty("铜")
	@NotNull(message = "铜不能为空")
	@Range(min = 0, max = 99999, message = "铜必须在{min}与{max}之间")
	private Double copper;

	@ApiModelProperty("铜符号")
	@NotNull(message = "铜符号不能为空")
	@Length(min = 0, max = 2, message = "铜符号不能超过{max}")
	private String copperSy;

	@ApiModelProperty("铅")
	@NotNull(message = "铅不能为空")
	@Range(min = 0, max = 99999, message = "铅必须在{min}与{max}之间")
	private Double lead;

	@ApiModelProperty("铅符号")
	@NotNull(message = "铅符号不能为空")
	@Length(min = 0, max = 2, message = "铅符号不能超过{max}")
	private String leadSy;

	@ApiModelProperty("铬")
	@NotNull(message = "铬不能为空")
	@Range(min = 0, max = 99999, message = "铬必须在{min}与{max}之间")
	private Double chromium;

	@ApiModelProperty("铬符号")
	@NotNull(message = "铬符号不能为空")
	@Length(min = 0, max = 2, message = "铬符号不能超过{max}")
	private String chromiumSy;

	@ApiModelProperty("锌")
	@NotNull(message = "锌不能为空")
	@Range(min = 0, max = 99999, message = "锌必须在{min}与{max}之间")
	private Double zinc;

	@ApiModelProperty("锌符号")
	@NotNull(message = "锌符号不能为空")
	@Length(min = 0, max = 2, message = "锌符号不能超过{max}")
	private String zincSy;

	@ApiModelProperty("镍")
	@NotNull(message = "镍不能为空")
	@Range(min = 0, max = 99999, message = "镍必须在{min}与{max}之间")
	private Double nickel;

	@ApiModelProperty("镍符号")
	@NotNull(message = "镍符号不能为空")
	@Length(min = 0, max = 2, message = "镍符号不能超过{max}")
	private String nickelSy;

	@ApiModelProperty("监测单位")
	@NotNull(message = "监测单位不能为空")
	@Length(min = 0, max = 12, message = "监测单位不能超过{max}")
	private String monUnit;

	@ApiModelProperty("检测者")
	@NotNull(message = "检测者不能为空")
	@Length(min = 0, max = 12, message = "检测者不能超过{max}")
	private String monitor;

	@ApiModelProperty("录入者")
	@NotNull(message = "录入者不能为空")
	@Length(min = 0, max = 12, message = "录入者不能超过{max}")
	private String inputer;

	@ApiModelProperty("审核者")
	@NotNull(message = "审核者不能为空")
	@Length(min = 0, max = 12, message = "审核者不能超过{max}")
	private String auditor;

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

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public Double getOrganic() {
		return organic;
	}

	public void setOrganic(Double organic) {
		this.organic = organic;
	}

	public String getOrganicSy() {
		return organicSy;
	}

	public void setOrganicSy(String organicSy) {
		this.organicSy = organicSy == null ? null : organicSy.trim();
	}

	public Double getCadmium() {
		return cadmium;
	}

	public void setCadmium(Double cadmium) {
		this.cadmium = cadmium;
	}

	public String getCadmiumSy() {
		return cadmiumSy;
	}

	public void setCadmiumSy(String cadmiumSy) {
		this.cadmiumSy = cadmiumSy == null ? null : cadmiumSy.trim();
	}

	public Double getMercury() {
		return mercury;
	}

	public void setMercury(Double mercury) {
		this.mercury = mercury;
	}

	public String getMercurySy() {
		return mercurySy;
	}

	public void setMercurySy(String mercurySy) {
		this.mercurySy = mercurySy == null ? null : mercurySy.trim();
	}

	public Double getArsenic() {
		return arsenic;
	}

	public void setArsenic(Double arsenic) {
		this.arsenic = arsenic;
	}

	public String getArsenicSy() {
		return arsenicSy;
	}

	public void setArsenicSy(String arsenicSy) {
		this.arsenicSy = arsenicSy == null ? null : arsenicSy.trim();
	}

	public Double getCopper() {
		return copper;
	}

	public void setCopper(Double copper) {
		this.copper = copper;
	}

	public String getCopperSy() {
		return copperSy;
	}

	public void setCopperSy(String copperSy) {
		this.copperSy = copperSy == null ? null : copperSy.trim();
	}

	public Double getLead() {
		return lead;
	}

	public void setLead(Double lead) {
		this.lead = lead;
	}

	public String getLeadSy() {
		return leadSy;
	}

	public void setLeadSy(String leadSy) {
		this.leadSy = leadSy == null ? null : leadSy.trim();
	}

	public Double getChromium() {
		return chromium;
	}

	public void setChromium(Double chromium) {
		this.chromium = chromium;
	}

	public String getChromiumSy() {
		return chromiumSy;
	}

	public void setChromiumSy(String chromiumSy) {
		this.chromiumSy = chromiumSy == null ? null : chromiumSy.trim();
	}

	public Double getZinc() {
		return zinc;
	}

	public void setZinc(Double zinc) {
		this.zinc = zinc;
	}

	public String getZincSy() {
		return zincSy;
	}

	public void setZincSy(String zincSy) {
		this.zincSy = zincSy == null ? null : zincSy.trim();
	}

	public Double getNickel() {
		return nickel;
	}

	public void setNickel(Double nickel) {
		this.nickel = nickel;
	}

	public String getNickelSy() {
		return nickelSy;
	}

	public void setNickelSy(String nickelSy) {
		this.nickelSy = nickelSy == null ? null : nickelSy.trim();
	}

	public String getMonUnit() {
		return monUnit;
	}

	public void setMonUnit(String monUnit) {
		this.monUnit = monUnit == null ? null : monUnit.trim();
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor == null ? null : monitor.trim();
	}

	public String getInputer() {
		return inputer;
	}

	public void setInputer(String inputer) {
		this.inputer = inputer == null ? null : inputer.trim();
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor == null ? null : auditor.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}