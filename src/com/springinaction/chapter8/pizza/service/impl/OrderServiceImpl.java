package com.springinaction.chapter8.pizza.service.impl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.springinaction.chapter8.pizza.domain.Order;
import com.springinaction.chapter8.pizza.service.OrderService;

public class OrderServiceImpl implements OrderService{

	private static final Logger LOGGER = LogManager.getLogger(OrderServiceImpl.class);
	
	public OrderServiceImpl() {}
	
	@Override
	public void saveOrder(Order order) {
		LOGGER.debug("SAVING ORDER: ");
		LOGGER.debug("   Customer: " + order.getCustomer().getName());
		LOGGER.debug("   # of Pizzas: " + order.getPizzas().size());
		LOGGER.debug("   Payment: " + order.getPayment());
	}
}
