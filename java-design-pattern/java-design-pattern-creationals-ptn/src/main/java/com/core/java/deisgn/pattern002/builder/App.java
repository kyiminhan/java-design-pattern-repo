package com.core.java.deisgn.pattern002.builder;

import lombok.extern.log4j.Log4j2;

/**
 * The Class App. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern002.builder <BR>
 *        App.java <BR
 */
@Log4j2
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final User user1 = new User.UserBuilder("KYIMIN", "HAN").age(30).phone("1234567").address("Fake address 1234")
				.build();

		App.log.info(user1);

		final User user2 = new User.UserBuilder("Aung", "Aung").age(40).phone("5655")
				// no address
				.build();

		App.log.info(user2);

		final User user3 = new User.UserBuilder("Super", "Man")
				// No age
				// No phone
				// no address
				.build();

		App.log.info(user3);

		final Employee employee = Employee.builder().firstName("KyiMin").lastName("Han").address("Tokyo, Japan.")
				.phone("0987654321234").build();

		final Student student = Student.builder().firstName("KyiMin").lastName("Han").address("Tokyo, Japan.")
				.phone("0987654321234").build();

		App.log.info(employee);

		App.log.info(student);
	}
}