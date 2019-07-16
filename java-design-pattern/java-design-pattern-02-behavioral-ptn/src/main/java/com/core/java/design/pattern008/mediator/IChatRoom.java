package com.core.java.design.pattern008.mediator;

/**
 * The Interface IChatRoom.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern008.mediator <BR>
 *        IChatRoom.java <BR>
 */
public interface IChatRoom {

	/**
	 * Send message.
	 *
	 * @param msg    the msg
	 * @param userId the user id
	 */
	void sendMessage(String msg, String userId);

	/**
	 * Adds the user.
	 *
	 * @param user the user
	 */
	void addUser(User user);
}