package com.core.java.singleton.serialize.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import lombok.extern.log4j.Log4j2;

/**
 * The Class SerializationTest. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.singleton.serialize.test <BR>
 *        SerializationTest.java <BR
 */

/** The Constant log. */
@Log4j2
public class SerializationTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String... args) {
		try {
			/** The instance one. */
			final DemoSingleton instanceOne = DemoSingleton.getInstance();
			// Serialize to a file
			final ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
			out.writeObject(instanceOne);
			out.close();

			instanceOne.setI(20);

			// Serialize to a file
			final ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
			final DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
			in.close();

			SerializationTest.log.info(instanceOne.getI());
			SerializationTest.log.info(instanceTwo.getI());

		} catch (final IOException e) {
			e.printStackTrace();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}