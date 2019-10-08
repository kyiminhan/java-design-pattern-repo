package com.core.java.design.pattern011.state;

/**
 * The Class InTransition.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern011.state <BR>
 *        InTransition.java <BR>
 */
public class InTransition implements PackageState {

	/** The instance. */
	// Singleton
	private static InTransition instance = new InTransition();

	/**
	 * Instantiates a new in transition.
	 */
	private InTransition() {
	}

	/**
	 * Instance.
	 *
	 * @return InTransition
	 */
	public static InTransition instance() {
		return InTransition.instance;
	}

	/**
	 * Update state.
	 *
	 * @param ctx the ctx
	 */
	// Business logic and state transition
	@Override
	public void updateState(final DeliveryContext ctx) {
		System.out.println("Package is in transition !!");
		ctx.setCurrentState(OutForDelivery.instance());
	}
}