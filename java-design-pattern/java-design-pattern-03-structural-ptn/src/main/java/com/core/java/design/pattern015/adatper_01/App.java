package com.core.java.design.pattern015.adatper_01;

import lombok.extern.log4j.Log4j2;

/**
 * The Class App. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper <BR>
 *        App.java <BR>
 */
@Log4j2
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		App.log.info("Creating drawing of shapes...");

		final Drawing drawing = new Drawing();

		drawing.addShape(new Rectangle());

		drawing.addShape(new Circle());

		App.log.info("Drawing...");

		drawing.draw();

		App.log.info("Resizing...");

		drawing.resize();
	}
}