package com.core.java.deisgn.pattern001.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * The Class BillPughSingleton. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern001.singleton <BR>
 *        BillPughSingleton.java <BR>
 */
@Log4j2
public class BillPughSingleton {

	/**
	 * The Class LazyHolder. <BR>
	 *
	 * @author KYIMINHAN <BR>
	 * @version 1.0 <BR>
	 * @since 2019/07/01 <BR>
	 *        java-design-pattern-creationals-ptn system <BR>
	 *        com.core.java.deisgn.pattern001.singleton <BR>
	 *        BillPughSingleton.java <BR
	 */
	private static class LazyHolder {

		/** The Constant INSTANCE. */
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	/**
	 * Gets the single instance of BillPughSingleton.
	 *
	 * @return single instance of BillPughSingleton
	 */
	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}

	/**
	 * Instantiates a new bill pugh singleton.
	 */
	private BillPughSingleton() {
	}

	/**
	 * Show.
	 */
	public void show() {
		BillPughSingleton.log.info("show() method in the " + this.getClass());
	}
}