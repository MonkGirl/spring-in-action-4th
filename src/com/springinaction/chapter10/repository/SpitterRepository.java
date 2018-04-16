package com.springinaction.chapter10.repository;

import com.springinaction.chapter5.spittr.entity.Spitter;

public interface SpitterRepository {

	public void addSpitter(Spitter spitter);
	
	public Spitter findOne(long id);
}
