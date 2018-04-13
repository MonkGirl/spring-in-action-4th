package com.springinaction.chapter9.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springinaction.chapter5.spittr.entity.Spitter;

@Controller
//@RequestMapping("/spitter")
public class SpitterController {

	@RequestMapping(value = "/main", method = GET)
	public String showRegistrationForm(Model model) {
		model.addAttribute(new Spitter());
		return "main";
	}
	
//	@RequestMapping(value="/save",method = POST)
//	public String save(@Valid Spitter spitter) {
//		System.out.println(spitter.getUsername());
//		return "success";
//	}
}
