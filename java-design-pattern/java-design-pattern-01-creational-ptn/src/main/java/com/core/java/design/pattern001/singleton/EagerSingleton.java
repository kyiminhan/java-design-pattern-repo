package com.core.java.design.pattern001.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * The Class EagerSingleton.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern001.singleton <BR>
 *        EagerSingleton.java <BR>
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