package com.jsp;

public class StrongNo {
	public static void main(String[] args) {
		int num = 145;
		if (isStrong(num)) {
			System.out.println("Given No is Strong");
		} else {
			System.out.println("Given No is not a strong no");
		}
	}

	public static boolean isStrong(int num) {
		int sum = 0;
		int original = num;
		while (num > 0) {
			int rem = num % 10;
			int res = fact(rem);
			sum += res;
			num /= 10;
		}
		return original == sum;
	}

	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}
