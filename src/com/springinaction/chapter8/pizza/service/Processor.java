package com.springinaction.chapter8.pizza.service;

public interface Processor {
	public void approveCreditCard(String creditCardNumber, String expMonth, String expYear, float amount) throws PaymentException;
}
