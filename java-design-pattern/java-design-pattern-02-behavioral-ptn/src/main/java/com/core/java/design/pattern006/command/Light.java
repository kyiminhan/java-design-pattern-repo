package com.core.java.design.pattern006.command;

import lombok.extern.log4j.Log4j2;

/**
 * The Class Light. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        Light.java <BR>
 */
@Log4j2
public class Light {

	/**
	 * Turn on.
	 */
	public void turnOn() {
		Light.log.info("Light is on");
	}

	/**
	 * Turn off.
	 */
	public void turnOff() {
		Light.log.info("Light is off");
	}
}