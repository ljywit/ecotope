package com.rdc.kingsa.model.dto.water.eco.fish;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("渔获物记录-保存")
public class CatchRecordView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("渔获记录ID")
	@NotNull(message = "渔获记录ID不能为空")
	private String catchId;

	@ApiModelProperty("渔获时间")
	@NotNull(message = "渔获时间不能为空")
	private Date catchTime;

	@ApiModelProperty("断面ID")
	@NotNull(message = "断面ID不能为空")
	private String sectionId;

	@ApiModelProperty("采样点")
	@NotNull(message = "采样点不能为空")
	@Length(max = 25, message = "采样点长度不能超过{max}")
	private String samplingPoint;

	@ApiModelProperty("序号")
	@Range(min = 0, max = 999999999999L, message = "序号必须在{min}与{max}之间")
	private Long serialNumber;

	@ApiModelProperty("目")
	@Length(max = 25, message = "目长度不能超过{max}")
	private String bioOrder;

	@ApiModelProperty("科")
	@Length(max = 25, message = "科长度不能超过{max}")
	private String family;

	@ApiModelProperty("亚科")
	@Length(max = 25, message = "亚科长度不能超过{max}")
	private String subFamily;

	@ApiModelProperty("属")
	@Length(max = 25, message = "属长度不能超过{max}")
	private String genus;

	@ApiModelProperty("种")
	@NotNull(message = "种不能为空")
	@Length(max = 25, message = "种长度不能超过{max}")
	private String speciesName;

	@ApiModelProperty("全长")
	@NotNull(message = "全长不能为空")
	@Range(min = 0, max = 99999, message = "全长必须在{min}与{max}之间")
	private Integer overallLength;

	@ApiModelProperty("体长")
	@NotNull(message = "体长不能为空")
	@Range(min = 0, max = 99999, message = "体长必须在{min}与{max}之间")
	private Integer bodyLength;

	@ApiModelProperty("体重")
	@NotNull(message = "体重不能为空")
	@Range(min = 0, max = 99999, message = "体重必须在{min}与{max}之间")
	private Double weight;

	@ApiModelProperty("空体重")
	@Range(min = 0, max = 99999, message = "空体重必须在{min}与{max}之间")
	private Double emptyWeight;

	@ApiModelProperty("性腺")
	@Length(max = 25, message = "性腺长度不能超过{max}")
	private String gonad;

	@ApiModelProperty("食性")
	@Length(max = 25, message = "食性长度不能超过{max}")
	private String feedingHabits;

	@ApiModelProperty("年龄")
	@Length(max = 25, message = "年龄长度不能超过{max}")
	private String physicalAge;

	@ApiModelProperty("其他")
	@Length(max = 25, message = "其他长度不能超过{max}")
	private String otherThings;

	@ApiModelProperty("备注")
	@Length(max = 25, message = "备注长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCatchId() {
		return catchId;
	}

	public void setCatchId(String catchId) {
		this.catchId = catchId;
	}

	public Date getCatchTime() {
		return catchTime;
	}

	public void setCatchTime(Date catchTime) {
		this.catchTime = catchTime;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getSamplingPoint() {
		return samplingPoint;
	}

	public void setSamplingPoint(String samplingPoint) {
		this.samplingPoint = samplingPoint;
	}

	public Long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBioOrder() {
		return bioOrder;
	}

	public void setBioOrder(String bioOrder) {
		this.bioOrder = bioOrder;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getSubFamily() {
		return subFamily;
	}

	public void setSubFamily(String subFamily) {
		this.subFamily = subFamily;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	public Integer getOverallLength() {
		return overallLength;
	}

	public void setOverallLength(Integer overallLength) {
		this.overallLength = overallLength;
	}

	public Integer getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(Integer bodyLength) {
		this.bodyLength = bodyLength;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(Double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public String getGonad() {
		return gonad;
	}

	public void setGonad(String gonad) {
		this.gonad = gonad;
	}

	public String getFeedingHabits() {
		return feedingHabits;
	}

	public void setFeedingHabits(String feedingHabits) {
		this.feedingHabits = feedingHabits;
	}

	public String getPhysicalAge() {
		return physicalAge;
	}

	public void setPhysicalAge(String physicalAge) {
		this.physicalAge = physicalAge;
	}

	public String getOtherThings() {
		return otherThings;
	}

	public void setOtherThings(String otherThings) {
		this.otherThings = otherThings;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}