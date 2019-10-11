package com.core.java.design.pattern015.adatper_01;

/**
 * The Interface Shape. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper <BR>
 *        Shape.java <BR>
 */
public interface Shape {

	/**
	 * Draw.
	 */
	void draw();

	/**
	 * Resize.
	 */
	void resize();

	/**
	 * Description.
	 *
	 * @return String
	 */
	String description();

	/**
	 * Checks if is hide.
	 *
	 * @return true, if is hide
	 */
	boolean isHide();
}