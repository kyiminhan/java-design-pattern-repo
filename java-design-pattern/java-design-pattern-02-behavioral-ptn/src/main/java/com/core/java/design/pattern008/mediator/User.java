package com.core.java.design.pattern008.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The Class User.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern008.mediator <BR>
 *        User.java <BR>
 */
@Getter

/**
 * Instantiates a new user.
 *
 * @param mediator the mediator
 * @param id       the id
 * @param name     the name
 */
@AllArgsConstructor
public abstract class User {

	/** The mediator. */
	private final IChatRoom mediator;

	/** The id. */
	private final String id;

	/** The name. */
	private final String name;

	/**
	 * Send.
	 *
	 * @param msg    the msg
	 * @param userId the user id
	 */
	public abstract void send(String msg, String userId);

	/**
	 * Receive.
	 *
	 * @param msg the msg
	 */
	public abstract void receive(String msg);

}