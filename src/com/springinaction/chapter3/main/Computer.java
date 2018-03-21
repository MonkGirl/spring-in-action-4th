/**
 * 
 */
package com.springinaction.chapter3.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component
public class Computer {

	private String cpu;
	private String disk;
	
	public Computer(@Value("${computer.cpu}") String cpu, @Value("${computer.disk}") String disk) {
		this.cpu = cpu;
		this.disk = disk;
	}
	
	public String toString() {
		return "cup: " + cpu + ", disk: " + disk;
	}
}
