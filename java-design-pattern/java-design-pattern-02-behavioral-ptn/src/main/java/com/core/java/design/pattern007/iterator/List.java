package com.core.java.design.pattern007.iterator;

/**
 * The Interface List.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @param <E> the element type
 * @since Jul 16, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern007.iterator <BR>
 *        List.java <BR>
 */
public interface List<E> {

	/**
	 * Iterator.
	 *
	 * @return Iterator
	 */
	Iterator<E> iterator();
}