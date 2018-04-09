package com.springinaction.chapter8.pizza.domain;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.text.WordUtils;

public enum PaymentType {
	CASH, CHECK, CREDIT_CARD;
	
	public static List<PaymentType> asList(){
		PaymentType[] all = PaymentType.values();
		return Arrays.asList(all);
	}
	
	public String toString() {
		return WordUtils.capitalizeFully(name().replace('_', ' '));
	}
}
