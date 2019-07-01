package com.java.singleton;

import lombok.extern.log4j.Log4j2;

/** The Constant log. */
@Log4j2
public enum EnumSingleton {

	/** The instance. */
	INSTANCE;

	/**
	 * Show.
	 */
	public void show() {
		EnumSingleton.log.info("show() method in the " + this.getClass());
	}
}