package com.core.java.design.pattern011.state;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern011.state <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final DeliveryContext ctx = new DeliveryContext(null, "Test123");

		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
	}
}