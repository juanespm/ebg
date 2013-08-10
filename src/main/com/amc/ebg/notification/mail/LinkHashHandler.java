package com.amc.ebg.notification.mail;

import java.util.Date;
import java.util.Random;


import com.amc.ebg.util.Passwords;

import ch.swissbytes.commons.persistence.Persister;

/**
 * @author Timoteo Ponce
 *
 */
public class LinkHashHandler {

	private final Persister persister;

	public LinkHashHandler(Persister persister) {
		this.persister = persister;
	}

//	public LinkHash newLink(LinkActionEnum action, Users detachedUser) {
//		Users user = persister.find(Users.class, detachedUser.getId());
//		String token = Passwords.hash( System.currentTimeMillis() + new Random().nextLong() + "" );
//		LinkHash link = new LinkHash(action.getEntity(persister), user , token, new Date());
//		persister.persist(link);
//		return link;
//	}

}
