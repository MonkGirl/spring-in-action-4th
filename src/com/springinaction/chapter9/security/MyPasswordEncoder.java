package com.springinaction.chapter9.security;

import java.security.SecureRandom;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder{
	
	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(17, new SecureRandom());
	
	@Override
	public String encode(CharSequence rawPassword) {
		//使用BCryptPasswordEncoder加密
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(17, new SecureRandom());
//		String encode = encoder.encode(rawPassword);
//		System.out.println(encode);
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
//		System.out.println("rawPassword:"+rawPassword);
//		System.out.println("encodedPassword:"+encodedPassword);
//		return encoder.matches(rawPassword, encodedPassword);
		return rawPassword.equals(encodedPassword);
	}

}
