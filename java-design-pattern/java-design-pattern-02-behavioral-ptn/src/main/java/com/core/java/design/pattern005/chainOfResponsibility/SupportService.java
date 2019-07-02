package com.core.java.design.pattern005.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class SupportService.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        SupportService.java <BR>
 */
@Getter
@Setter
public class SupportService implements SupportServiceItf {

	/** The handler. */
	private SupportServiceItf handler = null;

	/**
	 * Handle request.
	 *
	 * @param request the request
	 */
	@Override
	public void handleRequest(final ServiceRequest request) {
		this.handler.handleRequest(request);
	}
}