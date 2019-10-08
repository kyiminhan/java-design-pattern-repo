package com.core.java.design.pattern012.strategy;

/**
 * The Class FacebookStrategy.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern012.strategy <BR>
 *        FacebookStrategy.java <BR>
 */
public class FacebookStrategy implements ISocialMediaStrategy {

	/**
	 * Connect to.
	 *
	 * @param friendName the friend name
	 */
	@Override
	public void connectTo(final String friendName) {
		System.out.println("Connecting with " + friendName + " through Facebook");
	}
}