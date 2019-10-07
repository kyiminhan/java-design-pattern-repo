package com.core.java.design.pattern010.observer;

/**
 * The Interface Subject. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/07 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern010.observer <BR>
 *        Subject.java <BR>
 */
public interface Subject {

	/**
	 * Attach.
	 *
	 * @param o the o
	 */
	void attach(Observer o);

	/**
	 * Detach.
	 *
	 * @param o the o
	 */
	void detach(Observer o);

	/**
	 * Notify update.
	 *
	 * @param m the m
	 */
	void notifyUpdate(Message m);
}