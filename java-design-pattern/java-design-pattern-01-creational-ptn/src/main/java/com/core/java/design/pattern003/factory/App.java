package com.core.java.design.pattern003.factory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.factory <BR>
 *        App.java <BR>
 */

@Log4j2
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String... args) {

		App.log.info(CarFactory.buildCar(CarType.SMALL));
		App.log.info(CarFactory.buildCar(CarType.SEDAN));
		App.log.info(CarFactory.buildCar(CarType.LUXURY));

	}
}