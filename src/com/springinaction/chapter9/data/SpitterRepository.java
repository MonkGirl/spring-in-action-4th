package com.springinaction.chapter9.data;

import com.springinaction.chapter5.spittr.entity.Spitter;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;

public interface SpitterRepository {
	Spitter save(Spitter spitter) throws DuplicateSpittleException ;
	
	Spitter findByUsername(String username);
}
