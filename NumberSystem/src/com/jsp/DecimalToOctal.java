package com.jsp;

public class DecimalToOctal {
	public static void main(String[] args) {
		int dec=75;
		System.out.println(DecToOct(dec));
	}
	static String DecToOct(int dec) {
		String oct="";
		while(dec>0) {
			int rem=dec%8;
			oct=rem+oct;
			dec/=8;
		}
		return oct;
	}
}
