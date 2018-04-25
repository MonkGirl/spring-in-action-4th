package com.springinaction.chapter9.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;
import com.springinaction.chapter9.repository.SpitterRepository;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository{

	@Override
	public Spitter save(Spitter spitter) throws DuplicateSpittleException {
		// TODO Auto-generated method stub
		if("1".equals(spitter.getUsername())) {
			throw new DuplicateSpittleException();
		}
		return spitter;
	}

	@Override
	public Spitter findByUsername(String username) {
		// TODO Auto-generated method stub
		return new Spitter("jbauer", "24hours", "Jack", "Bauer");
	}

	@Override
	public List<Spitter> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
