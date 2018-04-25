package com.springinaction.chapter9.services;

import java.util.List;

import com.springinaction.chapter11.entity.Spitter;


public interface SpitterService {
	
	public Spitter findByUsername(String username);
	
	public List<Spitter> findAll();
}
