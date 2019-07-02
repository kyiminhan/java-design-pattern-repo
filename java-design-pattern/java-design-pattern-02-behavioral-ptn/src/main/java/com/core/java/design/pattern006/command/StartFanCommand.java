package com.core.java.design.pattern006.command;

import lombok.extern.log4j.Log4j2;

/**
 * The Class StartFanCommand. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        StartFanCommand.java <BR>
 */
@Log4j2
public class StartFanCommand implements ICommand {

	/** The fan. */
	private final Fan fan;

	/**
	 * Instantiates a new start fan command.
	 *
	 * @param fan the fan
	 */
	public StartFanCommand(final Fan fan) {
		super();
		this.fan = fan;
	}

	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		StartFanCommand.log.info("starting Fan.");
		this.fan.start();
	}
}