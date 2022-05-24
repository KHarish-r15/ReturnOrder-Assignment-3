package com.component.api.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Components {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
	@Column(length = 36, nullable = false, updatable = false)
	private String id;
	private String userName;
	private long userContactNumber;
	@OneToMany(cascade = CascadeType.ALL)
	private List<DefectiveComponentDetail> defectiveComponentDetail;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dateOfArrival;

	public Date getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}

	@PrePersist
	private void onCreate() {
		dateOfArrival = new Date();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public List<DefectiveComponentDetail> getDefectiveComponentDetail() {
		return defectiveComponentDetail;
	}

	public void setDefectiveComponentDetail(List<DefectiveComponentDetail> defectiveComponentDetail) {
		this.defectiveComponentDetail = defectiveComponentDetail;
	}

}
