package com.jsp;

public class OctalToDecimal {

	public static void main(String[] args) {
		int oct = 113; 
		System.out.println(OctToDec(oct));
	}

	static int OctToDec(int oct) {
		int dec = 0;
		int power = 0;

		while (oct > 0) {
			int digit = oct % 10;
			dec += digit * Math.pow(8, power);
			oct /= 10;
			power++;
		}
		return dec;
	}

}
