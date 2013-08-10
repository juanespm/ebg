package com.amc.ebg.notification.mail;


import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amc.ebg.business.user.UserPersister;
import com.amc.ebg.dao.EntityPersister;

import com.amc.ebg.properties.Configuration;

/**
 * @author Timoteo Ponce
 */
@AutoCreate
@Name(NotificationsListener.NAME)
public class NotificationsListener {

	public static final String NAME = "notificationsListener";

	private static final Logger LOG = LoggerFactory.getLogger(NotificationsListener.class);

	@In(create = true, value = EntityPersister.NAME)
	private EntityPersister persister;

	@In(create = true, value = Configuration.NAME)
	private Configuration configuration;

//	@Observer(create = true, value = UserPersister.USER_CREATED)
//	public void userCreated(final Users user) {
//		try {
//			HtmlEmail email = new HtmlEmail();
//            new NewUserMailSender(configuration, email, persister)
//					.sendMail(user);
//		} catch (EmailException e) {
//			LOG.error("USER_CREATED notification mail couldn't be sent : " + user.getEmail() + ", " + e,e);
//		}
//	}

}
