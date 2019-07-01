package com.core.java.deisgn.pattern003.factory;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Car. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern003.factory <BR>
 *        Car.java <BR>
 */
public abstract class Car {

	/**
	 * Instantiates a new car.
	 *
	 * @param model the model
	 */
	public Car(final CarType model) {
		this.model = model;
		this.arrangeParts();
	}

	/**
	 * Arrange parts.
	 */
	private void arrangeParts() {
		// Do one time processing here
	}

	/**
	 * Construct.
	 */
	// Do subclass level processing in this method
	protected abstract void construct();

	/** The model. */

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	@Getter

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	@Setter
	private CarType model = null;

}