package com.core.java.singleton.serialize.readResolve.test;

import java.io.Serializable;

/**
 * The Class DemoSingleton. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.singleton.test <BR>
 *        DemoSingleton.java <BR
 */
public class DemoSingleton implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The instance. */
	private volatile static DemoSingleton instance = null;

	/**
	 * Gets the single instance of DemoSingleton.
	 *
	 * @return single instance of DemoSingleton
	 */
	public static DemoSingleton getInstance() {
		if (DemoSingleton.instance == null) {
			DemoSingleton.instance = new DemoSingleton();
		}
		return DemoSingleton.instance;
	}

	/**
	 * Read resolve.
	 *
	 * @return Object
	 */
	protected Object readResolve() {
		// return DemoSingleton.instance;
		return DemoSingleton.getInstance();
	}

	/** The i. */
	private int i = 10;

	/**
	 * Gets the i.
	 *
	 * @return the i
	 */
	public int getI() {
		return this.i;
	}

	/**
	 * Sets the i.
	 *
	 * @param i the new i
	 */
	public void setI(final int i) {
		this.i = i;
	}
}