/**
 * 
 */
package com.springinaction.chapter3.main;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component("cookies")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("singleton")
public class Cookies implements Dessert{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter3.main.Dessert#goDinner()
	 */
	@Override
	public void goDinner() {
		System.out.println(this.getClass().getSimpleName());
	}

}
