package com.core.java.design.pattern006.command;

import lombok.extern.log4j.Log4j2;

/**
 * The Class TurnOnLightCommand. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        TurnOnLightCommand.java <BR>
 */

@Log4j2
public class TurnOnLightCommand implements ICommand {

	/** The light. */
	private final Light light;

	/**
	 * Instantiates a new turn on light command.
	 *
	 * @param light the light
	 */
	public TurnOnLightCommand(final Light light) {
		super();
		this.light = light;
	}

	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		TurnOnLightCommand.log.info("Turning on light.");
		this.light.turnOn();
	}
}