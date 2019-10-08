package com.core.java.design.pattern011.state;

/**
 * The Class Delivered.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern011.state <BR>
 *        Delivered.java <BR>
 */
public class Delivered implements PackageState {

	/** The instance. */
	// Singleton
	private static Delivered instance = new Delivered();

	/**
	 * Instantiates a new delivered.
	 */
	private Delivered() {
	}

	/**
	 * Instance.
	 *
	 * @return Delivered
	 */
	public static Delivered instance() {
		return Delivered.instance;
	}

	/**
	 * Update state.
	 *
	 * @param ctx the ctx
	 */
	// Business logic
	@Override
	public void updateState(final DeliveryContext ctx) {
		System.out.println("Package is delivered!!");
	}
}