package com.core.java.design.pattern014.visitor;

/**
 * The Class DLinkRouter.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern014.visitor <BR>
 *        DLinkRouter.java <BR>
 */
public class DLinkRouter implements Router {

	/**
	 * Send data.
	 *
	 * @param data the data
	 */
	@Override
	public void sendData(final char[] data) {
		// TODO Auto-generated method stub
	}

	/**
	 * Accept data.
	 *
	 * @param data the data
	 */
	@Override
	public void acceptData(final char[] data) {
		// TODO Auto-generated method stub
	}

	/**
	 * Accept.
	 *
	 * @param v the v
	 */
	@Override
	public void accept(final RouterVisitor v) {
		v.visit(this);
	}
}