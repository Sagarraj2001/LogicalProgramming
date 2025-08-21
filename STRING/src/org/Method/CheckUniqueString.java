package org.Method;

import java.util.HashSet;

public class CheckUniqueString {

	public static void main(String[] args) {
		String s = "Sidhart";
		if (isUnique(s))
			System.out.println("Given String is Unqiue");
		else
			System.out.println("Given String is not Unqiue");
	}

	static boolean isUnique(String s) {
		HashSet hs=new HashSet();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		return s.length()==hs.size();
	}

}
