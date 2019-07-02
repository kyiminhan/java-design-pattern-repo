package com.core.java.design.pattern005.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class ManagerSupport.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        ManagerSupport.java <BR>
 */
@Getter
@Setter
public class ManagerSupport implements SupportServiceItf {

	/** The next. */
	private SupportServiceItf next = null;

	/**
	 * Handle request.
	 *
	 * @param request the request
	 */
	@Override
	public void handleRequest(final ServiceRequest request) {
		if (request.getType() == ServiceLevel.LEVEL_THREE) {
			request.setConclusion("Manager solved level three reuqest !!");
		} else {
			if (this.next != null) {
				this.next.handleRequest(request);
			} else {
				throw new IllegalArgumentException("No handler found for :: " + request.getType());
			}
		}
	}
}