package com.springinaction.chapter8.pizza.service;

import com.springinaction.chapter8.pizza.domain.Customer;

public interface CustomerService {
	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
