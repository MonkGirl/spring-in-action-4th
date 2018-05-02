package com.springinaction.chapter11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springinaction.chapter11.entity.Spitter;

public interface SpitterJpaRepository extends JpaRepository<Spitter, Long>{
	Spitter findByUsername(String username);
}
