package com.core.java.design.pattern001.singleton.recommend;

import lombok.extern.log4j.Log4j2;

/**
 * The Class LazySingleton_02. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern001.singleton.recommend <BR>
 *        LazySingleton_02.java <BR>
 */
@Log4j2
public class LazySingleton_02 {

	/** The instance. */
	private static volatile LazySingleton_02 instance = null;

	/**
	 * Gets the instance.
	 *
	 * @return the instance
	 */
	public static LazySingleton_02 getInstance() {
		if (LazySingleton_02.instance == null) {
			synchronized (LazySingleton_02.class) {
				// Double check
				if (LazySingleton_02.instance == null) {
					LazySingleton_02.instance = new LazySingleton_02();
				}
			}
		}
		return LazySingleton_02.instance;
	}

	/**
	 * Read resolve.
	 *
	 * @return Object
	 */
	protected Object readResolve() {
		return LazySingleton_02.getInstance();
	}

	/**
	 * Instantiates a new lazy singleton 02.
	 */
	// private constructor
	private LazySingleton_02() {
	}

	/**
	 * Show.
	 */
	public void show() {
		LazySingleton_02.log.info("show() method in the " + this.getClass());
	}
}