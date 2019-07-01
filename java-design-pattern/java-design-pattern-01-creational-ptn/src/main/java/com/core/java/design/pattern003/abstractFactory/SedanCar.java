package com.core.java.design.pattern003.abstractFactory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class SedanCar.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.abstractFactory <BR>
 *        SedanCar.java <BR>
 */

@Log4j2
public class SedanCar extends Car {

	/**
	 * Instantiates a new sedan car.
	 *
	 * @param location the location
	 */
	public SedanCar(final Location location) {
		super(CarType.SEDAN, location);
		this.construct();
	}

	/**
	 * Construct.
	 */
	@Override
	protected void construct() {
		SedanCar.log.info("Building sedan car");
	}
}