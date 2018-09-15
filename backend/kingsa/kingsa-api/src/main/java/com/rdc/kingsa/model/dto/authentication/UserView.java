package com.rdc.kingsa.model.dto.authentication;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户-保存")
public class UserView {

	@ApiModelProperty("主键")
	private String id;

	@ApiModelProperty("部门ID")
	@NotNull(message = "部门ID不能为空")
	private String deptId;

	@ApiModelProperty("用户名")
	@NotNull(message = "用户名不能为空")
	@Length(min = 0, max = 50, message = "用户名不能超过{max}")
	private String username;

	@ApiModelProperty("真实姓名")
	@NotNull(message = "真实姓名不能为空")
	@Length(min = 0, max = 25, message = "真实姓名不能超过{max}")
	private String realName;

	@ApiModelProperty("密码")
	@NotNull(message = "密码不能为空")
	@Length(min = 0, max = 50, message = "密码不能超过{max}")
	private String password;

	@ApiModelProperty("工号")
	@Length(min = 0, max = 25, message = "工号不能超过{max}")
	private String jobNumber;

	@ApiModelProperty("身份证号")
	@Length(min = 0, max = 25, message = "身份证号不能超过{max}")
	private String idNumber;

	@ApiModelProperty("性别")
	@Length(min = 0, max = 2, message = "性别不能超过{max}")
	private String gender;

	@ApiModelProperty("年龄")
	@Range(min = 0, max = 999, message = "年龄必须在{min}与{max之间}")
	private Short phyAge;

	@ApiModelProperty("生日")
	private Date birthday;

	@ApiModelProperty("职称")
	@Length(min = 0, max = 25, message = "职称不能超过{max}")
	private String title;

	@ApiModelProperty("文化程度")
	@Length(min = 0, max = 12, message = "职称不能超过{max}")
	private String eduDegree;

	@ApiModelProperty("职位")
	@Length(min = 0, max = 25, message = "职位不能超过{max}")
	private String position;

	@ApiModelProperty("政治面貌")
	@Length(min = 0, max = 12, message = "政治面貌不能超过{max}")
	private String politicalStatus;

	@ApiModelProperty("人员类型")
	@Length(min = 0, max = 12, message = "人员类型不能超过{max}")
	private String personType;

	@ApiModelProperty("行政责任")
	@Length(min = 0, max = 12, message = "行政责任不能超过{max}")
	private String administrativeDuty;

	@ApiModelProperty("专业")
	@Length(min = 0, max = 25, message = "专业不能超过{max}")
	private String profession;

	@ApiModelProperty("手机号码")
	@Length(min = 0, max = 12, message = "手机号码不能超过{max}")
	private String phoneNumber;

	@ApiModelProperty("电子邮箱地址")
	@Email
	private String emailAddress;

	@ApiModelProperty("住址")
	@Length(min = 0, max = 50, message = "住址不能超过{max}")
	private String address;

	@ApiModelProperty("账号是否可用")
	@NotNull(message = "账号是否可用不能为空")
	@Range(min = 0, max = 1, message = "账号是否可用必须在{min}与{max之间}")
	private Short available;

	@ApiModelProperty("备注信息")
	@Length(min = 0, max = 25, message = "备注信息不能超过{max}")
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId == null ? null : deptId.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber == null ? null : jobNumber.trim();
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber == null ? null : idNumber.trim();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	public Short getPhyAge() {
		return phyAge;
	}

	public void setPhyAge(Short phyAge) {
		this.phyAge = phyAge;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getEduDegree() {
		return eduDegree;
	}

	public void setEduDegree(String eduDegree) {
		this.eduDegree = eduDegree == null ? null : eduDegree.trim();
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}

	public String getPoliticalStatus() {
		return politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType == null ? null : personType.trim();
	}

	public String getAdministrativeDuty() {
		return administrativeDuty;
	}

	public void setAdministrativeDuty(String administrativeDuty) {
		this.administrativeDuty = administrativeDuty == null ? null : administrativeDuty.trim();
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession == null ? null : profession.trim();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress == null ? null : emailAddress.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Short getAvailable() {
		return available;
	}

	public void setAvailable(Short available) {
		this.available = available;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}