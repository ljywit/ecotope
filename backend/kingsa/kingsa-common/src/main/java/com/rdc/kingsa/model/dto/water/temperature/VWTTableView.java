package com.rdc.kingsa.model.dto.water.temperature;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("垂向水温观测成果表-保存")
public class VWTTableView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("表名")
	@NotNull(message = "表名不能为空")
	@Length(min = 0, max = 12, message = "表名不能超过{max}")
	private String tableName;

	@ApiModelProperty("年份")
	@NotNull(message = "年份不能为空")
	@Length(min = 0, max = 5, message = "年份不能超过{max}")
	private String particYear;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("断面名称")
	@NotNull(message = "断面名称不能为空")
	@Length(min = 0, max = 12, message = "断面名称不能超过{max}")
	private String sectionName;

	@ApiModelProperty("经度")
	@NotNull(message = "经度不能为空")
	@Range(min = 0, max = 999, message = "经度必须在{min}与{max}之间")
	private Double longitude;

	@ApiModelProperty("纬度")
	@NotNull(message = "纬度不能为空")
	@Range(min = 0, max = 999, message = "纬度必须在{min}与{max}之间")
	private Double latitude;

	@ApiModelProperty("观测时间")
	@NotNull(message = "观测时间不能为空")
	private Date observeTime;

	@ApiModelProperty("制表人")
	@NotNull(message = "制表人不能为空")
	@Length(min = 0, max = 12, message = "制表人不能超过{max}")
	private String tabulator;

	@ApiModelProperty("校验人")
	@NotNull(message = "校验人不能为空")
	@Length(min = 0, max = 12, message = "校验人不能超过{max}")
	private String checker;

	@ApiModelProperty("审核人")
	@NotNull(message = "审核人不能为空")
	@Length(min = 0, max = 12, message = "审核人不能超过{max}")
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

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName == null ? null : tableName.trim();
	}

	public String getParticYear() {
		return particYear;
	}

	public void setParticYear(String particYear) {
		this.particYear = particYear == null ? null : particYear.trim();
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

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Date getObserveTime() {
		return observeTime;
	}

	public void setObserveTime(Date observeTime) {
		this.observeTime = observeTime;
	}

	public String getTabulator() {
		return tabulator;
	}

	public void setTabulator(String tabulator) {
		this.tabulator = tabulator == null ? null : tabulator.trim();
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker == null ? null : checker.trim();
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