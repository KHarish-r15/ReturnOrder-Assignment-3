package com.component.api.entity;

public class ProcessRequest {

	private String userName;
	private long userContactNumber;
	private DefectiveComponentDetail componentDetail;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserContactNumber() {
		return userContactNumber;
	}

	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	public DefectiveComponentDetail getComponentDetail() {
		return componentDetail;
	}

	public void setComponentDetail(DefectiveComponentDetail componentDetail) {
		this.componentDetail = componentDetail;
	}

}
