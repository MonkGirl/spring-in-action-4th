package com.springinaction.chapter11.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;
import com.springinaction.chapter9.repository.SpitterRepository;

@Repository
public class ContainerRepositoryImpl implements SpitterRepository{

	@PersistenceContext(unitName="entityManagerFactory")
	private EntityManager em;
	
	@Override
	public Spitter save(Spitter spitter) throws DuplicateSpittleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Spitter findByUsername(String username) {
		Query query = em.createNativeQuery("select * from spitter where username='"+username+"'", Spitter.class);
		return (Spitter) query.getSingleResult();
	}

	@Override
	public List<Spitter> findAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Spitter> criteria = builder.createQuery(Spitter.class);
		Root<Spitter> root = criteria.from(Spitter.class);
		criteria.select(root);
		return em.createQuery(criteria).getResultList();
	}

}
