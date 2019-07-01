package com.core.java.design.pattern005.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class FrontDeskSupport.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        FrontDeskSupport.java <BR>
 */
public class FrontDeskSupport implements SupportServiceItf {

	/** The next. */
	@Getter
	@Setter
	private SupportServiceItf next = null;

	/**
	 * Handle request.
	 *
	 * @param service the service
	 */
	@Override
	public void handleRequest(final ServiceRequest service) {
		if (service.getType() == ServiceLevel.LEVEL_ONE) {
			service.setConclusion("Front desk solved level one reuqest !!");
		} else {
			if (this.next != null) {
				this.next.handleRequest(service);
			} else {
				throw new IllegalArgumentException("No handler found for :: " + service.getType());
			}
		}
	}
}