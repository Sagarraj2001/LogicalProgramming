package com.jsp;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		
		
		if(isArmstrong(num))
			System.out.println("ArmStrong number");
		else
			System.out.println("Not ArmStrong");
		}
	
	static boolean isArmstrong(int num) {
		String s=num+"";
		int count=s.length();
		int sum=0;
		int temp=num;
		while(num>0) {
			sum+=Math.pow(num%10,count);
			num/=10;
		}
		return sum==temp;
	}

}
