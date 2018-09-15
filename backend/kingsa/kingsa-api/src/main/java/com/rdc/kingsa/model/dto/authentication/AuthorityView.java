package com.rdc.kingsa.model.dto.authentication;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("权限信息-保存")
public class AuthorityView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("权限名称")
	@NotNull(message = "权限名称不能为空")
	@Length(min = 0, max = 25, message = "权限名称不能超过{max}")
	private String authorityName;

	@ApiModelProperty("权限信息")
	@Length(min = 0, max = 25, message = "权限信息不能超过{max}")
	private String authorityInfo;

	@ApiModelProperty("权限标识")
	@NotNull(message = "权限标识")
	@Length(min = 0, max = 12, message = "权限标识不能超过{max}")
	private String authoritySymbol;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName == null ? null : authorityName.trim();
	}

	public String getAuthorityInfo() {
		return authorityInfo;
	}

	public void setAuthorityInfo(String authorityInfo) {
		this.authorityInfo = authorityInfo == null ? null : authorityInfo.trim();
	}

	public String getAuthoritySymbol() {
		return authoritySymbol;
	}

	public void setAuthoritySymbol(String authoritySymbol) {
		this.authoritySymbol = authoritySymbol == null ? null : authoritySymbol.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}