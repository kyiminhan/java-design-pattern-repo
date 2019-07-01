package com.core.java.design.pattern003.abstractFactory;

/**
 * The Class USACarFactory.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.abstractFactory <BR>
 *        USACarFactory.java <BR>
 */
public class USACarFactory {

	/**
	 * Builds the car.
	 *
	 * @param model the model
	 * @return Car
	 */
	public static Car buildCar(final CarType model) {

		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.USA);
			break;

		case SEDAN:
			car = new SedanCar(Location.USA);
			break;

		case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;

		default:
			// throw some exception
			break;
		}
		return car;
	}
}