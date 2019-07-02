package com.core.java.design.pattern006.command;

import lombok.extern.log4j.Log4j2;

/**
 * The Class TurnOffLightCommand. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        TurnOffLightCommand.java <BR>
 */
@Log4j2
public class TurnOffLightCommand implements ICommand {

	/** The light. */
	private final Light light;

	/**
	 * Instantiates a new turn off light command.
	 *
	 * @param light the light
	 */
	public TurnOffLightCommand(final Light light) {
		super();
		this.light = light;
	}

	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		TurnOffLightCommand.log.info("Turning off light.");
		this.light.turnOff();
	}
}