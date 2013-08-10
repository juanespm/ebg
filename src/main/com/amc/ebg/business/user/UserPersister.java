package com.amc.ebg.business.user;

import ch.swissbytes.commons.persistence.Persister;

import java.util.Date;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.core.Events;
import org.joda.time.DateTime;

import com.amc.ebg.dao.EntityPersister;


import com.amc.ebg.util.EventUtils;
import com.amc.ebg.util.Passwords;

/**
 * @author Timoteo Ponce
 *
 */
@Name(UserPersister.NAME)
public class UserPersister {

	private static final String GENERATED_PWD = "gEnEraTED";

	public static final String NAME = "userPersister";

	public static final String USER_CREATED = "USER_CREATED";

	@In(create=true,value=EntityPersister.NAME)
	private Persister persister;

	@In
	private Events events;

	public UserPersister() {
	}

//	public void persist(final Users2 user, final boolean generatePassword) {
//		//user.setExpirationDate(new DateTime().plusDays(30).toDate());
//		if (user.getId() == null) {
////			user.setRegistrationDate(new Date());
////			user.setStatus(StatusEnum.ACTIVE.getEntity(persister));
//		}
//        String pwd = generatePassword ? GENERATED_PWD : user.getPassword();
//        user.setPassword(Passwords.hash(pwd));
//		persister.persist(user);
//		EventUtils.raiseEvent(events, USER_CREATED, 10, user);
//	}
//
//	public static final boolean hasAGeneratedPassword(final Users2 user){
//        return user.getPassword().equals(Passwords.hash(GENERATED_PWD));
//	}

}
