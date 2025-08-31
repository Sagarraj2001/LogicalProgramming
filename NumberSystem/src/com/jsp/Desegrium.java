package com.jsp;

public class Desegrium {
	public static void main(String[] args) {
		int num= 135;
		if(isDesegrium(num)) {
			System.out.println("desegrium");
		}
		else {
			System.out.println("not desegrium");
		}
	}
	static boolean isDesegrium(int num) {
		int count=count(num);
		int temp=num;
		int sum=0;
		while(num>0) {
			sum+=power(num%10,count);
			count--;
			num/=10;
		}
		return  temp==sum;
	}
	
	static int count(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	static int power(int base,int exp) {
		int pow=1;
		for(int i=1;i<=exp;i++) {
			pow*=base;
		}
		return pow;
	}
	
	
}
