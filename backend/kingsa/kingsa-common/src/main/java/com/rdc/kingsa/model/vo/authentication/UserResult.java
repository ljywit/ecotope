package com.rdc.kingsa.model.vo.authentication;

import java.util.Date;

public class UserResult {

	private String id;

	private String deptId;

	private String username;

	private String realName;

	private String jobNumber;

	private String idNumber;

	private String gender;

	private Short phyAge;

	private Date birthday;

	private String title;

	private String eduDegree;

	private String position;

	private String politicalStatus;

	private String personType;

	private String administrativeDuty;

	private String profession;

	private String phoneNumber;

	private String emailAddress;

	private String address;

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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

}