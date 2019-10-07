package com.core.java.design.pattern010.observer;

/**
 * The Class MessageSubscriberOne. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/07 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern010.observer <BR>
 *        MessageSubscriberOne.java <BR>
 */
public class MessageSubscriberOne implements Observer {

	/**
	 * Update.
	 *
	 * @param m the m
	 */
	@Override
	public void update(final Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}
}