package org.jspider.com;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String s="Sagariawq1Raj@";
		int cc=0;
		int vc=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o' || s.charAt(i)=='u') {
					vc++;
				}
				else {
					cc++;
				}
			}
		}
		System.out.println("Vowel count : "+vc);
		System.out.println("Consonant count : "+cc);
	}

}
