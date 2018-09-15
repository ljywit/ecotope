package com.rdc.kingsa.model.dto.water.quality;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("检测方法、分析测试手段-保存")
public class DetectionInstrumentView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("来源")
	@NotNull(message = "所属来源不能为空")
	@Length(min = 0, max = 25, message = "来源长度不能超过{max}")
	private String source;

	@ApiModelProperty("序号")
	@NotNull(message = "序号不能为空")
	@Range(min = 0, max = 99, message = "序号必须在{min}与{max}之间")
	private Short serialNum;

	@ApiModelProperty("检测项目")
	@NotNull(message = "检测项目不能为空")
	@Length(min = 0, max = 25, message = "检测项目不能超过{max}")
	private String detectItem;

	@ApiModelProperty("检测方法")
	@NotNull(message = "检测方法不能为空")
	@Length(min = 0, max = 25, message = "检测方法不能超过{max}")
	private String detectMethod;

	@ApiModelProperty("方法来源")
	@NotNull(message = "方法来源不能为空")
	@Length(min = 0, max = 25, message = "方法来源不能超过{max}")
	private String methodSource;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
	}

	public Short getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(Short serialNum) {
		this.serialNum = serialNum;
	}

	public String getDetectItem() {
		return detectItem;
	}

	public void setDetectItem(String detectItem) {
		this.detectItem = detectItem == null ? null : detectItem.trim();
	}

	public String getDetectMethod() {
		return detectMethod;
	}

	public void setDetectMethod(String detectMethod) {
		this.detectMethod = detectMethod == null ? null : detectMethod.trim();
	}

	public String getMethodSource() {
		return methodSource;
	}

	public void setMethodSource(String methodSource) {
		this.methodSource = methodSource == null ? null : methodSource.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}