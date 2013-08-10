package com.amc.ebg.domain.dto;

/**
 * 
 * @author Alvaro Cardozo.
 * */
public class LoginForm {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public void clear() {
		setPassword(null);
		setUserName(null);
	}
}
