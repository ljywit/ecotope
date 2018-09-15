package com.rdc.kingsa.model.dto.authentication;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("角色信息-保存")
public class RoleView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("角色名称")
	@NotNull(message = "角色名称不能为空")
	@Length(min = 0, max = 12, message = "角色名称不能超过{max}")
	private String roleName;

	@ApiModelProperty("角色简介")
	@Length(min = 0, max = 25, message = "角色简介不能超过{max}")
	private String roleIntroduction;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	public String getRoleIntroduction() {
		return roleIntroduction;
	}

	public void setRoleIntroduction(String roleIntroduction) {
		this.roleIntroduction = roleIntroduction == null ? null : roleIntroduction.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}