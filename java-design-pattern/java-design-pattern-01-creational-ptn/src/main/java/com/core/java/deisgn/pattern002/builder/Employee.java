package com.core.java.deisgn.pattern002.builder;

/**
 * The Class Employee. <BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since 2019/07/01 <BR>
 *        java-design-pattern-creationals-ptn system <BR>
 *        com.core.java.deisgn.pattern002.builder <BR>
 *        Employee.java <BR>
 */
public class Employee {

	/** The first name. */
	// All final attributes
	private String firstName; // required

	/** The last name. */
	private String lastName; // required

	/** The age. */
	private int age; // optional

	/** The phone. */
	private String phone; // optional

	/** The address. */
	private String address; // optional

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
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
	 * Builder.
	 *
	 * @return EmployeeBuilder
	 */
	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}

	@Override
	public String toString() {
		return "Employee: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", "
				+ this.address;
	}

	/**
	 * The Class EmployeeBuilder. <BR>
	 *
	 * @author KYIMINHAN <BR>
	 * @version 1.0 <BR>
	 * @since 2019/07/01 <BR>
	 *        java-design-pattern-creationals-ptn system <BR>
	 *        com.core.java.deisgn.pattern002.builder <BR>
	 *        Employee.java <BR>
	 */
	public static class EmployeeBuilder {

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

		/**
		 * First name.
		 *
		 * @param firstName the first name
		 * @return EmployeeBuilder
		 */
		public EmployeeBuilder firstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}

		/**
		 * Last name.
		 *
		 * @param lastName the last name
		 * @return EmployeeBuilder
		 */
		public EmployeeBuilder lastName(final String lastName) {
			this.lastName = lastName;
			return this;
		}

		/**
		 * Age.
		 *
		 * @param age the age
		 * @return EmployeeBuilder
		 */
		public EmployeeBuilder age(final int age) {
			this.age = age;
			return this;
		}

		/**
		 * Phone.
		 *
		 * @param phone the phone
		 * @return EmployeeBuilder
		 */
		public EmployeeBuilder phone(final String phone) {
			this.phone = phone;
			return this;
		}

		/**
		 * Address.
		 *
		 * @param address the address
		 * @return EmployeeBuilder
		 */
		public EmployeeBuilder address(final String address) {
			this.address = address;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return Employee
		 */
		// Return the finally consrcuted User object
		public Employee build() {
			final Employee emp = new Employee();
			emp.firstName = this.firstName;
			emp.lastName = this.lastName;
			emp.age = this.age;
			emp.address = this.address;
			emp.phone = this.phone;
			this.validateUserObject(emp);
			return emp;
		}

		/**
		 * Validate user object.
		 *
		 * @param emp the emp
		 */
		private void validateUserObject(final Employee emp) {
			// Do some basic validations to check
			// if user object does not break any assumption of system
		}
	}
}