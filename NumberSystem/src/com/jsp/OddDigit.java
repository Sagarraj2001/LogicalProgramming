package com.jsp;

public class OddDigit {
	public static boolean iscontainODDdigit(int num) {
		   while(num>0) {
			   int reminder=num%10;
			   if(reminder%2==0) 
				   return false;
			   num/=10;
			   
		   }
			return true;
		   
	}
	public static void main(String args[]) {
		System.out.println(iscontainODDdigit(3553));
	}
}
