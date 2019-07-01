package com.core.java.deisgn.pattern003.factory;

/**
 * The Class CarFactory. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern003.factory <BR>
 *        CarFactory.java <BR>
 */
public class CarFactory {

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
			car = new SmallCar();
			break;

		case SEDAN:
			car = new SedanCar();
			break;

		case LUXURY:
			car = new LuxuryCar();
			break;

		default:
			// throw some exception
			break;
		}
		return car;
	}
}