package com.jsp;

public class SingleDigitSum {
	public static void main(String[] args) {
		int num = 5545;
		System.out.println(singleDigitSum(num));
	}

	static int singleDigitSum(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return count(sum) == 1 ? sum : singleDigitSum(sum);

	}

	static int count(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}
