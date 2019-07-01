package com.core.java.deisgn.pattern003.factory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class App. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern003.factory <BR>
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