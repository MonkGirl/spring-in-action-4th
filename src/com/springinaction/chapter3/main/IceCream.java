/**
 * 
 */
package com.springinaction.chapter3.main;

import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component("iceCream")
public class IceCream implements Dessert{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter3.main.Dessert#goDinner()
	 */
	@Override
	public void goDinner() {
		System.out.println(this.getClass().getSimpleName());
	}

}
