package com.amc.ebg.notification.mail;

import ch.swissbytes.commons.persistence.Persister;

import org.apache.commons.mail.HtmlEmail;


import com.amc.ebg.properties.Configuration;

/**
 * @author Timoteo Ponce
 *
 */
public class NewUserMailSender extends NotificationMailSender{

	public static final String NAME = "newUserMailSender";

	private final Configuration configuration;

    private final Persister persister;

    public NewUserMailSender(final Configuration configuration, final HtmlEmail email, final Persister persister) {
        super(configuration, email);
		this.configuration = configuration;
		this.persister = persister;
	}

//	@Override
//	protected String getReceiverEmail() {
//		return getSource().getEmail();
//	}

//	@Override
//	protected void replaceVars(final StringBuilder buffer) {
//		Users user = getSource();
//		LinkHash linkHash = new LinkHashHandler(persister).newLink(LinkActionEnum.ACTIVATE_USER , user);
//		replaceVar(buffer,"${userName}", user.getUserName());
//		replaceVar(buffer,"${newUser.url}",
//				configuration.getString(ConfigurationKey.WEB_ROOT_URL) + "configuration/user/verify_user.action"
//				+"?token="+linkHash.getToken() + "&userId=" + user.getId() + "&action="+linkHash.getLinkAction().getName());
//	}

	@Override
	protected String getTemplateFile() {
		return "new_user";
	}
//
//	@Override
//    protected String getSubject() {
//        return getMessages().getProperty("mail.userCreated") + " - " + getSource().getUserName();
//	}

	@Override
	protected String getReceiverEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void replaceVars(StringBuilder buffer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getSubject() {
		// TODO Auto-generated method stub
		return null;
	}

}
