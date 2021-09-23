package com.java11.exercises;

class Student {
	private String firstName;
	private String middleName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void change() {
		// Write your code here to implement the logic
		// removeing whitespace, leading and trailing
		setFirstName(getFirstName().strip());
		setMiddleName(getMiddleName().strip());
		setLastName(getLastName().strip());
		// if blank, NA
		if (getMiddleName().isBlank())
			setMiddleName("N.A.");
		// returns Student object
		
	}

	public String generateInitials() {
		// Write your code here to implement the logic
		// calls change method
		change();
		// System.out.println(change()); //in case you want to see result
		// generate initials
		return String.valueOf(getFirstName().charAt(0)) + String.valueOf(getMiddleName().charAt(0))
				+ String.valueOf(getLastName().charAt(0));
	}

}

public class Exercise2_Stringclass {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.setFirstName("Filius  ");
		std1.setMiddleName(" ");
		std1.setLastName("Flitwich");

		System.out.println(std1.generateInitials());
	}
}