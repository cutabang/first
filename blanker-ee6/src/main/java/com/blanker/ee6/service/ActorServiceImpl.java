package com.blanker.ee6.service;

import javax.inject.Inject;

import com.blanker.ee6.dao.ActorDAO;
import com.blanker.ee6.model.Actor;

public class ActorServiceImpl implements ActorService {
	@Inject
	private ActorDAO actorDAO;

	@Override
	public void save(Actor actor) {
		actorDAO.saveActor(actor);

	}

	/*public ActorDAO getActorDAO() {
		return actorDAO;
	}

	public void setActorDAO(ActorDAO actorDAO) {
		this.actorDAO = actorDAO;
	}*/

}
