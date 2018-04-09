package com.springinaction.chapter8.pizza.service;

public class CustomerNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -190723816559743749L;

	public CustomerNotFoundException() {}
	
	public CustomerNotFoundException(String message) {
		super(message);
	}
}
