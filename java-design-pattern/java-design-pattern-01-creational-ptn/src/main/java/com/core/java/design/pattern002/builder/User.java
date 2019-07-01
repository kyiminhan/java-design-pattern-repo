package com.core.java.design.pattern002.builder;

/**
 * The Class User.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Jul 2, 2019 <BR>
 *        java-design-pattern-01-creational-ptn system <BR>
 *        com.core.java.design.pattern002.builder <BR>
 *        User.java <BR>
 */
public class User {

	/** The first name. */
	// All final attributes
	private final String firstName; // required

	/** The last name. */
	private final String lastName; // required

	/** The age. */
	private final int age; // optional

	/** The phone. */
	private final String phone; // optional

	/** The address. */
	private final String address; // optional

	/**
	 * Instantiates a new user.
	 *
	 * @param builder the builder
	 */
	private User(final UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	// All getter, and NO setter to provde immutability
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * To string.
	 *
	 * @return String
	 */
	@Override
	public String toString() {
		return "User: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", "
				+ this.address;
	}

	/**
	 * The Class UserBuilder.<BR>
	 *
	 * @author KYIMINHAN <BR>
	 * @version 1.0 <BR>
	 * @since Jul 2, 2019 <BR>
	 *        java-design-pattern-01-creational-ptn system <BR>
	 *        com.core.java.design.pattern002.builder <BR>
	 *        User.java <BR>
	 */
	public static class UserBuilder {

		/** The first name. */
		private final String firstName;

		/** The last name. */
		private final String lastName;

		/** The age. */
		private int age;

		/** The phone. */
		private String phone;

		/** The address. */
		private String address;

		/**
		 * Instantiates a new user builder.
		 *
		 * @param firstName the first name
		 * @param lastName  the last name
		 */
		public UserBuilder(final String firstName, final String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * Age.
		 *
		 * @param age the age
		 * @return UserBuilder
		 */
		public UserBuilder age(final int age) {
			this.age = age;
			return this;
		}

		/**
		 * Phone.
		 *
		 * @param phone the phone
		 * @return UserBuilder
		 */
		public UserBuilder phone(final String phone) {
			this.phone = phone;
			return this;
		}

		/**
		 * Address.
		 *
		 * @param address the address
		 * @return UserBuilder
		 */
		public UserBuilder address(final String address) {
			this.address = address;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return User
		 */
		// Return the finally consrcuted User object
		public User build() {
			final User user = new User(this);
			this.validateUserObject(user);
			return user;
		}

		/**
		 * Validate user object.
		 *
		 * @param user the user
		 */
		private void validateUserObject(final User user) {
			// Do some basic validations to check
			// if user object does not break any assumption of system
		}
	}
}