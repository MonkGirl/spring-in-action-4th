/**
 * 
 */
package com.springinaction.chapter2.mixedConfig.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author MonkGirl
 *
 */
@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:/com/springinaction/chapter2/mixedConfig/cd-config.xml")
public class SoundSystemConfig {

}
