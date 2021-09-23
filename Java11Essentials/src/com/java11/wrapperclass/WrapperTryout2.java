package com.java11.wrapperclass;

//This program demonstrates usage of various methods in Character Wrapper class
public class WrapperTryout2 {

	public static void main(String[] args) {
//		// Creating Character instances using valueOf()
		Character alphaObj = Character.valueOf('A');
//		Character digitObj = Character.valueOf('5');
//
//		// method to check if a given character is Alphabet
//		System.out.println("Z is Alphabet:" + Character.isLetter('Z'));
//
//		// method to check if a given character is Digit
//		System.out.println("5 is Digit:" + Character.isDigit(digitObj));
//
//		// method to check if a given character is LowerCase
//		System.out.println("b is LowerCase:" + Character.isLowerCase('b'));
//
//		// method to convert to LowerCase
//		System.out.println(Character.toLowerCase('Z'));
//		System.out.println(Character.toLowerCase(65));
//
//		// method to convert Character to String
//		String xobj = Character.toString('x');
//		System.out.println(xobj);
//
//		// method to convert Character to char primitive data type
//		char alpha = alphaObj.charValue();
//		System.out.println(alpha);

		// Comparing chars using compare which returns int
		// It returns 0 if char1 == char2;
		// a value less than 0 if char1 < char2;
		// and a value greater than 0 if char1 > char1
		System.out.println(Character.compare('b', 'b'));

		// Comparing Character objects using compareTo which returns int
		// It returns 0 if obj1 == obj2;
		// a value less than 0 if obj1 < obj2;
		// and a value greater than 0 if obj1 > obj2
		Character anotherCharacter = Character.valueOf('B');
//		System.out.println(alphaObj.compareTo(anotherCharacter));
	}

}
