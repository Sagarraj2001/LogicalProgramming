package com.jsp;
import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int finalPrime=0;
		while(true) {
			if(Isprime(i)) {
				finalPrime=i;
				n--;
			}
			if(n<=0) {
				System.out.println(finalPrime);
				break;
			}
				
			i++;
		}
		
	
	}
	static boolean Isprime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) 
				return false;
		}
		return true;
	}

}
