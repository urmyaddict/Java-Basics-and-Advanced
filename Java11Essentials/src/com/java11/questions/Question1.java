package com.java11.questions;

public class Question1 {
	
	public void testMethod(String str) {
		if((str==null) | (str.length()==0)) {
//		if((str==null) || (str.length()==0)) {
			
			System.out.println("Empty");
		} else {
			System.out.println("Not empty");
		}
	}
	
	static int age;

	
	public static void main(String[] args) {
		
//		 Q6. null and null pointer exception
		Question1 q = new Question1();
		q.testMethod(null);
		
		//70+10+""+50+50
//		String s = 70+10+""+50+50;
//		System.out.println(s);
		
		//not initialized
//		int age;
//		age = age + 1; 
// 		System.out.println("The age is " + age);
		
	}

}
