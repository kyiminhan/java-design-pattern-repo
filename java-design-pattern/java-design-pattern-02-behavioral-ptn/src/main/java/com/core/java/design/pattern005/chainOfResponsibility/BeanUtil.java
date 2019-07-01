package com.core.java.design.pattern005.chainOfResponsibility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The Class AppUtil.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern005.chainOfResponsibility <BR>
 *        AppUtil.java <BR>
 */
public class BeanUtil {

	/** The instance. */
	private volatile static BeanUtil instance;

	/**
	 * Instantiates a new app util.
	 */
	private BeanUtil() {
	}

	public static BeanUtil getInstance() {
		if (null == BeanUtil.instance) {
			synchronized (BeanUtil.class) {
				BeanUtil.instance = new BeanUtil();
			}
		}
		return BeanUtil.instance;
	}

	private ApplicationContext getContext() {
		return new AnnotationConfigApplicationContext(AppConfig.class);
	}

	/**
	 * Gets the bean.
	 *
	 * @param beanName the bean name
	 * @return the bean
	 */
	public Object getBean(final String beanName) {
		return this.getContext().getBean(beanName);
	}
}