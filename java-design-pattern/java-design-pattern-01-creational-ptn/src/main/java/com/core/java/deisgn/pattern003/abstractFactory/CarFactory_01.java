package com.core.java.deisgn.pattern003.abstractFactory;

/**
 * The Class CarFactory_01. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern003.abstractFactory <BR>
 *        CarFactory_01.java <BR>
 */
public class CarFactory_01 {

	/**
	 * Instantiates a new car factory 01.
	 */
	private CarFactory_01() {
		// Prevent instantiation
	}

	/**
	 * Builds the car.
	 *
	 * @param type the type
	 * @return Car
	 */
	public static Car buildCar(final CarType type) {
		Car car = null;
		final Location location = Location.ASIA;
		// Read location property somewhere from configuration
		// Use location specific car factory
		switch (location) {
		case USA:
			car = USACarFactory.buildCar(type);
			break;
		case ASIA:
			car = AsiaCarFactory.buildCar(type);
			break;
		default:
			car = DefaultCarFactory.buildCar(type);
		}
		return car;
	}
}