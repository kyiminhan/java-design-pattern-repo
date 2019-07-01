package com.core.java.deisgn.pattern002.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Student. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern002.builder <BR>
 *        Student.java <BR>
 */
@Getter
@Setter

/**
 * Instantiates a new student.
 */
@NoArgsConstructor

/**
 * Instantiates a new student.
 *
 * @param firstName the first name
 * @param lastName  the last name
 * @param age       the age
 * @param phone     the phone
 * @param address   the address
 */
@AllArgsConstructor
@ToString

/**
 * Builds the.
 *
 * @return Student
 */
@Builder
public class Student {

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The age. */
	private int age;

	/** The phone. */
	private String phone;

	/** The address. */
	private String address;
}
