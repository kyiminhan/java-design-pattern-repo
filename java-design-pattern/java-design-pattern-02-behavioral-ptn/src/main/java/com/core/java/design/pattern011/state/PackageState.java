package com.core.java.design.pattern011.state;

/**
 * The Interface PackageState.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern011.state <BR>
 *        PackageState.java <BR>
 */
public interface PackageState {

	/**
	 * Update state.
	 *
	 * @param ctx the ctx
	 */
	void updateState(DeliveryContext ctx);
}