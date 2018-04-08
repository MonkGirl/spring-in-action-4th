package com.springinaction.chapter7.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="Duplicate Spittle Exception")
public class DuplicateSpittleException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2197976295023619871L;

}
