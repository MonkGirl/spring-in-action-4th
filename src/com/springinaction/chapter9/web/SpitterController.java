package com.springinaction.chapter9.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter9.services.SpitterService;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	
	@Autowired
	private SpitterService spitterService;

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
	
	@ModelAttribute("listAll")
	public List<Spitter> findAll(){
		return spitterService.findAll();
	}
	
	@RequestMapping(value="/findAll", method = GET)
	public String findAll(Model model) {
		List<Spitter> listAll = spitterService.findAll();
		model.addAttribute(listAll);
		return "all";
	}
	
	@RequestMapping(value="/findByUsername", method = GET)
	public String findByUsername(@Valid Spitter spitter, Model model) {
		Spitter resultSpitter = spitterService.findByUsername(spitter.getUsername());
		model.addAttribute(resultSpitter);
		return "someone";
	}
}
