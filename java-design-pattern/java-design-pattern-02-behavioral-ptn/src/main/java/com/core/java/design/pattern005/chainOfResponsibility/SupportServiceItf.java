package com.core.java.design.pattern005.chainOfResponsibility;

/**
 * The Interface SupportServiceItf.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        SupportServiceItf.java <BR>
 */
public interface SupportServiceItf {

	/**
	 * Handle request.
	 *
	 * @param request the request
	 */
	void handleRequest(ServiceRequest request);
}