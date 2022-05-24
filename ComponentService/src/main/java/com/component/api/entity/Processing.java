package com.component.api.entity;

public enum Processing {

	INTEGRAL(500), ACCESSORY(300);

	private int processVal;

	public int getProcessVal() {
		return processVal;
	}

	Processing(int processVal) {
		this.processVal = processVal;
	}

}
