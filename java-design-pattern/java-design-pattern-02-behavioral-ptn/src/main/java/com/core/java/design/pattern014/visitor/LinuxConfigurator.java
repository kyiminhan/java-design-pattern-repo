package com.core.java.design.pattern014.visitor;

/**
 * The Class LinuxConfigurator.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern014.visitor <BR>
 *        LinuxConfigurator.java <BR>
 */
public class LinuxConfigurator implements RouterVisitor {

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	@Override
	public void visit(final DLinkRouter router) {
		System.out.println("DLinkRouter Configuration for Linux complete !!");
	}

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	@Override
	public void visit(final TPLinkRouter router) {
		System.out.println("TPLinkRouter Configuration for Linux complete !!");
	}

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	@Override
	public void visit(final LinkSysRouter router) {
		System.out.println("LinkSysRouter Configuration for Linux complete !!");
	}
}