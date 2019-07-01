package com.core.java.deisgn.pattern003.factory;

import lombok.extern.log4j.Log4j2;

/**
 * The Class LuxuryCar. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern003.factory <BR>
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