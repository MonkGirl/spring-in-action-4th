package com.springinaction.chapter9.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter9.repository.SpitterRepository;
import com.springinaction.chapter9.services.SpitterService;

@Service
public class SpitterServiceImpl implements SpitterService{

	@Autowired
	//@Qualifier("hibernateSpitterRepositoryImpl")
	@Qualifier("applicationRepositoryImpl")
	private SpitterRepository repository;
	
	@Override
	public List<Spitter> findAll() {
		return repository.findAll();
	}

	@Override
	public Spitter findByUsername(String username) {
		return repository.findByUsername(username);
	}

}
