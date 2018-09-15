package com.rdc.kingsa.model.dto.water.quality;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("富营养化评价信息-保存")
public class EutrophicationEstimateView {

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

	@ApiModelProperty("叶绿素A指数")
	@NotNull(message = "叶绿素A指数不能为空")
	@Range(min = 0, max = 99999, message = "叶绿素A指数必须在{min}与{max}之间")
	private Double tsiChlorA;

	@ApiModelProperty("TP指数")
	@NotNull(message = "TP指数不能为空")
	@Range(min = 0, max = 99999, message = "TP指数必须在{min}与{max}之间")
	private Double tsiTp;

	@ApiModelProperty("TN指数")
	@NotNull(message = "TN指数不能为空")
	@Range(min = 0, max = 99999, message = "TN指数必须在{min}与{max}之间")
	private Double tsiTn;

	@ApiModelProperty("透明度指数")
	@NotNull(message = "透明度指数不能为空")
	@Range(min = 0, max = 99999, message = "透明度指数必须在{min}与{max}之间")
	private Double tsiSd;

	@ApiModelProperty("高锰酸盐指数")
	@NotNull(message = "高锰酸盐指数不能为空")
	@Range(min = 0, max = 99999, message = "高锰酸盐指数必须在{min}与{max}之间")
	private Double tsiCodmn;

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

	public Double getTsiChlorA() {
		return tsiChlorA;
	}

	public void setTsiChlorA(Double tsiChlorA) {
		this.tsiChlorA = tsiChlorA;
	}

	public Double getTsiTp() {
		return tsiTp;
	}

	public void setTsiTp(Double tsiTp) {
		this.tsiTp = tsiTp;
	}

	public Double getTsiTn() {
		return tsiTn;
	}

	public void setTsiTn(Double tsiTn) {
		this.tsiTn = tsiTn;
	}

	public Double getTsiSd() {
		return tsiSd;
	}

	public void setTsiSd(Double tsiSd) {
		this.tsiSd = tsiSd;
	}

	public Double getTsiCodmn() {
		return tsiCodmn;
	}

	public void setTsiCodmn(Double tsiCodmn) {
		this.tsiCodmn = tsiCodmn;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}