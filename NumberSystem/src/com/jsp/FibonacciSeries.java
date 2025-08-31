package com.jsp;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int n = 10;  
		fibonacci(first, second, n);
	}

	static void fibonacci(int f, int s, int n) {
		System.out.print(f + " " + s + " ");  
		for (int i = 3; i <= n; i++) {
			int temp = f + s;
			System.out.print(temp + " ");
			f = s;
			s = temp;
		}
	}
}
