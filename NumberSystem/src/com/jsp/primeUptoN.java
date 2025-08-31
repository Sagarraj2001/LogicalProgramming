package com.jsp;
import java.util.Scanner;
public class primeUptoN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		while(true) {
			if(Isprime(i)) {
				System.out.println(i);
				n--;
			}
			if(n<=0)
				break;
			i++;
		}

	}
	
	
static boolean Isprime(int n) {
	if(n==1)
		return false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
}
