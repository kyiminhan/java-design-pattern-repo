package com.core.java.design.pattern006.command;

/**
 * The Interface ICommand. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        ICommand.java <BR>
 */
@FunctionalInterface
public interface ICommand {

	/**
	 * Execute.
	 */
	void execute();
}