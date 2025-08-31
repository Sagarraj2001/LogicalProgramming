package com.jsp;

public class DecimalToHexaDecimal {
		public static void main(String[] args) {
			int dec=75;
			System.out.println(DecToHexa(dec));
		}
		static String DecToHexa(int dec) {
			String Hexa="";
			while(dec>0) {
				int rem=dec%16;
					if(rem>9) {
						Hexa=(char)(rem+55)+Hexa;
						
					}
				else {
					Hexa=rem+Hexa;
				}
				
				dec/=16;
			}
			return Hexa;
		}
	}



