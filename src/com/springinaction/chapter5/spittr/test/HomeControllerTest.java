/**
 * 
 */
package com.springinaction.chapter5.spittr.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.springinaction.chapter5.spittr.web.HomeController;

/**
 * @author MonkGirl
 *
 */

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
//		assertEquals("home", controller.home());
	}

}
