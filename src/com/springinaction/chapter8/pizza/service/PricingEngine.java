package com.springinaction.chapter8.pizza.service;

import com.springinaction.chapter8.pizza.domain.Order;

public interface PricingEngine {
	public float calculateOrderTotal(Order order);
}
