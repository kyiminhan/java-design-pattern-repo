package com.core.java.design.pattern015.adatper_02;

/**
 * The Interface SocketAdapter. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper_02 <BR>
 *        SocketAdapter.java <BR>
 */
public interface SocketAdapter {

	/**
	 * Gets the 120 volt.
	 *
	 * @return the 120 volt
	 */
	Volt get120Volt();

	/**
	 * Gets the 12 volt.
	 *
	 * @return the 12 volt
	 */
	Volt get12Volt();

	/**
	 * Gets the 3 volt.
	 *
	 * @return the 3 volt
	 */
	Volt get3Volt();
}