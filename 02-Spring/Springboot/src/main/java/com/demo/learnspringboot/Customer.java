package com.demo.learnspringboot;

public class Customer {
	private String Customername;
	private String BillingAddress;
	private int Customernumber;
	private int Amountpaid;
	
	public Customer(String customername, String billingAddress, int customernumber, int amountpaid) {
		super();
		Customername = customername;
		BillingAddress = billingAddress;
		Customernumber = customernumber;
		Amountpaid = amountpaid;
	}
	
	public String getCustomername() {
		return Customername;
	}
	public String getBillingAddress() {
		return BillingAddress;
	}
	public int getCustomernumber() {
		return Customernumber;
	}
	public int getAmountpaid() {
		return Amountpaid;
	}
}
