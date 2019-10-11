package com.core.java.design.pattern015.adatper;

import lombok.extern.log4j.Log4j2;

/**
 * The Class Circle. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper <BR>
 *        Circle.java <BR>
 */
@Log4j2
public class Circle implements Shape {

	/**
	 * Draw.
	 */
	@Override
	public void draw() {
		Circle.log.info("Drawing Circle");
	}

	/**
	 * Resize.
	 */
	@Override
	public void resize() {
		Circle.log.info("Resizing Circle");
	}

	/**
	 * Description.
	 *
	 * @return String
	 */
	@Override
	public String description() {
		return "Circle object";
	}

	/**
	 * Checks if is hide.
	 *
	 * @return true, if is hide
	 */
	@Override
	public boolean isHide() {
		return false;
	}
}