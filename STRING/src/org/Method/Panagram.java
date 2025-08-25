package org.Method;

import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvxxyzzw";
		if (isPanagram(s)) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not panagram");
		}
	}

	static boolean isPanagram(String s) {
		s=s.toLowerCase();
		HashSet hs=new HashSet();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				hs.add(ch);
			}
		}
		return hs.size()==26;
	}
	

}
