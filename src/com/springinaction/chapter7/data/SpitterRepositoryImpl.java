package com.springinaction.chapter7.data;

import org.springframework.stereotype.Repository;

import com.springinaction.chapter5.spittr.entity.Spitter;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;

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

}
