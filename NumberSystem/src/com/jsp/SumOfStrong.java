package com.jsp;

public class SumOfStrong {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(isStrong(i))
				sum+=i;
		}
		System.out.println(sum);
	}
	static boolean isStrong(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			sum+=fact(rem);
			n/=10;
		}
		return sum==temp;
	}
	
	static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
}
