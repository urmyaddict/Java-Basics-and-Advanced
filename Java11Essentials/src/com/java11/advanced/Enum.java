package com.java11.advanced;

public class Enum {

	public enum PizzaSize {
		SMALL, MEDIUM, LARGE
	}

	public static void main(String[] args) {
		// values() method returns an array of all values inside 'enum'
		// ordinal() method can be used to display index values assigned to 'enum' constants
		System.out.println(PizzaSize.LARGE.ordinal());
		for (PizzaSize p : PizzaSize.values()) {
			System.out.println(p + " " + p.ordinal());
		}
	}

}
