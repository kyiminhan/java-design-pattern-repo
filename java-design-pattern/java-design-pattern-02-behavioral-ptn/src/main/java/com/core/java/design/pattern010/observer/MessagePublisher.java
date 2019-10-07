package com.core.java.design.pattern010.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class MessagePublisher. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/10/07 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern010.observer <BR>
 *        MessagePublisher.java <BR>
 */
public class MessagePublisher implements Subject {

	/** The observers. */
	private final List<Observer> observers = new ArrayList<>();

	/**
	 * Attach.
	 *
	 * @param o the o
	 */
	@Override
	public void attach(final Observer o) {
		this.observers.add(o);
	}

	/**
	 * Detach.
	 *
	 * @param o the o
	 */
	@Override
	public void detach(final Observer o) {
		this.observers.remove(o);
	}

	/**
	 * Notify update.
	 *
	 * @param m the m
	 */
	@Override
	public void notifyUpdate(final Message m) {
		for (final Observer o : this.observers) {
			o.update(m);
		}
	}
}