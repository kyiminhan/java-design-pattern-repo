package com.core.java.design.pattern008.mediator;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 17, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern008.mediator <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final IChatRoom chatroom = new ChatRoom();

		final User user1 = new ChatUser(chatroom, "1", "Alex");
		final User user2 = new ChatUser(chatroom, "2", "Brian");
		final User user3 = new ChatUser(chatroom, "3", "Charles");
		final User user4 = new ChatUser(chatroom, "4", "David");

		chatroom.addUser(user1);
		chatroom.addUser(user2);
		chatroom.addUser(user3);
		chatroom.addUser(user4);

		user1.send("Hello brian", "2");
		user2.send("Hey buddy", "1");
	}

}