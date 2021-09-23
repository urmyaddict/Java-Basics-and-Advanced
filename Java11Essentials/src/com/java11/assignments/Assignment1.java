package com.java11.assignments;

public class Assignment1 {
	//METHOD
	static void roots(double a, double b, double c) {
		double dis = (b*b)-(4*a*c);
		if(dis == 0) {
			double root = -b/(2*a);
			System.out.println("The root is "+root);
		} else if(dis > 0) {
			double root1 = (-b-Math.sqrt(dis))/(2*a);
			double root2 = (-b+Math.sqrt(dis))/(2*a);
			System.out.println("The roots are "+root1+" and "+root2);
		} else
			System.out.println("The equations does not have real roots.");
	}
	
	public static void main(String[] args) {
		//MAIN
		roots(1, 4, 4);
		roots(2, 5, 2);
		roots(1, 4, 6);
	}

}
