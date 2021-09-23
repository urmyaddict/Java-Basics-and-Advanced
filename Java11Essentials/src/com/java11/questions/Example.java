package com.java11.questions;

class Books {
	public String s1;
}

public class Example {
	int i;
	Example(int i) {
		System.out.println(i);
		this.i = i; //passing to instance
		
	}
	
	
	public static void main(String ka[]) {
		Example obj = new Example(10); // calls Example constructor
		System.out.println(obj.i); //depends on instance variable
		Books b = new Books();
		System.out.println(b.s1);
		
	}

}
