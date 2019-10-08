package com.core.java.design.pattern013.template;

/**
 * The Class GlassWallHouse.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern013.template <BR>
 *        GlassWallHouse.java <BR>
 */
public class GlassWallHouse extends House {

	/**
	 * Decorate house.
	 */
	@Override
	public void decorateHouse() {
		System.out.println("Decorating Glass Wall House");
	}

	/**
	 * Paint house.
	 */
	@Override
	public void paintHouse() {
		System.out.println("Painting Glass Wall House");
	}

	/**
	 * Construct doors.
	 */
	@Override
	public void constructDoors() {
		System.out.println("Constructing Doors for Glass Wall House");
	}

	/**
	 * Construct windows.
	 */
	@Override
	public void constructWindows() {
		System.out.println("Constructing Windows for Glass Wall House");
	}

	/**
	 * Construct walls.
	 */
	@Override
	public void constructWalls() {
		System.out.println("Constructing Glass Wall for my House");
	}
}