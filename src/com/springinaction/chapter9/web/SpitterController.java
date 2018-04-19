package com.springinaction.chapter9.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springinaction.chapter5.spittr.entity.Spitter;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

	@RequestMapping(value = "/main", method = GET)
	public String showRegistrationForm(Model model) {
		model.addAttribute(new Spitter());
		return "main";
	}
	
	@RequestMapping(value="/logout", method = GET)
	public String login(@Valid Spitter spitter) {
		return "main";
	}
	
	@RequestMapping(value="/loginSuccess", method = GET)
	public String loginSuccess(@Valid Spitter spitter) {
		return "success";
	}
	
	@RequestMapping(value="/loginFailure", method = GET)
	public String loginFailure(@Valid Spitter spitter) {
		return "failure";
	}
	
	@RequestMapping(value="/me", method = GET)
	public String showMe(@Valid Spitter spitter) {
		return "showMe";
	}
	
	@RequestMapping(value="/others", method = GET)
	public String showOthers(@Valid Spitter spitter) {
		return "showOthers";
	}
}
