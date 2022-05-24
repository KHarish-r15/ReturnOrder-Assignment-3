package com.component.api.utils;

import com.component.api.entity.ComponentType;
import com.component.api.entity.Processing;

public class ProcessingCharge {
	
	public int calcProcessingCharges(ComponentType componentType) {
		int result = 0;
		if (componentType.equals(ComponentType.INTEGRAL)) {
			result = Processing.INTEGRAL.getProcessVal();
			;
		} else if (componentType.equals(ComponentType.ACCESSORY)) {
			result = Processing.ACCESSORY.getProcessVal();
		}
		return result;
	}

}
