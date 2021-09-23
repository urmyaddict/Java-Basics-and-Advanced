package com.java11.questions;

public class Exceptions {
	
	public static void main(String[] args) {
		
		try {
			division(10,0);
		} finally {
			System.out.println("Finally block executed");
		}	
	}
	
	public static void division(int x, int y) {
		try {
			int z;
			z=x/y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("Error: Divide by zero");
			throw e;
		}
	}

}
