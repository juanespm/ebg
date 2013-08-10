package com.amc.ebg.domain.types;

/**
 * @author Timoteo Ponce
 * 
 */
public enum GenderType {

	MALE(1), FEMALE(2);

	private final int id;

	private GenderType(int id) {
		this.id = id;
	}

	public int id() {
		return id;
	}

}
