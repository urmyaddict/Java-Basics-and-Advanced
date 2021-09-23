package com.java11.advanced;

import java.util.stream.Stream;

public class Stream_String_Lines {

	public static void main(String[] args) {
		
		System.out.println("String.lines() splits on the string by its line terminators and return a stream of strings");
		System.out.println("Use String.liens() on string streamDemo");
		
		String x = "A\nB\nC";
		Stream<String> z = x.lines();
		z.forEach(System.out::println);
		
//		for(String xxx : z) {
//			System.out.println(xxx);
//		}
	}

}
