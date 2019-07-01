package com.core.java.design.pattern003.abstractFactory;

/**
 * The Class DefaultCarFactory.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.abstractFactory <BR>
 *        DefaultCarFactory.java <BR>
 */
public class DefaultCarFactory {

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
			car = new SmallCar(Location.DEFAULT);
			break;

		case SEDAN:
			car = new SedanCar(Location.DEFAULT);
			break;

		case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;

		default:
			// throw some exception
			break;
		}
		return car;
	}
}