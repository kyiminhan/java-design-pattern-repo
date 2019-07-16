package com.core.java.design.pattern008.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class ChatRoom.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern008.mediator <BR>
 *        ChatRoom.java <BR>
 */
public class ChatRoom implements IChatRoom {

	/** The users map. */
	private final Map<String, User> usersMap = new HashMap<>();

	@Override
	public void sendMessage(final String msg, final String userId) {
		final User u = this.usersMap.get(userId);
		u.receive(msg);

	}

	@Override
	public void addUser(final User user) {
		this.usersMap.put(user.getId(), user);
	}
}