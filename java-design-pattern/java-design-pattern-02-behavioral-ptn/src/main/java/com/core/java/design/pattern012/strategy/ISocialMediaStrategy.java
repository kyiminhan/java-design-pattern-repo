package com.core.java.design.pattern012.strategy;

/**
 * The Interface ISocialMediaStrategy.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern012.strategy <BR>
 *        ISocialMediaStrategy.java <BR>
 */
public interface ISocialMediaStrategy {

	/**
	 * Connect to.
	 *
	 * @param friendName the friend name
	 */
	void connectTo(String friendName);
}