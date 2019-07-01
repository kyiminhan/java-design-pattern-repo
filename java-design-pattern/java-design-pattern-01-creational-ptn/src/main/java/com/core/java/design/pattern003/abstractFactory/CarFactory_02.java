package com.core.java.design.pattern003.abstractFactory;

/**
 * The Class CarFactory_02.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.abstractFactory <BR>
 *        CarFactory_02.java <BR>
 */
public class CarFactory_02 {

	/**
	 * Instantiates a new car factory 02.
	 */
	private CarFactory_02() {
		// Prevent instantiation
	}

	/**
	 * Builds the car.
	 *
	 * @param type the type
	 * @return Car
	 */
	public static Car buildCar(final CarType type) {

		final Location location = Location.DEFAULT;
		return CarFactory_02.build(type, location);
	}

	/**
	 * Builds the car.
	 *
	 * @param type     the type
	 * @param location the location
	 * @return Car
	 */
	public static Car buildCar(final CarType type, final Location location) {
		return CarFactory_02.build(type, location);
	}

	/**
	 * Builds the.
	 *
	 * @param type     the type
	 * @param location the location
	 * @return Car
	 */
	private static Car build(final CarType type, final Location location) {

		Car car = null;

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