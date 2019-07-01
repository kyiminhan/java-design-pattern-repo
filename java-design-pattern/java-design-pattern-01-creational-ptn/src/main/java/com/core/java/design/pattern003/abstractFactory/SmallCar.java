package com.core.java.design.pattern003.abstractFactory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class SmallCar.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.abstractFactory <BR>
 *        SmallCar.java <BR>
 */

@Log4j2
public class SmallCar extends Car {

	/**
	 * Instantiates a new small car.
	 *
	 * @param location the location
	 */
	public SmallCar(final Location location) {
		super(CarType.SMALL, location);
		this.construct();
	}

	/**
	 * Construct.
	 */
	@Override
	protected void construct() {
		SmallCar.log.info("Building small car");
	}
}