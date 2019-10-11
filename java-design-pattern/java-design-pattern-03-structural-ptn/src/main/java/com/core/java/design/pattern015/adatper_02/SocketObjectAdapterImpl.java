package com.core.java.design.pattern015.adatper_02;

/**
 * The Class SocketObjectAdapterImpl. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper_02 <BR>
 *        SocketObjectAdapterImpl.java <BR>
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

	/** The sock. */
	// Using Composition for adapter pattern
	private final Socket sock = new Socket();

	/**
	 * Gets the 120 volt.
	 *
	 * @return the 120 volt
	 */
	@Override
	public Volt get120Volt() {
		return this.sock.getVolt();
	}

	/**
	 * Gets the 12 volt.
	 *
	 * @return the 12 volt
	 */
	@Override
	public Volt get12Volt() {
		final Volt v = this.sock.getVolt();
		return this.convertVolt(v, 10);
	}

	/**
	 * Gets the 3 volt.
	 *
	 * @return the 3 volt
	 */
	@Override
	public Volt get3Volt() {
		final Volt v = this.sock.getVolt();
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