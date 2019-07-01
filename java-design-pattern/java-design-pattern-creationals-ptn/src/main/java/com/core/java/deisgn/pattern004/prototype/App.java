package com.core.java.deisgn.pattern004.prototype;

import com.core.java.deisgn.pattern004.prototype.PrototypeFactory.ModelType;

import lombok.extern.log4j.Log4j2;

/**
 * The Class App.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern004.prototype <BR>
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

		try {

			final String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
			App.log.info(moviePrototype);

			final String albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
			App.log.info(albumPrototype);

			final String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
			App.log.info(showPrototype);

			final Show show = (Show) PrototypeFactory.getInstance(ModelType.SHOW);
			App.log.info(show);

		} catch (final CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}