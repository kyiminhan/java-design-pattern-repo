package com.core.java.design.pattern015.adatper_02;

import lombok.extern.log4j.Log4j2;

/**
 * The Class App. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/11 <BR>
 *        java-design-pattern-03-structural-ptn system <BR>
 *        com.core.java.design.pattern015.adatper_02 <BR>
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

		App.testClassAdapter();
		App.testObjectAdapter();
	}

	/**
	 * Test object adapter.
	 */
	private static void testObjectAdapter() {

		final SocketAdapter sockAdapter = new SocketObjectAdapterImpl();

		final Volt v3 = App.getVolt(sockAdapter, 3);
		final Volt v12 = App.getVolt(sockAdapter, 12);
		final Volt v120 = App.getVolt(sockAdapter, 120);

		App.log.info("v3 volts using Object Adapter=" + v3.getVolts());
		App.log.info("v12 volts using Object Adapter=" + v12.getVolts());
		App.log.info("v120 volts using Object Adapter=" + v120.getVolts());
	}

	/**
	 * Test class adapter.
	 */
	private static void testClassAdapter() {

		final SocketAdapter sockAdapter = new SocketClassAdapterImpl();

		final Volt v3 = App.getVolt(sockAdapter, 3);
		final Volt v12 = App.getVolt(sockAdapter, 12);
		final Volt v120 = App.getVolt(sockAdapter, 120);

		App.log.info("v3 volts using Class Adapter=" + v3.getVolts());
		App.log.info("v12 volts using Class Adapter=" + v12.getVolts());
		App.log.info("v120 volts using Class Adapter=" + v120.getVolts());
	}

	/**
	 * Gets the volt.
	 *
	 * @param sockAdapter the sock adapter
	 * @param i           the i
	 * @return the volt
	 */
	private static Volt getVolt(final SocketAdapter sockAdapter, final int i) {

		switch (i) {

		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}
	}

}