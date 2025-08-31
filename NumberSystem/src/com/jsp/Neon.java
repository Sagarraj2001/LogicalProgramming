package com.jsp;

public class Neon {
	public static void main(String[] args) {
		int num=9;
		if(isNeon(num)) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not neon number");
		}
	}
	public static boolean isNeon(int num) {
		int square=square(num);
		int sum=0;
		while(square>0) {
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		return sum==num ? true : false;
		
	}
	public static int square(int num) {
		return num*num;
	}
}
