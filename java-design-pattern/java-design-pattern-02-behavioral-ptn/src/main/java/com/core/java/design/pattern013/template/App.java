package com.core.java.design.pattern013.template;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern013.template <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		System.out.println("Going to final build Concrete final Wall House");

		House house = new ConcreteWallHouse();
		house.buildhouse();

		System.out.println("Concrete Wall House final constructed successfully");

		System.out.println("********************");

		System.out.println("Going to final build Glass final Wall House");

		house = new GlassWallHouse();
		house.buildhouse();

		System.out.println("Glass Wall House constructed successfully");
	}
}