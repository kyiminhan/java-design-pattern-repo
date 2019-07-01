package com.core.java.design.pattern001.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * The Enum EnumSingleton.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern001.singleton <BR>
 *        EnumSingleton.java <BR>
 */
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