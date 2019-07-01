package com.core.java.design.pattern005.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class SupervisorSupport.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        SupervisorSupport.java <BR>
 */
public class SupervisorSupport implements SupportServiceItf {

	/** The next. */
	@Getter
	@Setter
	private SupportServiceItf next = null;

	/**
	 * Handle request.
	 *
	 * @param request the request
	 */
	@Override
	public void handleRequest(final ServiceRequest request) {

		if (request.getType() == ServiceLevel.LEVEL_TWO) {

			request.setConclusion("Supervisor solved level two reuqest !!");

		} else {

			if (this.next != null) {

				this.next.handleRequest(request);

			} else {

				throw new IllegalArgumentException("No handler found for :: " + request.getType());
			}
		}
	}

}