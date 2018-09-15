package com.rdc.kingsa.model.dto.water.gas;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("气体过饱和信息表-保存")
public class GSSMIView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("断面名称")
	@NotNull(message = "断面名称不能为空")
	@Length(min = 0, max = 12, message = "断面名称不能超过{max}")
	private String sectionName;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("测线")
	@NotNull(message = "测线不能为空")
	@Length(min = 0, max = 12, message = "测线不能超过{max}")
	private String measureLine;

	@ApiModelProperty("气压")
	@NotNull(message = "气压不能为空")
	@Range(min = 0, max = 99999, message = "气压必须在{min}与{max}之间")
	private Double pressure;

	@ApiModelProperty("水深")
	@NotNull(message = "水深不能为空")
	@Range(min = 0, max = 99999, message = "水深必须在{min}与{max}之间")
	private Double waterDepth;

	@ApiModelProperty("水温")
	@NotNull(message = "水温不能为空")
	@Range(min = 0, max = 99999, message = "水温必须在{min}与{max}之间")
	private Double waterTemper;

	@ApiModelProperty("DO-仪器")
	@NotNull(message = "DO-仪器不能为空")
	@Range(min = 0, max = 99999, message = "DO-仪器必须在{min}与{max}之间")
	private Double doInstrument;

	@ApiModelProperty("DO含量")
	@NotNull(message = "DO含量不能为空")
	@Range(min = 0, max = 99999, message = "DO含量必须在{min}与{max}之间")
	private Double doContent;

	@ApiModelProperty("DN含量")
	@NotNull(message = "DN含量不能为空")
	@Range(min = 0, max = 99999, message = "DN含量必须在{min}与{max}之间")
	private Double dnContent;

	@ApiModelProperty("DO饱和度")
	@NotNull(message = "DO饱和度不能为空")
	@Range(min = 0, max = 99999, message = "DO饱和度必须在{min}与{max}之间")
	private Double doSaturation;

	@ApiModelProperty("DN饱和度")
	@NotNull(message = "DN饱和度不能为空")
	@Range(min = 0, max = 99999, message = "DN饱和度必须在{min}与{max}之间")
	private Double dnSaturation;

	@ApiModelProperty("DO1")
	@NotNull(message = "DO不能为空")
	@Range(min = 0, max = 99999, message = "DO必须在{min}与{max}之间")
	private Double do1;

	@ApiModelProperty("DO2")
	@NotNull(message = "DO不能为空")
	@Range(min = 0, max = 99999, message = "DO必须在{min}与{max}之间")
	private Double do2;

	@ApiModelProperty("DO3")
	@Range(min = 0, max = 99999, message = "DO必须在{min}与{max}之间")
	private Double do3;

	@ApiModelProperty("DO饱和度-滴定")
	@NotNull(message = "DO饱和度-滴定不能为空")
	@Range(min = 0, max = 99999, message = "DO饱和度-滴定必须在{min}与{max}之间")
	private Double titration;

	@ApiModelProperty("DO饱和度-仪器")
	@NotNull(message = "DO饱和度-仪器不能为空")
	@Range(min = 0, max = 99999, message = "DO饱和度-仪器必须在{min}与{max}之间")
	private Double doSatInst;

	@ApiModelProperty("TDG饱和度")
	@NotNull(message = "TDG饱和度不能为空")
	@Range(min = 0, max = 99999, message = "TDG饱和度必须在{min}与{max}之间")
	private Double tdgSaturation;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId == null ? null : sectionId.trim();
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName == null ? null : sectionName.trim();
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public String getMeasureLine() {
		return measureLine;
	}

	public void setMeasureLine(String measureLine) {
		this.measureLine = measureLine == null ? null : measureLine.trim();
	}

	public Double getPressure() {
		return pressure;
	}

	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	public Double getWaterDepth() {
		return waterDepth;
	}

	public void setWaterDepth(Double waterDepth) {
		this.waterDepth = waterDepth;
	}

	public Double getWaterTemper() {
		return waterTemper;
	}

	public void setWaterTemper(Double waterTemper) {
		this.waterTemper = waterTemper;
	}

	public Double getDoInstrument() {
		return doInstrument;
	}

	public void setDoInstrument(Double doInstrument) {
		this.doInstrument = doInstrument;
	}

	public Double getDoContent() {
		return doContent;
	}

	public void setDoContent(Double doContent) {
		this.doContent = doContent;
	}

	public Double getDnContent() {
		return dnContent;
	}

	public void setDnContent(Double dnContent) {
		this.dnContent = dnContent;
	}

	public Double getDoSaturation() {
		return doSaturation;
	}

	public void setDoSaturation(Double doSaturation) {
		this.doSaturation = doSaturation;
	}

	public Double getDnSaturation() {
		return dnSaturation;
	}

	public void setDnSaturation(Double dnSaturation) {
		this.dnSaturation = dnSaturation;
	}

	public Double getDo1() {
		return do1;
	}

	public void setDo1(Double do1) {
		this.do1 = do1;
	}

	public Double getDo2() {
		return do2;
	}

	public void setDo2(Double do2) {
		this.do2 = do2;
	}

	public Double getDo3() {
		return do3;
	}

	public void setDo3(Double do3) {
		this.do3 = do3;
	}

	public Double getTitration() {
		return titration;
	}

	public void setTitration(Double titration) {
		this.titration = titration;
	}

	public Double getDoSatInst() {
		return doSatInst;
	}

	public void setDoSatInst(Double doSatInst) {
		this.doSatInst = doSatInst;
	}

	public Double getTdgSaturation() {
		return tdgSaturation;
	}

	public void setTdgSaturation(Double tdgSaturation) {
		this.tdgSaturation = tdgSaturation;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}