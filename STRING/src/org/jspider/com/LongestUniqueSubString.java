package org.jspider.com;

public class LongestUniqueSubString {

	public static void main(String[] args) {
		String s="abbcbcaacdef";
		String longest="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(isUnique(sub)) {
					if(sub.length()>longest.length()) {
						longest=sub;
					}
				}
			}
		}
		System.out.println(longest);

	}

	private static boolean isUnique(String sub) {
		for(int i=0;i<sub.length()-1;i++) {
			if(sub.charAt(i)==sub.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

}
