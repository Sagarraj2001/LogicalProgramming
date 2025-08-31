package com.jsp;

public class PallindromeNumber {
	public static void main(String[] args) {
	int num=123432;
	if(isPallindrome(num)) {
		System.out.println("Given no is Pallindrome");
	}
	else {
		System.out.println("Given No is not a Pallindrome");
	}
}
	public static boolean isPallindrome(int num) {
		int reverse=0;
		int original =num;
		
		while(num>0){
			int rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		return (original== reverse) ? true : false;
	}

}
