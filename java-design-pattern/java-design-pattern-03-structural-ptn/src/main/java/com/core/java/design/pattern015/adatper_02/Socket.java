package com.core.java.design.pattern015.adatper_02;

/**
 * The Class Socket. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper_02 <BR>
 *        Socket.java <BR>
 */
public class Socket {

	/**
	 * Gets the volt.
	 *
	 * @return the volt
	 */
	public Volt getVolt() {
		return new Volt(120);
	}
}