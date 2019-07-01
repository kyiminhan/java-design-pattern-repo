package com.core.java.deisgn.pattern003.abstractFactory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class SedanCar. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern003.abstractFactory <BR>
 *        SedanCar.java <BR>
 */

/** The Constant log. */
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