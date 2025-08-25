package org.jspider.com;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Cat";
		String s2="tca";
		if(isAnagram(s1,s2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

	private static boolean isAnagram(String s1, String s2) {
		s1=s1.toLowerCase();
		char ch1[]=s1.toCharArray();
		s2=s2.toLowerCase();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}

}
