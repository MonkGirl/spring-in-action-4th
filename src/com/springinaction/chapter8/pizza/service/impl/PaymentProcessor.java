package com.springinaction.chapter8.pizza.service.impl;

import com.springinaction.chapter8.pizza.service.PaymentException;
import com.springinaction.chapter8.pizza.service.Processor;

public class PaymentProcessor implements Processor{

	@Override
	public void approveCreditCard(String creditCardNumber, String expMonth, String expYear, float amount)
			throws PaymentException {
		if(amount > 20.00) {
			throw new PaymentException();
		}
	}

}
