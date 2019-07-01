package com.core.java.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * The Class EagerSingleton. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.java.singleton <BR>
 *        EagerSingleton.java <BR
 */
@Log4j2
public class EagerSingleton {

	/** The instance. */
	private static volatile EagerSingleton instance = new EagerSingleton();

	/**
	 * Gets the instance.
	 *
	 * @return the instance
	 */
	public static EagerSingleton getInstance() {
		return EagerSingleton.instance;
	}

	/**
	 * Instantiates a new eager singleton.
	 */
	// private constructor
	private EagerSingleton() {
	}

	/**
	 * Show.
	 */
	public void show() {
		EagerSingleton.log.info("show() method in the " + this.getClass());
	}
}