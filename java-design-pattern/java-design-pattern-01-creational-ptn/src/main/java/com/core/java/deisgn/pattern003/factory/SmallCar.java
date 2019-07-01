package com.core.java.deisgn.pattern003.factory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class SmallCar. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern003.factory <BR>
 *        SmallCar.java <BR>
 */
@Log4j2
public class SmallCar extends Car {

	/**
	 * Instantiates a new small car.
	 */
	public SmallCar() {
		super(CarType.SMALL);
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