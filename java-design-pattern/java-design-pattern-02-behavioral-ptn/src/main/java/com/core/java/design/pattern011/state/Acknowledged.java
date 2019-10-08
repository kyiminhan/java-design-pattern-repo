package com.core.java.design.pattern011.state;

/**
 * The Class Acknowledged.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern011.state <BR>
 *        Acknowledged.java <BR>
 */
public class Acknowledged implements PackageState {

	/** The instance. */
	// Singleton
	private static Acknowledged instance = new Acknowledged();

	/**
	 * Instantiates a new acknowledged.
	 */
	private Acknowledged() {
	}

	/**
	 * Instance.
	 *
	 * @return Acknowledged
	 */
	public static Acknowledged instance() {
		return Acknowledged.instance;
	}

	/**
	 * Update state.
	 *
	 * @param ctx the ctx
	 */
	// Business logic and state transition
	@Override
	public void updateState(final DeliveryContext ctx) {
		System.out.println("Package is acknowledged !!");
		ctx.setCurrentState(Shipped.instance());
	}
}