package com.core.java.design.pattern014.visitor;

import junit.framework.TestCase;

/**
 * The Class TestVisitorPattern.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern014.visitor <BR>
 *        TestVisitorPattern.java <BR>
 */
public class TestVisitorPattern extends TestCase {

	/** The mac configurator. */
	private MacConfigurator macConfigurator;

	/** The linux configurator. */
	private LinuxConfigurator linuxConfigurator;

	/** The dlink. */
	private DLinkRouter dlink;

	/** The tplink. */
	private TPLinkRouter tplink;

	/** The linksys. */
	private LinkSysRouter linksys;

	@Override
	public void setUp() {
		this.macConfigurator = new MacConfigurator();
		this.linuxConfigurator = new LinuxConfigurator();

		this.dlink = new DLinkRouter();
		this.tplink = new TPLinkRouter();
		this.linksys = new LinkSysRouter();
	}

	/**
	 * Test dlink.
	 */
	public void testDlink() {
		this.dlink.accept(this.macConfigurator);
		this.dlink.accept(this.linuxConfigurator);
	}

	/**
	 * Test TP link.
	 */
	public void testTPLink() {
		this.tplink.accept(this.macConfigurator);
		this.tplink.accept(this.linuxConfigurator);
	}

	/**
	 * Test link sys.
	 */
	public void testLinkSys() {
		this.linksys.accept(this.macConfigurator);
		this.linksys.accept(this.linuxConfigurator);
	}
}