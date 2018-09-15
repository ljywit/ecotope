package com.rdc.kingsa.model.dto.authentication;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("部门信息-保存")
public class DeptView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("父部门ID")
	@NotNull(message = "父部门ID不能为空")
	private String parentId;

	@ApiModelProperty("部门名称")
	@NotNull(message = "部门名称不能为空")
	@Length(min = 0, max = 25, message = "部门名称不能超过{max}")
	private String deptName;

	@ApiModelProperty("部门地址")
	@Length(min = 0, max = 50, message = "部门名称不能超过{max}")
	private String deptAddress;

	@ApiModelProperty("部门联系方式")
	@Length(min = 0, max = 12, message = "部门地址不能超过{max}")
	private String deptContact;

	@ApiModelProperty("部门领导")
	@Length(min = 0, max = 12, message = "部门领导不能超过{max}")
	private String deptLeader;

	@ApiModelProperty("部门职能")
	@Length(min = 0, max = 25, message = "部门职能不能超过{max}")
	private String deptFunction;

	@ApiModelProperty("部门简介")
	@Length(min = 0, max = 50, message = "部门简介不能超过{max}")
	private String deptIntroduction;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId == null ? null : parentId.trim();
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName == null ? null : deptName.trim();
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress == null ? null : deptAddress.trim();
	}

	public String getDeptContact() {
		return deptContact;
	}

	public void setDeptContact(String deptContact) {
		this.deptContact = deptContact == null ? null : deptContact.trim();
	}

	public String getDeptLeader() {
		return deptLeader;
	}

	public void setDeptLeader(String deptLeader) {
		this.deptLeader = deptLeader == null ? null : deptLeader.trim();
	}

	public String getDeptFunction() {
		return deptFunction;
	}

	public void setDeptFunction(String deptFunction) {
		this.deptFunction = deptFunction == null ? null : deptFunction.trim();
	}

	public String getDeptIntroduction() {
		return deptIntroduction;
	}

	public void setDeptIntroduction(String deptIntroduction) {
		this.deptIntroduction = deptIntroduction == null ? null : deptIntroduction.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}