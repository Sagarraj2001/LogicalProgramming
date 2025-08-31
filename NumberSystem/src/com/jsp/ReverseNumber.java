package com.jsp;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=542125;
		System.out.println("Reverse of Number is : "+reverseNo(num));
	}
	public static int reverseNo(int num) {
		int reverse=0;
		while(num>0){
			int rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		return reverse;
	}
}
