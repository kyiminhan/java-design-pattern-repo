package com.core.java.design.pattern003.factory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class SedanCar.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.factory <BR>
 *        SedanCar.java <BR>
 */

@Log4j2
public class SedanCar extends Car {

	/**
	 * Instantiates a new sedan car.
	 */
	public SedanCar() {
		super(CarType.SEDAN);
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