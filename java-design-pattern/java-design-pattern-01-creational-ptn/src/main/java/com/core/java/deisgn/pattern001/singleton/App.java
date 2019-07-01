package com.core.java.deisgn.pattern001.singleton;

/**
 * The Class App. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern001.singleton <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String... args) {

		BillPughSingleton.getInstance().show();

		EagerSingleton.getInstance().show();

		EnumSingleton.INSTANCE.show();

		LazySingleton_01.getInstance().show();

		LazySingleton_02.getInstance().show();

		StaticBlockSingleton.getInstance().show();
	}
}