package com.core.java.design.pattern003.abstractFactory;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Car.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern003.abstractFactory <BR>
 *        Car.java <BR>
 */
@Getter
@Setter
public abstract class Car {

	/**
	 * Instantiates a new car.
	 *
	 * @param model    the model
	 * @param location the location
	 */
	public Car(final CarType model, final Location location) {
		this.model = model;
		this.location = location;
	}

	/**
	 * Construct.
	 */
	protected abstract void construct();

	/** The model. */
	private CarType model = null;

	/** The location. */
	private Location location = null;

	/**
	 * To string.
	 *
	 * @return String
	 */
	@Override
	public String toString() {
		return "Model- " + this.model + " built in " + this.location;
	}
}