package com.jsp;

public class PrimeNumber {

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		System.out.println("Prime numbers between " + start + " and " + end + " are:");
		printPrimes(start, end);
	}

	static void printPrimes(int s, int e) {
		for (int i = s; i <= e; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
