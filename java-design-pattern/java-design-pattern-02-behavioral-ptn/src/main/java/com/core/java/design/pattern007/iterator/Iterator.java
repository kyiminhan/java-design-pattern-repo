package com.core.java.design.pattern007.iterator;

/**
 * The Interface Iterator.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @param <E> the element type
 * @since Jul 16, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern007.iterator <BR>
 *        Iterator.java <BR>
 */
public interface Iterator<E> {

	/**
	 * Reset.
	 */
	void reset(); // reset to the first element

	/**
	 * Next.
	 *
	 * @return E
	 */
	E next(); // To get the next element

	/**
	 * Current item.
	 *
	 * @return E
	 */
	E currentItem(); // To retrieve the current element

	/**
	 * Checks for next.
	 *
	 * @return true, if successful
	 */
	boolean hasNext(); // To check whether there is any next element or not.
}