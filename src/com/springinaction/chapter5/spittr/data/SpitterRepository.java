package com.springinaction.chapter5.spittr.data;

import com.springinaction.chapter5.spittr.entity.Spitter;

public interface SpitterRepository {
	Spitter save(Spitter spitter);
	
	Spitter findByUsername(String username);
}
