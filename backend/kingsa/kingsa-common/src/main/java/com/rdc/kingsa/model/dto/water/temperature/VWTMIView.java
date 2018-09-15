package com.rdc.kingsa.model.dto.water.temperature;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("垂向水温观测信息表-保存")
public class VWTMIView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("水深")
	@NotNull(message = "水深不能为空")
	@Range(min = 0, max = 99999, message = "水深必须在{min}与{max}之间")
	private Double waterDepth;

	@ApiModelProperty("水温")
	@NotNull(message = "水温不能为空")
	@Range(min = -256, max = 99999, message = "水深必须在{min}与{max}之间")
	private Double waterTemper;

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

	public void setSectionId(String sectonId) {
		this.sectionId = sectionId == null ? null : sectionId.trim();
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}