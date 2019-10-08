package com.core.java.design.pattern013.template;

/**
 * The Class ConcreteWallHouse.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern013.template <BR>
 *        ConcreteWallHouse.java <BR>
 */
public class ConcreteWallHouse extends House {

	/**
	 * Decorate house.
	 */
	@Override
	public void decorateHouse() {
		System.out.println("Decorating Concrete Wall House");
	}

	/**
	 * Paint house.
	 */
	@Override
	public void paintHouse() {
		System.out.println("Painting Concrete final Wall House");
	}

	/**
	 * Construct doors.
	 */
	@Override
	public void constructDoors() {
		System.out.println("Constructing Doors for Concrete Wall House");
	}

	/**
	 * Construct windows.
	 */
	@Override
	public void constructWindows() {
		System.out.println("Constructing Windows for Concrete Wall House");
	}

	/**
	 * Construct walls.
	 */
	@Override
	public void constructWalls() {
		System.out.println("Constructing Concrete Wall for my House");
	}
}