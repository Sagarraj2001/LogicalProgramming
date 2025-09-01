package com.jsp;

public class DigitCount {

	public static void main(String[] args) {
		int n=1542;
		System.out.println(count(n));
	}

	private static int count(int n) {
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count;
	}

}
