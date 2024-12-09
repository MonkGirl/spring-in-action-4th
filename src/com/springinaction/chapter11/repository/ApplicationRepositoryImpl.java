package com.springinaction.chapter11.repository;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;
import com.springinaction.chapter9.repository.SpitterRepository;

@Repository
public class ApplicationRepositoryImpl implements SpitterRepository{
	
	//注入EntityManagerFactory工厂
	@PersistenceUnit(unitName="applicationEntityManagerFactoryBean")
	private EntityManagerFactory emf;
	
	@Override
	public Spitter save(Spitter spitter) throws DuplicateSpittleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Spitter findByUsername(String username) {
		String sql = "select * from spitter where username='"+username+"'";
		Query query = emf.createEntityManager().createNativeQuery(sql, Spitter.class);
		return (Spitter) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Spitter> findAll() {
		String sql = "select * from spitter";
		Query query = emf.createEntityManager().createNativeQuery(sql, Spitter.class);
		List<Spitter> list = query.getResultList();
		return list;
	}

}
