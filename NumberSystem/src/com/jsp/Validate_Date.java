package com.jsp;

public class Validate_Date {
	public static void main(String[] args) {
		int d=29,m=2,y=2025;
		if(d<1 || d>31 || m<1 || m>12 || y<1) {
			System.out.println("Invalid Date");
		}
		else if(m==4 || m==6 || m==9 || m==11) {
			System.out.println("Invalid Date");
		}
		else if(!(y%4 == 0 && y%100 != 0 || y%400 == 0) && m==2 && d>28) {
			System.out.println("Invalid Date");
		}
		else if((y%4 == 0 && y%100 != 0 || y%400 == 0) && m==2 && d>29){
			System.out.println("Invalid Date");
		}
		else {
			System.out.println("Valid Date");
		}
	}
}
