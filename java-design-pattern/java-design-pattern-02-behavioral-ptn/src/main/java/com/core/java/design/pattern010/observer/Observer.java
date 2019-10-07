package com.core.java.design.pattern010.observer;

/**
 * The Interface Observer. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/07 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern010.observer <BR>
 *        Observer.java <BR>
 */
public interface Observer {

	/**
	 * Update.
	 *
	 * @param m the m
	 */
	void update(Message m);
}