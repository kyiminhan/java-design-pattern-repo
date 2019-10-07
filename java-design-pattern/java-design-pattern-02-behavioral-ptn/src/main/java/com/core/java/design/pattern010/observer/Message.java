package com.core.java.design.pattern010.observer;

/**
 * The Class Message. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/07 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern010.observer <BR>
 *        Message.java <BR>
 */
public class Message {

	/** The message content. */
	final String messageContent;

	/**
	 * Instantiates a new message.
	 *
	 * @param m the m
	 */
	public Message(final String m) {
		this.messageContent = m;
	}

	/**
	 * Gets the message content.
	 *
	 * @return the message content
	 */
	public String getMessageContent() {
		return this.messageContent;
	}
}