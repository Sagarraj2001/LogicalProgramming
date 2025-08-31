package com.jsp;

public class PrimeSum {
	public static void main(String[] args) {
		int num=2657;
		System.out.println("Sum= "+primeSum(num));
	}
	public static int primeSum(int num) {
		int sum=0;
		while(num>0){
			int rem=num%10;
			if(rem ==2 || rem==3|| rem==5||rem==7) {
				sum+=rem;
			}
			num/=10;
		}
		return sum;
	}

}
