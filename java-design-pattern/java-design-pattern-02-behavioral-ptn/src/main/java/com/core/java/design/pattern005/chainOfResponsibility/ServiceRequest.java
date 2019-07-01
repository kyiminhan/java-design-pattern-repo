package com.core.java.design.pattern005.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class ServiceRequest.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        ServiceRequest.java <BR>
 */
public class ServiceRequest {

	/** The type. */
	@Getter
	@Setter
	private ServiceLevel type;

	/** The conclusion. */
	@Getter
	@Setter
	private String conclusion = null;

}
