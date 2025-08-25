package org.jspider.com;

public class ReverseWordofString {

	public static void main(String[] args) {
		String s="Scanner is a class";
		String word="",main="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word=word+s.charAt(i);
			}
			else {
				main=" "+word+main;
				word="";
			}
		}
		main=word+main;
		System.out.println(main);

	}

}
