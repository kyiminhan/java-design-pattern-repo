package com.core.java.design.pattern012.strategy;

/**
 * The Class SocialMediaContext.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern012.strategy <BR>
 *        SocialMediaContext.java <BR>
 */
public class SocialMediaContext {

	/** The sm strategy. */
	ISocialMediaStrategy smStrategy;

	public void setSocialmediaStrategy(final ISocialMediaStrategy smStrategy) {
		this.smStrategy = smStrategy;
	}

	/**
	 * Connect.
	 *
	 * @param name the name
	 */
	public void connect(final String name) {
		this.smStrategy.connectTo(name);
	}
}