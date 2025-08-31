package com.jsp;

public class FindPallindrome {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(isPallindrome(i))
				sum+=i;
		}
		System.out.println(sum);
	}
	static boolean isPallindrome(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return temp==rev;
	}
	
}
