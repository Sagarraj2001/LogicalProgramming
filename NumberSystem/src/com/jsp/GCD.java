package com.jsp;

public class GCD {

	public static void main(String[] args) {
		int n1=10,n2=30;
		System.out.println(gcd(n1,n2));
	}

	private static int gcd(int n1, int n2) {
		int gcdRes=1;
		for(int i=1;i<=n2;i++) {
			if(n1%i==0 && n2%i==0)
				gcdRes=i;
		}
		return gcdRes;
	}

}
