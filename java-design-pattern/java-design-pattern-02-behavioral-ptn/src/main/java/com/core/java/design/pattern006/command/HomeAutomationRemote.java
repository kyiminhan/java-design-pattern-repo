package com.core.java.design.pattern006.command;

public class HomeAutomationRemote {

	// Command Holder
	ICommand command;

	// Set the command in runtime to trigger.
	public void setCommand(final ICommand command) {
		this.command = command;
	}

	// Will call the command interface method so that particular command can be
	// invoked.
	public void buttonPressed() {
		this.command.execute();
	}
}