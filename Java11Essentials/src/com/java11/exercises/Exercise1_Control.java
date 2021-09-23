package com.java11.exercises;

public class Exercise1_Control {

	static int reverse(int r) {
		int sum = 0, rem;
		while (r != 0) {
			rem = r % 10;
			sum = sum * 10 + rem;
			r = r / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int input = 1523;

		int temp = reverse(input), place = 1, sum = 0;
		while (temp != 0) {
			if (place % 2 == 0) {
				int rem = temp % 10;
				sum += (rem * rem);
			}
			temp = temp / 10;
			place++;
		}
		if (sum % 9 == 0) {
			System.out.println("The number " + input + " is a Lucky number");
			System.out.println(sum);
		} else {
			System.out.println("Oops! Not a lucky number");
			System.out.println(sum);
		}

	}
}
