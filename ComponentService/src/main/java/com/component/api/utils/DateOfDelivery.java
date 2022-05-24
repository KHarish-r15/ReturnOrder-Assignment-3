package com.component.api.utils;

import java.time.LocalDate;

import com.component.api.entity.ComponentType;

public class DateOfDelivery {

	public LocalDate getDateOfDelivery(ComponentType componentType) {
		LocalDate localdate = LocalDate.now();
		LocalDate date2 = null;
		if (componentType.equals(ComponentType.ACCESSORY)) {
			date2 = localdate.plusDays(2);
		} else if (componentType.equals(ComponentType.INTEGRAL)) {
			date2 = localdate.plusDays(5);
		}
		return date2;
	}

}
