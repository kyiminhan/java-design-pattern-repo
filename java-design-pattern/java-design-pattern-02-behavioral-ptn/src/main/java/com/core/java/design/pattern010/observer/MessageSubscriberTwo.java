package com.core.java.design.pattern010.observer;

/**
 * The Class MessageSubscriberTwo. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/07 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern010.observer <BR>
 *        MessageSubscriberTwo.java <BR>
 */
public class MessageSubscriberTwo implements Observer {

	/**
	 * Update.
	 *
	 * @param m the m
	 */
	@Override
	public void update(final Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
	}
}