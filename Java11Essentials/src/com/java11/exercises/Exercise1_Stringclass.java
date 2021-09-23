package com.java11.exercises;

class Customer {
	private String customerName;
	private int applicableDiscount;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getApplicableDiscount() {
		return applicableDiscount;
	}

	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}

	public void findDiscountAndName(String inputString) {
		// write the code to implement the solution
		String[] arrStr = inputString.split(":");
		// customer name
		setCustomerName(arrStr[1]);
		// customer type
		String type = arrStr[0];
		if (type.equals("Regular"))
			this.setApplicableDiscount(10);
		else
			this.setApplicableDiscount(20);

		System.out.println("Hi " + this.getCustomerName() + "! " + this.getApplicableDiscount()
				+ "% discount is applicable for you");

	}
}

public class Exercise1_Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(); // regular
		Customer customer2 = new Customer(); // privileged

		// write the code to implement the solution
		customer1.findDiscountAndName("Regular:Jack");
		customer2.findDiscountAndName("Privileged:Mary");

	}

}
