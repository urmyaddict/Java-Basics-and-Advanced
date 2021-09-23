package com.java11.questions;

import java.util.ArrayList;
import java.util.List;

public class Question {

	public static void main(String[] args) {
		List<Double> a = new ArrayList<Double>();
//		a.add(new Integer(4)); // error since difference in wrapper data type
		System.out.println(a);
		
		
		System.out.println("Unresolved compilation problem:\n"+"The method add(Double) in the type List<Double> is not applicable for the arguments (Integer)");
	}
}
