package com.jsp;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int binary=10010;
		System.out.println(BinToDec(binary));
	}
	static int BinToDec(int bin) {
		int dec=0;
		int pow=0;
		while(bin>0) {
			int rem=bin%10;
			dec+=rem*square(2,pow);
			pow++;
			bin/=10;
		}
		return dec;
		
	}
	
	static int square(int b,int p) {
		int pow=1;
		for(int i=1;i<=p;i++) {
			pow*=b;
		}
		return pow;
	}

}
