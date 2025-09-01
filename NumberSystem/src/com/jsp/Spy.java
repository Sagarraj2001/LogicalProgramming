package com.jsp;

public class Spy {
	public static void main(String[] args) {
		int num = 22;
		if (spyCheck(num)) {
			System.out.println("Spy number");
		} else {
			System.out.println("Not Spy");
		}

	}

	public static boolean spyCheck(int num) {
		int sum = 0;
		int product = 1;
		while (num > 0) {
			int rem = num % 10;
			product *= rem;
			sum += rem;
			num /= 10;
		}
		return sum == product;
	}
}
