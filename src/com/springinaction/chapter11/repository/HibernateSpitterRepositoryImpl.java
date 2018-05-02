package com.springinaction.chapter11.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter11.factory.HibernateSessionFactory;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;
import com.springinaction.chapter9.repository.SpitterRepository;

@Repository
public class HibernateSpitterRepositoryImpl implements SpitterRepository{

	@Autowired
	private HibernateSessionFactory sessionFactory;
	
	public HibernateSpitterRepositoryImpl(HibernateSessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getSession() throws HibernateException {
		return sessionFactory.sessionFactory().getObject().getCurrentSession();
	}

	@Transactional
	public List<Spitter> findAll() {
		Criteria criteria = getSession().createCriteria(Spitter.class);
		return criteria.list();
	}

	public Long count() {
		return (long) findAll().size();
	}

	public Spitter findByUsername(String username) {
		return null;
	}
	

	@Override
	public Spitter save(Spitter spitter) throws DuplicateSpittleException {
		// TODO Auto-generated method stub
		return null;
	}
}
