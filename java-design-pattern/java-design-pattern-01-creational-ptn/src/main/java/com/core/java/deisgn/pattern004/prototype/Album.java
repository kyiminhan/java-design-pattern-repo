package com.core.java.deisgn.pattern004.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

/**
 * The Class Album.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern004.prototype <BR>
 *        Album.java <BR>
 */
@Log4j2
@ToString
public class Album implements PrototypeCapable {

	/** The name. */
	@Getter
	@Setter
	private String name = null;

	/**
	 * Clone.
	 *
	 * @return PrototypeCapable
	 * @throws CloneNotSupportedException the clone not supported exception
	 */
	@Override
	public Album clone() throws CloneNotSupportedException {

		Album.log.info("Cloning Album object..");
		return (Album) super.clone();
	}
}