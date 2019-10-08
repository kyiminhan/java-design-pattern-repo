package com.core.java.design.pattern013.template;

/**
 * The Class House.<BR>
 * * abstract class House containing template method buildHouse and
 * implementation of steps which is same for all types of houses. Those
 * implementations have been marked as final.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern013.template <BR>
 *        House.java <BR>
 */
public abstract class House {
	/**
	 * This is the template method we are discussing. This method should be final so
	 * that other class can't re-implement and change the order of the steps.
	 */
	public final void buildhouse() {
		this.constructBase();
		this.constructRoof();
		this.constructWalls();
		this.constructWindows();
		this.constructDoors();
		this.paintHouse();
		this.decorateHouse();
	}

	/**
	 * Decorate house.
	 */
	public abstract void decorateHouse();

	/**
	 * Paint house.
	 */
	public abstract void paintHouse();

	/**
	 * Construct doors.
	 */
	public abstract void constructDoors();

	/**
	 * Construct windows.
	 */
	public abstract void constructWindows();

	/**
	 * Construct walls.
	 */
	public abstract void constructWalls();

	/**
	 * final implementation of constructing roof - final as all type of house Should
	 * build roof in same manner.
	 */
	private final void constructRoof() {
		System.out.println("Roof has been constructed.");
	}

	/**
	 * final implementation of constructing base - final as all type of house Should
	 * build base/foundation in same manner.
	 */
	private final void constructBase() {
		System.out.println("Base has been constructed.");
	}
}