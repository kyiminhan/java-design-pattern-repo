package com.core.java.design.pattern008.mediator;

/**
 * The Class ChatUser.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern008.mediator <BR>
 *        ChatUser.java <BR>
 */
public class ChatUser extends User {

	/**
	 * Instantiates a new chat user.
	 *
	 * @param mediator the mediator
	 * @param id       the id
	 * @param name     the name
	 */
	public ChatUser(final IChatRoom mediator, final String id, final String name) {
		super(mediator, id, name);
	}

	@Override
	public void send(final String msg, final String userId) {
		System.out.println(this.getName() + " :: Sending Message : " + msg);
		this.getMediator().sendMessage(msg, userId);
	}

	@Override
	public void receive(final String msg) {
		System.out.println(this.getName() + " :: Received Message : " + msg);
	}
}