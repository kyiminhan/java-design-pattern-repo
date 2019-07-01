package com.core.java.design.pattern003.factory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class LuxuryCar.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.factory <BR>
 *        LuxuryCar.java <BR>
 */

@Log4j2
public class LuxuryCar extends Car {

	/**
	 * Instantiates a new luxury car.
	 */
	public LuxuryCar() {
		super(CarType.LUXURY);
		this.construct();
	}

	/**
	 * Construct.
	 */
	@Override
	protected void construct() {
		LuxuryCar.log.info("Building luxury car");
	}
}