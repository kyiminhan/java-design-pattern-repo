package com.core.java.design.pattern005.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class DirectorSupport.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        DirectorSupport.java <BR>
 */
@Getter
@Setter
public class DirectorSupport implements SupportServiceItf {

	/** The next. */
	private SupportServiceItf next = null;

	/**
	 * Handle request.
	 *
	 * @param request the request
	 */
	@Override
	public void handleRequest(final ServiceRequest request) {
		if (request.getType() == ServiceLevel.LEVEL_FOUR) {
			request.setConclusion("Director solved level four reuqest !!");
		} else {
			if (this.next != null) {
				this.next.handleRequest(request);
			} else {
				request.setConclusion("You problem is none of our business");
				throw new IllegalArgumentException("You problem is none of our business :: " + request.getType());
			}
		}
	}
}