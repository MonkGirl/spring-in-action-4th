package com.springinaction.chapter5.spittr.data;

import org.springframework.stereotype.Repository;

import com.springinaction.chapter5.spittr.entity.Spitter;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository{

	@Override
	public Spitter save(Spitter spitter) {
		// TODO Auto-generated method stub
		return spitter;
	}

	@Override
	public Spitter findByUsername(String username) {
		// TODO Auto-generated method stub
		return new Spitter("jbauer", "24hours", "Jack", "Bauer");
	}

}
