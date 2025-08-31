package com.jsp;

public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		if(isArmstrong(num))
			System.out.println("Given No is ArmStrong");
		else
			System.out.println("Given No is not ArmStrong");
		
	}
	
	static boolean isArmstrong(int num) {
		int sum=0;
		int temp=num;
		int count = count(num);
		while(num>0) {
			sum+=power(num%10,count);
			num/=10;
		}
		return  sum==temp;
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
