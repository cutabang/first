package com.blanker.ee6.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import com.blanker.ee6.model.Actor;

@Stateless
public class ActorDAOImpl implements ActorDAO {
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void saveActor(Actor actor) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(actor);
	}

}
