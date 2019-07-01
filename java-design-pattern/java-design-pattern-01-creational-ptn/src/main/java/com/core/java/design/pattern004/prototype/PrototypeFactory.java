package com.core.java.design.pattern004.prototype;

/**
 * The Class PrototypeFactory.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern004.prototype <BR>
 *        PrototypeFactory.java <BR>
 */
public class PrototypeFactory {

	/**
	 * The Class ModelType.<BR>
	 *
	 * @author KYIMINHAN <BR>
	 * @version 1.0 <BR>
	 * @since Jul 2, 2019 <BR>
	 *        java-design-pattern-01-creational-ptn system <BR>
	 *        com.core.java.design.pattern004.prototype <BR>
	 *        PrototypeFactory.java <BR>
	 */
	public static class ModelType {

		/** The Constant MOVIE. */
		public static final String MOVIE = "movie";

		/** The Constant ALBUM. */
		public static final String ALBUM = "album";

		/** The Constant SHOW. */
		public static final String SHOW = "show";
	}

	/** The prototypes. */
	private static java.util.Map<String, PrototypeCapable> prototypes = new java.util.HashMap<>();

	static {
		PrototypeFactory.prototypes.put(ModelType.MOVIE, new Movie());
		PrototypeFactory.prototypes.put(ModelType.ALBUM, new Album());
		PrototypeFactory.prototypes.put(ModelType.SHOW, new Show());
	}

	/**
	 * Gets the single instance of PrototypeFactory.
	 *
	 * @param typeName the type name
	 * @return single instance of PrototypeFactory
	 * @throws CloneNotSupportedException the clone not supported exception
	 */
	public static PrototypeCapable getInstance(final String typeName) throws CloneNotSupportedException {
		return PrototypeFactory.prototypes.get(typeName).clone();
	}
}