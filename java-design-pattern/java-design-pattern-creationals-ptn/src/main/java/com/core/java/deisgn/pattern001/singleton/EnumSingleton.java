package com.core.java.deisgn.pattern001.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * The Enum EnumSingleton. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern001.singleton <BR>
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