package com.core.java.design.pattern006.command;

import lombok.extern.log4j.Log4j2;

/**
 * The Class Fan. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/02 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern006.command <BR>
 *        Fan.java <BR>
 */
@Log4j2
public class Fan {

	/**
	 * Start.
	 */
	void start() {
		Fan.log.info("Fan Started..");
	}

	/**
	 * Stop.
	 */
	void stop() {
		Fan.log.info("Fan stopped..");
	}
}