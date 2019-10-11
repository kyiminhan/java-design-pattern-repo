package com.core.java.design.pattern015.adatper_01;

import lombok.extern.log4j.Log4j2;

/**
 * The Class Rectangle. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper <BR>
 *        Rectangle.java <BR>
 */
@Log4j2
public class Rectangle implements Shape {

	/**
	 * Draw.
	 */
	@Override
	public void draw() {
		Rectangle.log.info("Drawing Rectangle");
	}

	/**
	 * Resize.
	 */
	@Override
	public void resize() {
		Rectangle.log.info("Resizing Rectangle");
	}

	/**
	 * Description.
	 *
	 * @return String
	 */
	@Override
	public String description() {
		return "Rectangle object";
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