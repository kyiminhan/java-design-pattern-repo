package com.core.java.design.pattern006.command;

/**
 * The Class HomeAutomationRemote. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        HomeAutomationRemote.java <BR>
 */
public class HomeAutomationRemote {

	// Command Holder
	/** The command. */
	ICommand command;

	// Set the command in runtime to trigger.
	/**
	 * Sets the command.
	 *
	 * @param command the new command
	 */
	public void setCommand(final ICommand command) {
		this.command = command;
	}

	// Will call the command interface method so that particular command can be
	// invoked.
	/**
	 * Button pressed.
	 */
	public void buttonPressed() {
		this.command.execute();
	}
}