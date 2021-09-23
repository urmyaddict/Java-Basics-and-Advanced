package com.java11.stringBuilderDemo;

public class StringBuilderDemo1 {

	public static void main(String[] args) {

//		// CASE 1
//		StringBuilder sb1 = new StringBuilder("Infy");
//		StringBuilder sb2 = new StringBuilder("Infy");
//		System.out.println(sb1 == sb2);
//
//		// CASE 2
//		StringBuilder name4 = new StringBuilder("Oliver");
//		name4.append("Carter");
//		System.out.println(name4);
//
//		// CASE 3
//		StringBuilder name1 = new StringBuilder();
//		name1.append("Wright");
//		name1.append(" Brothers");
//		System.out.println(name1);
//
//		// CASE 4
//		String name2 = "King";
//		// name2.append("Kong") //NO APPEND
//		name2 = name2+" Kong";
//		System.out.println(name2);
		
		
		// CASE 5
		//creation of StringBuilder Object with capacity 50.
		StringBuilder name = new StringBuilder(50);
						
		name.append("Mississippi");
		int length = name.length();  // will give the length of address
		name.insert(length, " River");
		System.out.println(name);   //Output :- Mississippi River
				
		name.reverse();    // Output :- reviR ippississiM
		System.out.println(name);
		
		name.delete(5, 10); // Output :- reviRssissiM
		System.out.println(name);
		
		System.out.println(name.charAt(3));  // Output :- i

		
		
		//some of the methods of StringBuilder
//		StringBuilder append(String str);
//		StringBuilder insert(int offset, String str);
//		StringBuilder reverse(int index);
//		StringBuilder delete(int start, int end); //start inclusive, end exclusive
		
		
		
	}

}
