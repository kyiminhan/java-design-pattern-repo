package com.core.java.design.pattern011.state;

/**
 * The Class DeliveryContext.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Oct 9, 2019 <BR>
 *        java-design-pattern-02-behavioral-ptn system <BR>
 *        com.core.java.design.pattern011.state <BR>
 *        DeliveryContext.java <BR>
 */
public class DeliveryContext {

	/** The current state. */
	private PackageState currentState;

	/** The package id. */
	private String packageId;

	/**
	 * Instantiates a new delivery context.
	 *
	 * @param currentState the current state
	 * @param packageId    the package id
	 */
	public DeliveryContext(final PackageState currentState, final String packageId) {
		super();
		this.currentState = currentState;
		this.packageId = packageId;

		if (currentState == null) {
			this.currentState = Acknowledged.instance();
		}
	}

	/**
	 * Gets the current state.
	 *
	 * @return the current state
	 */
	public PackageState getCurrentState() {
		return this.currentState;
	}

	/**
	 * Sets the current state.
	 *
	 * @param currentState the new current state
	 */
	public void setCurrentState(final PackageState currentState) {
		this.currentState = currentState;
	}

	/**
	 * Gets the package id.
	 *
	 * @return the package id
	 */
	public String getPackageId() {
		return this.packageId;
	}

	/**
	 * Sets the package id.
	 *
	 * @param packageId the new package id
	 */
	public void setPackageId(final String packageId) {
		this.packageId = packageId;
	}

	/**
	 * Update.
	 */
	public void update() {
		this.currentState.updateState(this);
	}
}