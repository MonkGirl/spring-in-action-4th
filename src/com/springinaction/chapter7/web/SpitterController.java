package com.springinaction.chapter7.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springinaction.chapter5.spittr.entity.Spitter;
import com.springinaction.chapter7.data.SpitterRepository;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	private SpitterRepository spitterRepository;

	public SpitterController() {
		super();
	}

	@Autowired
	public SpitterController(SpitterRepository repository) {
		spitterRepository = repository;
	}

	// @RequestMapping(value="/register", method=GET)
	// public String showRegistrationForm() {
	// return "registerForm";
	// }

	@RequestMapping(value = "/register", method = GET)
	public String showRegistrationForm(Model model) {
		model.addAttribute(new Spitter());
		return "registerForm";
	}

	// @RequestMapping(value="/register", method=POST)
	// public String processRegistration(Spitter spitter){
	// spitterRepository.save(spitter);
	// return "redirect:/spitter/"+spitter.getUsername();
	// }

	@RequestMapping(value = "/{username}", method = GET)
	public String showSpitterProfile(@PathVariable String username, Model model) {
		if(!model.containsAttribute("spitter")) {
			Spitter spitter = spitterRepository.findByUsername(username);
			model.addAttribute(spitter);
		}
		return "profile";
	}

	@RequestMapping(value = "/register", method = POST)
	public String processRegistration(@Valid Spitter spitter,
			@RequestPart("profilePicture") MultipartFile profilePicture, Errors errors, RedirectAttributes model)
			throws IllegalStateException, IOException, DuplicateSpittleException {// 启用校验
		if(errors.hasErrors()) {
			return "registerForm";
		}
		
		//异常处理
		//throw new SpittleNotFoundException();
		spitterRepository.save(spitter);
		//profilePicture.transferTo(new File("/data/"+profilePicture.getOriginalFilename()));//file读取路径直接从work/catalina下读取
		//return "redirect:/spitter/" + spitter.getUsername();
		model.addAttribute("username", spitter.getUsername());
		model.addAttribute("spitterId", spitter.getId());
		model.addFlashAttribute(spitter);
		return "redirect:/spitter/{username}";
	}
	
//	@ExceptionHandler(DuplicateSpittleException.class)
//	public String handleDuplicateSpittle() {
//		System.out.println("handleDuplicateSpittle...................");
//		return "error/duplicate";
//	}
}
