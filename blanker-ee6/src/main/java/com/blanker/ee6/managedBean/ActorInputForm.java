package com.blanker.ee6.managedBean;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import com.blanker.ee6.model.Actor;
import com.blanker.ee6.service.ActorService;

@ManagedBean
@RequestScoped
public class ActorInputForm implements Serializable {

	private static final long serialVersionUID = 4047066283834474400L;
	private Actor actor;
	
	@Inject
	private ActorService actorService;
	
	@PostConstruct
	public void postConstruct() {
		if (actor == null) {
			actor = new Actor();
		}
	}
	
	public String registerActor() {
		actor.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		actorService.save(actor);
		
		return "success";
	}

	public Actor getActor() {
		return actor;
	}


	public void setActor(Actor actor) {
		this.actor = actor;
	}

}
