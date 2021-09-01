package com.jonline.module04.classes.task08;

public class CustomerData {
	
	private Customer[] customerData = new Customer[2];
	private int actualLength = 0;

	public void addCustomer(final Customer newCustomer) {
		checkLengthAndExtend();

		customerData[actualLength] = newCustomer;
		actualLength++;
	}

	private void checkLengthAndExtend() {
		if (actualLength >= customerData.length) {
			final Customer[] extendedCustomerData = new Customer[customerData.length * 2];

			for (int i = 0; i < customerData.length; i++) {
				extendedCustomerData[i] = customerData[i];
			}

			customerData = extendedCustomerData;
		}
	}
}
