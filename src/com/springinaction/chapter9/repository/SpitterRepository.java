package com.springinaction.chapter9.repository;

import java.util.List;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;

public interface SpitterRepository {
	Spitter save(Spitter spitter) throws DuplicateSpittleException ;
	
	Spitter findByUsername(String username);
	
	List<Spitter> findAll();
}
