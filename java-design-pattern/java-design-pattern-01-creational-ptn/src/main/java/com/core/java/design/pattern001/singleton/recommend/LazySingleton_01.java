package com.core.java.design.pattern001.singleton.recommend;

import lombok.extern.log4j.Log4j2;

/**
 * The Class LazySingleton_01. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern001.singleton.recommend <BR>
 *        LazySingleton_01.java <BR>
 */
@Log4j2
public class LazySingleton_01 {

	/** The instance. */
	private static volatile LazySingleton_01 instance = null;

	/**
	 * Gets the instance.
	 *
	 * @return the instance
	 */
	public static LazySingleton_01 getInstance() {
		if (LazySingleton_01.instance == null) {
			synchronized (LazySingleton_01.class) {
				LazySingleton_01.instance = new LazySingleton_01();
			}
		}
		return LazySingleton_01.instance;
	}

	/**
	 * Read resolve.
	 *
	 * @return Object
	 */
	protected Object readResolve() {
		return LazySingleton_01.getInstance();
	}

	/**
	 * Instantiates a new lazy singleton 01.
	 */
	// private constructor
	private LazySingleton_01() {
	}

	/**
	 * Show.
	 */
	public void show() {
		LazySingleton_01.log.info("show() method in the " + this.getClass());
	}
}