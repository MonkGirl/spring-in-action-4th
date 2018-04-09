package com.springinaction.chapter8.pizza.service.impl;

import com.springinaction.chapter8.pizza.domain.Customer;
import com.springinaction.chapter8.pizza.service.CustomerNotFoundException;
import com.springinaction.chapter8.pizza.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
		if("97255551234".equals(phoneNumber)) {
			Customer customer = new Customer();
			customer.setId(123);
			customer.setName("Craig Walls");
			customer.setAddress("3700 Dunlavy Rd");
			customer.setCity("Denton");
			customer.setState("TX");
			customer.setZipCode("76210");
			customer.setPhoneNumber(phoneNumber);
			return customer;
		}else {
			throw new CustomerNotFoundException();
		}
	}

}
