package com.jsp;

public class ProductDigit {
	public static int DigitProduct(int num) {
		int product=1;
		while(num>0) {
			int rem=num%10;
			num/=10;
			if(rem==0) {
				continue;
			}
			product*=rem;
		}
		return product;
	}
	public static void main(String[] args) {
		int num=969304625;
		System.out.println("product is : "+DigitProduct(num));	
	}
}

