package com.rdc.kingsa.model.dto.terra;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("植物组成信息-保存")
public class PlantCompositionView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("区域")
	@NotNull(message = "区域不能为空")
	@Length(max = 25, message = "区域长度不能超过{max}")
	private String region;

	@ApiModelProperty("监测时间")
	@NotNull(message = "监测时间不能为空")
	private Date monitorTime;

	@ApiModelProperty("维管束植物-科")
	@NotNull(message = "维管束植物-科不能为空")
	@Range(min = 0, max = 9999999999L, message = "维管束植物-科必须在{min}与{max}之间")
	private Long vascularFamily;

	@ApiModelProperty("维管束植物-属")
	@NotNull(message = "维管束植物-属不能为空")
	@Range(min = 0, max = 9999999999L, message = "维管束植物-属必须在{min}与{max}之间")
	private Long vascularGenus;

	@ApiModelProperty("维管束植物-种")
	@NotNull(message = "维管束植物-种不能为空")
	@Range(min = 0, max = 9999999999L, message = "维管束植物-种必须在{min}与{max}之间")
	private Long vascularSpecies;

	@ApiModelProperty("蕨类植物-科")
	@NotNull(message = "蕨类植物-科不能为空")
	@Range(min = 0, max = 9999999999L, message = "蕨类植物-科必须在{min}与{max}之间")
	private Long fernFamily;

	@ApiModelProperty("蕨类植物-属")
	@NotNull(message = "蕨类植物-属不能为空")
	@Range(min = 0, max = 9999999999L, message = "蕨类植物-属必须在{min}与{max}之间")
	private Long fernGenus;

	@ApiModelProperty("蕨类植物-种")
	@NotNull(message = "蕨类植物-种不能为空")
	@Range(min = 0, max = 9999999999L, message = "蕨类植物-种必须在{min}与{max}之间")
	private Long fernSpecies;

	@ApiModelProperty("裸子植物-科")
	@NotNull(message = "裸子植物-科不能为空")
	@Range(min = 0, max = 9999999999L, message = "裸子植物-科必须在{min}与{max}之间")
	private Long gymnospermFamily;

	@ApiModelProperty("裸子植物-属")
	@NotNull(message = "裸子植物-属不能为空")
	@Range(min = 0, max = 9999999999L, message = "裸子植物-属必须在{min}与{max}之间")
	private Long gymnospermGenus;

	@ApiModelProperty("裸子植物-种")
	@NotNull(message = "裸子植物-种不能为空")
	@Range(min = 0, max = 9999999999L, message = "裸子植物-种必须在{min}与{max}之间")
	private Long gymnospermSpecies;

	@ApiModelProperty("被子植物-科")
	@NotNull(message = "被子植物-科不能为空")
	@Range(min = 0, max = 9999999999L, message = "被子植物-科必须在{min}与{max}之间")
	private Long angiospermFamily;

	@ApiModelProperty("被子植物-属")
	@NotNull(message = "被子植物-属不能为空")
	@Range(min = 0, max = 9999999999L, message = "被子植物-属必须在{min}与{max}之间")
	private Long angiospermGenus;

	@ApiModelProperty("被子植物-种")
	@NotNull(message = "被子植物-种不能为空")
	@Range(min = 0, max = 9999999999L, message = "被子植物-种必须在{min}与{max}之间")
	private Long angiospermSpecies;

	@ApiModelProperty("备注信息")
	@Length(max = 25, message = "备注信息长度不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public Long getVascularFamily() {
		return vascularFamily;
	}

	public void setVascularFamily(Long vascularFamily) {
		this.vascularFamily = vascularFamily;
	}

	public Long getVascularGenus() {
		return vascularGenus;
	}

	public void setVascularGenus(Long vascularGenus) {
		this.vascularGenus = vascularGenus;
	}

	public Long getVascularSpecies() {
		return vascularSpecies;
	}

	public void setVascularSpecies(Long vascularSpecies) {
		this.vascularSpecies = vascularSpecies;
	}

	public Long getFernFamily() {
		return fernFamily;
	}

	public void setFernFamily(Long fernFamily) {
		this.fernFamily = fernFamily;
	}

	public Long getFernGenus() {
		return fernGenus;
	}

	public void setFernGenus(Long fernGenus) {
		this.fernGenus = fernGenus;
	}

	public Long getFernSpecies() {
		return fernSpecies;
	}

	public void setFernSpecies(Long fernSpecies) {
		this.fernSpecies = fernSpecies;
	}

	public Long getGymnospermFamily() {
		return gymnospermFamily;
	}

	public void setGymnospermFamily(Long gymnospermFamily) {
		this.gymnospermFamily = gymnospermFamily;
	}

	public Long getGymnospermGenus() {
		return gymnospermGenus;
	}

	public void setGymnospermGenus(Long gymnospermGenus) {
		this.gymnospermGenus = gymnospermGenus;
	}

	public Long getGymnospermSpecies() {
		return gymnospermSpecies;
	}

	public void setGymnospermSpecies(Long gymnospermSpecies) {
		this.gymnospermSpecies = gymnospermSpecies;
	}

	public Long getAngiospermFamily() {
		return angiospermFamily;
	}

	public void setAngiospermFamily(Long angiospermFamily) {
		this.angiospermFamily = angiospermFamily;
	}

	public Long getAngiospermGenus() {
		return angiospermGenus;
	}

	public void setAngiospermGenus(Long angiospermGenus) {
		this.angiospermGenus = angiospermGenus;
	}

	public Long getAngiospermSpecies() {
		return angiospermSpecies;
	}

	public void setAngiospermSpecies(Long angiospermSpecies) {
		this.angiospermSpecies = angiospermSpecies;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}