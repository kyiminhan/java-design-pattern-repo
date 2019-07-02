package com.core.java.design.pattern006.command;

/**
 * The Class App. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		// receiver 1
		final Light livingRoomLight = new Light();

		// receiver 2
		final Fan livingRoomFan = new Fan();

		// receiver 3
		final Light bedRoomLight = new Light();

		// receiver 4
		final Fan bedRoomFan = new Fan();

		// Invoker
		final HomeAutomationRemote remote = new HomeAutomationRemote();

		remote.setCommand(new TurnOnLightCommand(livingRoomLight));
		remote.buttonPressed();

		remote.setCommand(new TurnOnLightCommand(bedRoomLight));
		remote.buttonPressed();

		remote.setCommand(new StartFanCommand(livingRoomFan));
		remote.buttonPressed();

		remote.setCommand(new StopFanCommand(livingRoomFan));
		remote.buttonPressed();

		remote.setCommand(new StartFanCommand(bedRoomFan));
		remote.buttonPressed();

		remote.setCommand(new StopFanCommand(bedRoomFan));
		remote.buttonPressed();
	}
}