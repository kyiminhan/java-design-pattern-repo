package com.core.java.design.pattern011.state;

/**
 * The Class OutForDelivery.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern011.state <BR>
 *        OutForDelivery.java <BR>
 */
public class OutForDelivery implements PackageState {

	/** The instance. */
	// Singleton
	private static OutForDelivery instance = new OutForDelivery();

	/**
	 * Instantiates a new out for delivery.
	 */
	private OutForDelivery() {
	}

	/**
	 * Instance.
	 *
	 * @return OutForDelivery
	 */
	public static OutForDelivery instance() {
		return OutForDelivery.instance;
	}

	/**
	 * Update state.
	 *
	 * @param ctx the ctx
	 */
	// Business logic and state transition
	@Override
	public void updateState(final DeliveryContext ctx) {
		System.out.println("Package is out of delivery !!");
		ctx.setCurrentState(Delivered.instance());
	}
}