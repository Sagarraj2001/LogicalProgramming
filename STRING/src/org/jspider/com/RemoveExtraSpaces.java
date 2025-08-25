package org.jspider.com;

public class RemoveExtraSpaces {
	public static void main(String[] args) {
		String s = "      Scanner   is  a     class   ";
		
		String s1=s.trim().replaceAll("\s+", " ");
		System.out.println(s1);
	}
}
