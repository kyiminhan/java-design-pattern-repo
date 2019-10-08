package com.core.java.design.pattern014.visitor;

/**
 * The Class MacConfigurator.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern014.visitor <BR>
 *        MacConfigurator.java <BR>
 */
public class MacConfigurator implements RouterVisitor {

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	@Override
	public void visit(final DLinkRouter router) {
		System.out.println("DLinkRouter Configuration for Mac complete !!");
	}

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	@Override
	public void visit(final TPLinkRouter router) {
		System.out.println("TPLinkRouter Configuration for Mac complete !!");
	}

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	@Override
	public void visit(final LinkSysRouter router) {
		System.out.println("LinkSysRouter Configuration for Mac complete !!");
	}
}