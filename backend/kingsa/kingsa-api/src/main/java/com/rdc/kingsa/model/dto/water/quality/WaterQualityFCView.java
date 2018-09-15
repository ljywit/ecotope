package com.rdc.kingsa.model.dto.water.quality;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("填报水质监测信息-保存")
public class WaterQualityFCView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String secId;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("水温")
	@NotNull(message = "水温不能为空")
	@Range(min = -256, max = 99999, message = "水温必须在{min}与{max}之间")
	private Double waterTemp;

	@ApiModelProperty("水温符号")
	@NotNull(message = "水温符号不能为空")
	@Length(min = 0, max = 2, message = "符号不能超过{max}")
	private String waterTempSy;

	@ApiModelProperty("ph值")
	@NotNull(message = "ph值不能为空")
	@Range(min = 0, max = 14, message = "ph值必须在{min}与{max}之间")
	private Double phValue;

	@ApiModelProperty("ph值符号")
	@NotNull(message = "ph值符号不能为空")
	@Length(min = 0, max = 2, message = "符号不能超过{max}")
	private String phValueSy;

	@ApiModelProperty("溶解氧")
	@NotNull(message = "溶解氧不能为空")
	@Range(min = 0, max = 99999, message = "溶解氧必须在{min}与{max}之间")
	private Double disOxygen;

	@ApiModelProperty("溶解氧符号")
	@NotNull(message = "溶解氧符号不能为空")
	@Length(min = 0, max = 2, message = "符号不能超过{max}")
	private String disOxygenSy;

	@ApiModelProperty("高锰酸盐指数")
	@NotNull(message = "高锰酸盐指数不能为空")
	@Range(min = 0, max = 99999, message = "高锰酸盐指数必须在{min}与{max}之间")
	private Double permanganate;

	@ApiModelProperty("高锰酸盐指数符号")
	@NotNull(message = "高锰酸盐指数符号不能为空")
	@Length(min = 0, max = 2, message = "高锰酸盐指数符号不能超过{max}")
	private String permanganateSy;

	@ApiModelProperty("化学需氧量")
	@NotNull(message = "化学需氧量不能为空")
	@Range(min = 0, max = 99999, message = "化学需氧量必须在{min}与{max}之间")
	private Double oxDemand;

	@ApiModelProperty("化学需氧量符号")
	@NotNull(message = "化学需氧量符号不能为空")
	@Length(min = 0, max = 2, message = "化学需氧量符号不能超过{max}")
	private String oxDemandSy;

	@ApiModelProperty("五日生化需氧量")
	@NotNull(message = "五日生化需氧量不能为空")
	@Range(min = 0, max = 99999, message = "五日生化需氧量必须在{min}与{max}之间")
	private Double boDemand;

	@ApiModelProperty("五日生化需氧量符号")
	@NotNull(message = "五日生化需氧量符号不能为空")
	@Length(min = 0, max = 2, message = "五日生化需氧量符号不能超过{max}")
	private String boDemandSy;

	@ApiModelProperty("氨氮")
	@NotNull(message = "氨氮不能为空")
	@Range(min = 0, max = 99999, message = "氨氮必须在{min}与{max}之间")
	private Double ammonia;

	@ApiModelProperty("氨氮符号")
	@NotNull(message = "氨氮符号不能为空")
	@Length(min = 0, max = 2, message = "氨氮符号不能超过{max}")
	private String ammoniaSy;

	@ApiModelProperty("总磷")
	@NotNull(message = "总磷不能为空")
	@Range(min = 0, max = 99999, message = "总磷必须在{min}与{max}之间")
	private Double phosphorus;

	@ApiModelProperty("总磷符号")
	@NotNull(message = "总磷符号不能为空")
	@Length(min = 0, max = 2, message = "总磷符号不能超过{max}")
	private String phosphorusSy;

	@ApiModelProperty("总氮")
	@NotNull(message = "总氮不能为空")
	@Range(min = 0, max = 99999, message = "总氮必须在{min}与{max}之间")
	private Double nitrogen;

	@ApiModelProperty("总氮符号")
	@NotNull(message = "总氮符号不能为空")
	@Length(min = 0, max = 2, message = "总氮符号不能超过{max}")
	private String nitrogenSy;

	@ApiModelProperty("铜")
	@NotNull(message = "铜不能为空")
	@Range(min = 0, max = 99999, message = "铜必须在{min}与{max}之间")
	private Double copper;

	@ApiModelProperty("铜符号")
	@NotNull(message = "铜符号不能为空")
	@Length(min = 0, max = 2, message = "铜符号不能超过{max}")
	private String copperSy;

	@ApiModelProperty("锌")
	@NotNull(message = "锌不能为空")
	@Range(min = 0, max = 99999, message = "锌必须在{min}与{max}之间")
	private Double zinc;

	@ApiModelProperty("锌符号")
	@NotNull(message = "锌符号不能为空")
	@Length(min = 0, max = 2, message = "锌符号不能超过{max}")
	private String zincSy;

	@ApiModelProperty("氟化物")
	@NotNull(message = "氟化物不能为空")
	@Range(min = 0, max = 99999, message = "氟化物必须在{min}与{max}之间")
	private Double fluoride;

	@ApiModelProperty("氟化物符号")
	@NotNull(message = "氟化物符号不能为空")
	@Length(min = 0, max = 2, message = "氟化物符号不能超过{max}")
	private String fluorideSy;

	@ApiModelProperty("硒")
	@NotNull(message = "硒不能为空")
	@Range(min = 0, max = 99999, message = "硒必须在{min}与{max}之间")
	private Double selenium;

	@ApiModelProperty("硒符号")
	@NotNull(message = "硒符号不能为空")
	@Length(min = 0, max = 2, message = "硒符号不能超过{max}")
	private String seleniumSy;

	@ApiModelProperty("砷")
	@NotNull(message = "砷不能为空")
	@Range(min = 0, max = 99999, message = "砷必须在{min}与{max}之间")
	private Double arsenic;

	@ApiModelProperty("砷符号")
	@NotNull(message = "砷符号不能为空")
	@Length(min = 0, max = 2, message = "砷符号不能超过{max}")
	private String arsenicSy;

	@ApiModelProperty("汞")
	@NotNull(message = "汞不能为空")
	@Range(min = 0, max = 99999, message = "汞必须在{min}与{max}之间")
	private Double mercury;

	@ApiModelProperty("汞符号")
	@NotNull(message = "汞符号不能为空")
	@Length(min = 0, max = 2, message = "汞符号不能超过{max}")
	private String mercurySy;

	@ApiModelProperty("镉")
	@NotNull(message = "镉不能为空")
	@Range(min = 0, max = 99999, message = "镉必须在{min}与{max}之间")
	private Double cadmium;

	@ApiModelProperty("镉符号")
	@NotNull(message = "镉符号不能为空")
	@Length(min = 0, max = 2, message = "镉符号不能超过{max}")
	private String cadmiumSy;

	@ApiModelProperty("六价铬")
	@NotNull(message = "六价铬不能为空")
	@Range(min = 0, max = 99999, message = "六价铬必须在{min}与{max}之间")
	private Double chromium;

	@ApiModelProperty("六价铬符号")
	@NotNull(message = "六价铬符号不能为空")
	@Length(min = 0, max = 2, message = "六价铬符号不能超过{max}")
	private String chromiumSy;

	@ApiModelProperty("铅")
	@NotNull(message = "铅不能为空")
	@Range(min = 0, max = 99999, message = "铅必须在{min}与{max}之间")
	private Double lead;

	@ApiModelProperty("铅符号")
	@NotNull(message = "铅符号不能为空")
	@Length(min = 0, max = 2, message = "铅符号不能超过{max}")
	private String leadSy;

	@ApiModelProperty("氰化物")
	@NotNull(message = "氰化物不能为空")
	@Range(min = 0, max = 99999, message = "氰化物必须在{min}与{max}之间")
	private Double cyanide;

	@ApiModelProperty("氰化物符号")
	@NotNull(message = "氰化物符号不能为空")
	@Length(min = 0, max = 2, message = "氰化物符号不能超过{max}")
	private String cyanideSy;

	@ApiModelProperty("挥发酚")
	@NotNull(message = "挥发酚不能为空")
	@Range(min = 0, max = 99999, message = "挥发酚必须在{min}与{max}之间")
	private Double phenol;

	@ApiModelProperty("挥发酚符号")
	@NotNull(message = "挥发酚符号不能为空")
	@Length(min = 0, max = 2, message = "挥发酚符号不能超过{max}")
	private String phenolSy;

	@ApiModelProperty("石油类")
	@NotNull(message = "石油类不能为空")
	@Range(min = 0, max = 99999, message = "石油类必须在{min}与{max}之间")
	private Double petroleum;

	@ApiModelProperty("石油类符号")
	@NotNull(message = "石油类符号不能为空")
	@Length(min = 0, max = 2, message = "石油类符号不能超过{max}")
	private String petroleumSy;

	@ApiModelProperty("阴离子表面活性剂")
	@NotNull(message = "阴离子表面活性剂不能为空")
	@Range(min = 0, max = 99999, message = "阴离子表面活性剂必须在{min}与{max}之间")
	private Double surfactant;

	@ApiModelProperty("阴离子表面活性剂符号")
	@NotNull(message = "阴离子表面活性剂符号不能为空")
	@Length(min = 0, max = 2, message = "阴离子表面活性剂符号不能超过{max}")
	private String surfactantSy;

	@ApiModelProperty("硫化物")
	@NotNull(message = "硫化物不能为空")
	@Range(min = 0, max = 99999, message = "硫化物必须在{min}与{max}之间")
	private Double sulfide;

	@ApiModelProperty("硫化物符号")
	@NotNull(message = "硫化物符号不能为空")
	@Length(min = 0, max = 2, message = "硫化物符号不能超过{max}")
	private String sulfideSy;

	@ApiModelProperty("粪大肠菌群")
	@NotNull(message = "粪大肠菌群不能为空")
	@Range(min = 0, max = 99999, message = "粪大肠菌群必须在{min}与{max}之间")
	private Double coliform;

	@ApiModelProperty("粪大肠菌群符号")
	@NotNull(message = "粪大肠菌群符号不能为空")
	@Length(min = 0, max = 2, message = "粪大肠菌群符号不能超过{max}")
	private String coliformSy;

	@ApiModelProperty("叶绿素a")
	@NotNull(message = "叶绿素a不能为空")
	@Range(min = 0, max = 99999, message = "叶绿素a必须在{min}与{max}之间")
	private Double chlorA;

	@ApiModelProperty("叶绿素a符号")
	@NotNull(message = "叶绿素a符号不能为空")
	@Length(min = 0, max = 2, message = "叶绿素a符号不能超过{max}")
	private String chlorASy;

	@ApiModelProperty("透明度")
	@NotNull(message = "透明度不能为空")
	@Range(min = 0, max = 99999, message = "透明度必须在{min}与{max}之间")
	private Double transparency;

	@ApiModelProperty("透明度符号")
	@NotNull(message = "透明度符号不能为空")
	@Length(min = 0, max = 2, message = "透明度符号不能超过{max}")
	private String transparencySy;

	@ApiModelProperty("悬浮物")
	@NotNull(message = "悬浮物不能为空")
	@Range(min = 0, max = 99999, message = "悬浮物必须在{min}与{max}之间")
	private Double suspended;

	@ApiModelProperty("悬浮物符号")
	@NotNull(message = "悬浮物符号不能为空")
	@Length(min = 0, max = 2, message = "悬浮物符号不能超过{max}")
	private String suspendedSy;

	@ApiModelProperty("监测单位")
	@NotNull(message = "监测单位不能为空")
	@Length(min = 0, max = 25, message = "监测单位不能超过{max}")
	private String monUnit;

	@ApiModelProperty("检测者")
	@NotNull(message = "检测者不能为空")
	@Length(min = 0, max = 25, message = "检测者不能超过{max}")
	private String monitor;

	@ApiModelProperty("录入者")
	@Length(min = 0, max = 25, message = "录入者不能超过{max}")
	private String inputer;

	@ApiModelProperty("审核者")
	@NotNull(message = "审核者不能为空")
	@Length(min = 0, max = 12, message = "审核者不能超过{max}")
	private String auditor;

	@ApiModelProperty("流程状态")
	@Length(min = 0, max = 12, message = "流程状态不能超过{max}")
	private String processStatus;

	@ApiModelProperty("审核结果")
	@Range(min = 0, max = 1, message = "审核结果应该在{min}与{max}之间")
	private Short auditResult;

	@ApiModelProperty("审核意见")
	@Length(min = 0, max = 50, message = "审核意见不能超过{max}")
	private String auditOpinion;

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

	public Double getWaterTemp() {
		return waterTemp;
	}

	public void setWaterTemp(Double waterTemp) {
		this.waterTemp = waterTemp;
	}

	public String getWaterTempSy() {
		return waterTempSy;
	}

	public void setWaterTempSy(String waterTempSy) {
		this.waterTempSy = waterTempSy == null ? null : waterTempSy.trim();
	}

	public Double getPhValue() {
		return phValue;
	}

	public void setPhValue(Double phValue) {
		this.phValue = phValue;
	}

	public String getPhValueSy() {
		return phValueSy;
	}

	public void setPhValueSy(String phValueSy) {
		this.phValueSy = phValueSy == null ? null : phValueSy.trim();
	}

	public Double getDisOxygen() {
		return disOxygen;
	}

	public void setDisOxygen(Double disOxygen) {
		this.disOxygen = disOxygen;
	}

	public String getDisOxygenSy() {
		return disOxygenSy;
	}

	public void setDisOxygenSy(String disOxygenSy) {
		this.disOxygenSy = disOxygenSy == null ? null : disOxygenSy.trim();
	}

	public Double getPermanganate() {
		return permanganate;
	}

	public void setPermanganate(Double permanganate) {
		this.permanganate = permanganate;
	}

	public String getPermanganateSy() {
		return permanganateSy;
	}

	public void setPermanganateSy(String permanganateSy) {
		this.permanganateSy = permanganateSy == null ? null : permanganateSy.trim();
	}

	public Double getOxDemand() {
		return oxDemand;
	}

	public void setOxDemand(Double oxDemand) {
		this.oxDemand = oxDemand;
	}

	public String getOxDemandSy() {
		return oxDemandSy;
	}

	public void setOxDemandSy(String oxDemandSy) {
		this.oxDemandSy = oxDemandSy == null ? null : oxDemandSy.trim();
	}

	public Double getBoDemand() {
		return boDemand;
	}

	public void setBoDemand(Double boDemand) {
		this.boDemand = boDemand;
	}

	public String getBoDemandSy() {
		return boDemandSy;
	}

	public void setBoDemandSy(String boDemandSy) {
		this.boDemandSy = boDemandSy == null ? null : boDemandSy.trim();
	}

	public Double getAmmonia() {
		return ammonia;
	}

	public void setAmmonia(Double ammonia) {
		this.ammonia = ammonia;
	}

	public String getAmmoniaSy() {
		return ammoniaSy;
	}

	public void setAmmoniaSy(String ammoniaSy) {
		this.ammoniaSy = ammoniaSy == null ? null : ammoniaSy.trim();
	}

	public Double getPhosphorus() {
		return phosphorus;
	}

	public void setPhosphorus(Double phosphorus) {
		this.phosphorus = phosphorus;
	}

	public String getPhosphorusSy() {
		return phosphorusSy;
	}

	public void setPhosphorusSy(String phosphorusSy) {
		this.phosphorusSy = phosphorusSy == null ? null : phosphorusSy.trim();
	}

	public Double getNitrogen() {
		return nitrogen;
	}

	public void setNitrogen(Double nitrogen) {
		this.nitrogen = nitrogen;
	}

	public String getNitrogenSy() {
		return nitrogenSy;
	}

	public void setNitrogenSy(String nitrogenSy) {
		this.nitrogenSy = nitrogenSy == null ? null : nitrogenSy.trim();
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

	public Double getFluoride() {
		return fluoride;
	}

	public void setFluoride(Double fluoride) {
		this.fluoride = fluoride;
	}

	public String getFluorideSy() {
		return fluorideSy;
	}

	public void setFluorideSy(String fluorideSy) {
		this.fluorideSy = fluorideSy == null ? null : fluorideSy.trim();
	}

	public Double getSelenium() {
		return selenium;
	}

	public void setSelenium(Double selenium) {
		this.selenium = selenium;
	}

	public String getSeleniumSy() {
		return seleniumSy;
	}

	public void setSeleniumSy(String seleniumSy) {
		this.seleniumSy = seleniumSy == null ? null : seleniumSy.trim();
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

	public Double getCyanide() {
		return cyanide;
	}

	public void setCyanide(Double cyanide) {
		this.cyanide = cyanide;
	}

	public String getCyanideSy() {
		return cyanideSy;
	}

	public void setCyanideSy(String cyanideSy) {
		this.cyanideSy = cyanideSy == null ? null : cyanideSy.trim();
	}

	public Double getPhenol() {
		return phenol;
	}

	public void setPhenol(Double phenol) {
		this.phenol = phenol;
	}

	public String getPhenolSy() {
		return phenolSy;
	}

	public void setPhenolSy(String phenolSy) {
		this.phenolSy = phenolSy == null ? null : phenolSy.trim();
	}

	public Double getPetroleum() {
		return petroleum;
	}

	public void setPetroleum(Double petroleum) {
		this.petroleum = petroleum;
	}

	public String getPetroleumSy() {
		return petroleumSy;
	}

	public void setPetroleumSy(String petroleumSy) {
		this.petroleumSy = petroleumSy == null ? null : petroleumSy.trim();
	}

	public Double getSurfactant() {
		return surfactant;
	}

	public void setSurfactant(Double surfactant) {
		this.surfactant = surfactant;
	}

	public String getSurfactantSy() {
		return surfactantSy;
	}

	public void setSurfactantSy(String surfactantSy) {
		this.surfactantSy = surfactantSy == null ? null : surfactantSy.trim();
	}

	public Double getSulfide() {
		return sulfide;
	}

	public void setSulfide(Double sulfide) {
		this.sulfide = sulfide;
	}

	public String getSulfideSy() {
		return sulfideSy;
	}

	public void setSulfideSy(String sulfideSy) {
		this.sulfideSy = sulfideSy == null ? null : sulfideSy.trim();
	}

	public Double getColiform() {
		return coliform;
	}

	public void setColiform(Double coliform) {
		this.coliform = coliform;
	}

	public String getColiformSy() {
		return coliformSy;
	}

	public void setColiformSy(String coliformSy) {
		this.coliformSy = coliformSy == null ? null : coliformSy.trim();
	}

	public Double getChlorA() {
		return chlorA;
	}

	public void setChlorA(Double chlorA) {
		this.chlorA = chlorA;
	}

	public String getChlorASy() {
		return chlorASy;
	}

	public void setChlorASy(String chlorASy) {
		this.chlorASy = chlorASy == null ? null : chlorASy.trim();
	}

	public Double getTransparency() {
		return transparency;
	}

	public void setTransparency(Double transparency) {
		this.transparency = transparency;
	}

	public String getTransparencySy() {
		return transparencySy;
	}

	public void setTransparencySy(String transparencySy) {
		this.transparencySy = transparencySy == null ? null : transparencySy.trim();
	}

	public Double getSuspended() {
		return suspended;
	}

	public void setSuspended(Double suspended) {
		this.suspended = suspended;
	}

	public String getSuspendedSy() {
		return suspendedSy;
	}

	public void setSuspendedSy(String suspendedSy) {
		this.suspendedSy = suspendedSy == null ? null : suspendedSy.trim();
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

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public Short getAuditResult() {
		return auditResult;
	}

	public void setAuditResult(Short auditResult) {
		this.auditResult = auditResult;
	}

	public String getAuditOpinion() {
		return auditOpinion;
	}

	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion = auditOpinion;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}