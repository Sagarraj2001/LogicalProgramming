package com.jsp;

public class DecimalToBinary {
	public static void main(String[] args) {
		int dec=18;
		System.out.println(Decimal_Binary(dec));
	}
	static String Decimal_Binary(int dec) {
		String binary="";
		while(dec>0) {
			int rem=dec%2;
			binary=rem+binary;
			dec/=2;
		}
		return binary;
	}
}
