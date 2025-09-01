package com.jsp;

import java.util.Scanner;

public class NearestPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value: ");
		int num = sc.nextInt();
		System.out.println(NearestPrimeNo(num));
	}

	static int NearestPrimeNo(int num) {
		int prev = num--;
		int next = num++;
		if (isPrime(num)) {
			return num;
		}
		while (true) {
			if (isPrime(prev))
				return prev;
			else if (isPrime(next))
				return next;
			prev--;
			next++;
		}
	}

	static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
