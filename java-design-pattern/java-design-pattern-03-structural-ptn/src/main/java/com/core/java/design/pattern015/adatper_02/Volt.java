package com.core.java.design.pattern015.adatper_02;

/**
 * The Class Volt. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper_02 <BR>
 *        Volt.java <BR>
 */
public class Volt {

	/** The volts. */
	private int volts;

	/**
	 * Instantiates a new volt.
	 *
	 * @param v the v
	 */
	public Volt(final int v) {
		this.volts = v;
	}

	/**
	 * Gets the volts.
	 *
	 * @return the volts
	 */
	public int getVolts() {
		return this.volts;
	}

	/**
	 * Sets the volts.
	 *
	 * @param volts the new volts
	 */
	public void setVolts(final int volts) {
		this.volts = volts;
	}
}