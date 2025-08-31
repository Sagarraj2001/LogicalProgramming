package com.jsp;

public class Bigger {
	public static void main(String[] args) {
		int a=10,b=10,c=1;
		System.out.println(a<b? a<c?a:c:b<c?b:c);
		System.out.println((a<b && a<c ? a:(b<c)?b:c));
	}
}
