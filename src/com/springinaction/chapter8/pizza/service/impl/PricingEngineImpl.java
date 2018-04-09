package com.springinaction.chapter8.pizza.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.springinaction.chapter8.pizza.domain.Order;
import com.springinaction.chapter8.pizza.domain.Pizza;
import com.springinaction.chapter8.pizza.domain.PizzaSize;
import com.springinaction.chapter8.pizza.service.PricingEngine;

public class PricingEngineImpl implements PricingEngine, Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2764978483931127500L;

	private static final Logger LOGGER = LogManager.getLogger(PricingEngineImpl.class);
	
	private static Map<PizzaSize, Float> SIZE_PRICES;
	
	static {
		SIZE_PRICES = new HashMap<PizzaSize, Float>();
		SIZE_PRICES.put(PizzaSize.SMALL, 6.99f);
		SIZE_PRICES.put(PizzaSize.MEDIUM, 7.99f);
		SIZE_PRICES.put(PizzaSize.LARGE, 8.99f);
		SIZE_PRICES.put(PizzaSize.GINORMOUS, 9.99f);
	}
	
	private static float PRICE_PER_TOPPING = 0.20f;
	
	public PricingEngineImpl() {}
	
	@Override
	public float calculateOrderTotal(Order order) {
		LOGGER.debug("Calculating order total");
		
		float total = 0.0f;
		
		for(Pizza pizza : order.getPizzas()) {
			float pizzaPrice = SIZE_PRICES.get(pizza.getSize());
			if(pizza.getToppings().size()>2) {
				pizzaPrice += (pizza.getToppings().size()*PRICE_PER_TOPPING);
			}
			total += pizzaPrice;
		}
		return total;
	}

}
