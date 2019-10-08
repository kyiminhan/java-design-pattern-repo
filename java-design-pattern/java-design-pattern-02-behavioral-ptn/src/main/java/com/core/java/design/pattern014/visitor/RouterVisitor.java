package com.core.java.design.pattern014.visitor;

/**
 * The Interface RouterVisitor.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern014.visitor <BR>
 *        RouterVisitor.java <BR>
 */
public interface RouterVisitor {

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	void visit(DLinkRouter router);

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	void visit(TPLinkRouter router);

	/**
	 * Visit.
	 *
	 * @param router the router
	 */
	void visit(LinkSysRouter router);
}