package com.rdc.kingsa.model.dto.water.quality;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("底泥重金属评价信息")
public class HeavyMetalEstimateView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String secId;

	@ApiModelProperty("底泥重金属信息ID")
	@NotNull(message = "底泥重金属信息ID不能为空")
	private String hmId;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("评价方法")
	@NotNull(message = "评价方法不能为空")
	@Length(min = 0, max = 12, message = "评价方法不能超过{max}")
	private String evaluationMethod;

	@ApiModelProperty("镉污染指数")
	@NotNull(message = "镉污染指数不能为空")
	@Range(min = 0, max = 99999, message = "镉污染指数必须在{min}与{max}之间")
	private Double cadmiumShmpi;

	@ApiModelProperty("汞污染指数")
	@NotNull(message = "汞污染指数不能为空")
	@Range(min = 0, max = 99999, message = "汞污染指数必须在{min}与{max}之间")
	private Double mercuryShmpi;

	@ApiModelProperty("砷污染指数")
	@NotNull(message = "砷污染指数不能为空")
	@Range(min = 0, max = 99999, message = "砷污染指数必须在{min}与{max}之间")
	private Double arsenicShmpi;

	@ApiModelProperty("铜污染指数")
	@NotNull(message = "铜污染指数不能为空")
	@Range(min = 0, max = 99999, message = "铜污染指数必须在{min}与{max}之间")
	private Double copperShmpi;

	@ApiModelProperty("铅污染指数")
	@NotNull(message = "铅污染指数不能为空")
	@Range(min = 0, max = 99999, message = "铅污染指数必须在{min}与{max}之间")
	private Double leadShmpi;

	@ApiModelProperty("铬污染指数")
	@NotNull(message = "铬污染指数不能为空")
	@Range(min = 0, max = 99999, message = "铬污染指数必须在{min}与{max}之间")
	private Double chromiumShmpi;

	@ApiModelProperty("锌污染指数")
	@NotNull(message = "锌污染指数不能为空")
	@Range(min = 0, max = 99999, message = "锌污染指数必须在{min}与{max}之间")
	private Double zincShmpi;

	@ApiModelProperty("镍污染指数")
	@NotNull(message = "镍污染指数不能为空")
	@Range(min = 0, max = 99999, message = "镍污染指数必须在{min}与{max}之间")
	private Double nickelShmpi;

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

	public String getHmId() {
		return hmId;
	}

	public void setHmId(String hmId) {
		this.hmId = hmId == null ? null : hmId.trim();
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

	public Double getCadmiumShmpi() {
		return cadmiumShmpi;
	}

	public void setCadmiumShmpi(Double cadmiumShmpi) {
		this.cadmiumShmpi = cadmiumShmpi;
	}

	public Double getMercuryShmpi() {
		return mercuryShmpi;
	}

	public void setMercuryShmpi(Double mercuryShmpi) {
		this.mercuryShmpi = mercuryShmpi;
	}

	public Double getArsenicShmpi() {
		return arsenicShmpi;
	}

	public void setArsenicShmpi(Double arsenicShmpi) {
		this.arsenicShmpi = arsenicShmpi;
	}

	public Double getCopperShmpi() {
		return copperShmpi;
	}

	public void setCopperShmpi(Double copperShmpi) {
		this.copperShmpi = copperShmpi;
	}

	public Double getLeadShmpi() {
		return leadShmpi;
	}

	public void setLeadShmpi(Double leadShmpi) {
		this.leadShmpi = leadShmpi;
	}

	public Double getChromiumShmpi() {
		return chromiumShmpi;
	}

	public void setChromiumShmpi(Double chromiumShmpi) {
		this.chromiumShmpi = chromiumShmpi;
	}

	public Double getZincShmpi() {
		return zincShmpi;
	}

	public void setZincShmpi(Double zincShmpi) {
		this.zincShmpi = zincShmpi;
	}

	public Double getNickelShmpi() {
		return nickelShmpi;
	}

	public void setNickelShmpi(Double nickelShmpi) {
		this.nickelShmpi = nickelShmpi;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}