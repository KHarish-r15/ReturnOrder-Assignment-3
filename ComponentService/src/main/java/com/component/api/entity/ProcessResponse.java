package com.component.api.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProcessResponse {

	private String requestId;
	private float processingCharge;
	private float packagingAndDeliveryCharge;
	private LocalDate dateOfDelivery;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public float getProcessingCharge() {
		return processingCharge;
	}

	public void setProcessingCharge(float processingCharge) {
		this.processingCharge = processingCharge;
	}

	public float getPackagingAndDeliveryCharge() {
		return packagingAndDeliveryCharge;
	}

	public void setPackagingAndDeliveryCharge(float packagingAndDeliveryCharge) {
		this.packagingAndDeliveryCharge = packagingAndDeliveryCharge;
	}

	public LocalDate getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(LocalDate dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

	

}
