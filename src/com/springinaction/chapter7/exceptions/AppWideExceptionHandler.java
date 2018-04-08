package com.springinaction.chapter7.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {

	@ExceptionHandler(DuplicateSpittleException.class)
	public String handleDuplicateSpittle() {
		System.out.println("handleDuplicateSpittle...................");
		return "error/duplicate";
	}
}
