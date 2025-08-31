package com.jsp;

public class HappyNumber {
	public static void main(String[] args) {
		int num=7;
		if(isHappy(num))
			System.out.println("Happy Number");
		else
			System.out.println("Not Happy Number");
	}
	
	static boolean isHappy(int num) {
		while(num>9) {
			int sum=0;
			while(num>0) {
				int rem=num%10;
				int sqr=rem*rem;
				sum+=sqr;
				num/=10;
			}
			num=sum;
		}
		return num==1 || num==7;
	}
	
	
}
