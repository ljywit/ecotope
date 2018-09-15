package com.rdc.kingsa.model.dto.authentication;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户组信息-保存")
public class GroupView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("组名称")
	@NotNull(message = "组名称不能为空")
	@Length(min = 0, max = 12, message = "组名称不能超过{max}")
	private String groupName;

	@ApiModelProperty("组简介")
	@Length(min = 0, max = 25, message = "组简介不能超过{max}")
	private String groupIntroduction;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName == null ? null : groupName.trim();
	}

	public String getGroupIntroduction() {
		return groupIntroduction;
	}

	public void setGroupIntroduction(String groupIntroduction) {
		this.groupIntroduction = groupIntroduction == null ? null : groupIntroduction.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}