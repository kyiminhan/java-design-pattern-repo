package com.core.java.design.pattern010.observer;

/**
 * The Class App. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/07 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern010.observer <BR>
 *        App.java <BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final MessageSubscriberOne s1 = new MessageSubscriberOne();
		final MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		final MessageSubscriberThree s3 = new MessageSubscriberThree();

		final MessagePublisher p = new MessagePublisher();

		p.attach(s1);
		p.attach(s2);

		p.notifyUpdate(new Message("First Message")); // s1 and s2 will receive the update

		p.detach(s1);
		p.attach(s3);

		p.notifyUpdate(new Message("Second Message")); // s2 and s3 will receive the update
	}
}