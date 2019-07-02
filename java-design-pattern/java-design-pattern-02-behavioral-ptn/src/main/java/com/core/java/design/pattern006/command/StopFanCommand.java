package com.core.java.design.pattern006.command;

import lombok.extern.log4j.Log4j2;

/**
 * The Class StopFanCommand. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        StopFanCommand.java <BR>
 */
@Log4j2
public class StopFanCommand implements ICommand {

	/** The fan. */
	private final Fan fan;

	/**
	 * Instantiates a new start fan command.
	 *
	 * @param fan the fan
	 */
	public StopFanCommand(final Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		StopFanCommand.log.info("stopping Fan.");
		this.fan.start();
	}
}