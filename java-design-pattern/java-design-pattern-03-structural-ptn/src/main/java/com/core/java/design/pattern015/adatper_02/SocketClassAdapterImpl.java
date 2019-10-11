package com.core.java.design.pattern015.adatper_02;

/**
 * The Class SocketClassAdapterImpl. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper_02 <BR>
 *        SocketClassAdapterImpl.java <BR>
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	/**
	 * Gets the 120 volt.
	 *
	 * @return the 120 volt
	 */
	@Override
	public Volt get120Volt() {
		return this.getVolt();
	}

	/**
	 * Gets the 12 volt.
	 *
	 * @return the 12 volt
	 */
	@Override
	public Volt get12Volt() {
		final Volt v = this.getVolt();
		return this.convertVolt(v, 10);
	}

	/**
	 * Gets the 3 volt.
	 *
	 * @return the 3 volt
	 */
	@Override
	public Volt get3Volt() {
		final Volt v = this.getVolt();
		return this.convertVolt(v, 40);
	}

	/**
	 * Convert volt.
	 *
	 * @param v the v
	 * @param i the i
	 * @return Volt
	 */
	private Volt convertVolt(final Volt v, final int i) {
		return new Volt(v.getVolts() / i);
	}
}