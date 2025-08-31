package com.jsp;
import java.util.Scanner;

public class PrintStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int a,b=sc.nextInt();
		
		int a,b;
		a=b=sc.nextInt();
		System.out.println(a+b);
		

		
		System.out.println(a>b?a+ "is bigger":b+" is bigger");

	}

}
