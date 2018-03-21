/**
 * 
 */
package com.springinaction.chapter3.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author MonkGirl
 *
 */
@Configuration
@ComponentScan
@PropertySource("classpath:/com/springinaction/chapter3/resources/computer.properties")
public class ComputerConfig {

}
