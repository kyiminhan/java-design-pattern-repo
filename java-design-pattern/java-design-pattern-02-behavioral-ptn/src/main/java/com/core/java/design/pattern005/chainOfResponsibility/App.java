package com.core.java.design.pattern005.chainOfResponsibility;

import lombok.extern.log4j.Log4j2;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        App.java <BR>
 */
@Log4j2
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final SupportService supportService = (SupportService) BeanUtil.getInstance().getBean("supportServiceBean");

		ServiceRequest request = new ServiceRequest();
		request.setType(ServiceLevel.LEVEL_ONE);
		supportService.handleRequest(request);
		App.log.info(request.getConclusion());

		request = new ServiceRequest();
		request.setType(ServiceLevel.LEVEL_THREE);
		supportService.handleRequest(request);
		App.log.info(request.getConclusion());

		request = new ServiceRequest();
		request.setType(ServiceLevel.INVALID_REQUEST);
		supportService.handleRequest(request);
		App.log.info(request.getConclusion());
	}
}