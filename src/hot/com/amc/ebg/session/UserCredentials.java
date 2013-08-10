package com.amc.ebg.session;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.security.Credentials;

/**
 * @author Alvaro Cardozo
 */
@Name(UserCredentials.NAME)
@Scope(ScopeType.SESSION)
public class UserCredentials extends Credentials {

	/**
     *
     */
	private static final long serialVersionUID = 4464691443547679234L;

	public static final String NAME = "org.jboss.seam.security.credentials";

	// private Account account;

	// private Users user;

	private boolean forceLogin;

	// public void setUser(final Users user) {
	// // this.user = new Users2();
	// // this.user.setId(user.getId());
	// //this.user.setLocation(user.getLocation());
	// //setAccount(user.getAccount());
	// }

	// public void setAccount(final Account account) {
	// this.account = new Account();
	// this.account.setId(account.getId());
	// this.account.setName(account.getName());
	// }

	// public Account getAccount() {
	// return account;
	// }

	// public Users getUser() {
	// return user;
	// }

	public void setForceLogin(final boolean forceLogin) {
		this.forceLogin = forceLogin;
	}

	public boolean isForceLogin() {
		return forceLogin;
	}

}
