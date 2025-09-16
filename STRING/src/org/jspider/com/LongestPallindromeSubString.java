package org.jspider.com;

public class LongestPallindromeSubString {

	public static void main(String[] args) {
		String s = "abcsbaca";
		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				if (isPallindrome(sub)) {
					if (sub.length() > longest.length()) {
						longest = sub;
					}
				}

			}
		}
		System.out.println(longest);
	}

	static boolean isPallindrome(String s) {
		String temp = s;
		char ch[] = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char tem = ch[i];
			ch[i] = ch[j];
			ch[j] = tem;
			i++;
			j--;
		}
		s = new String(ch);
		return temp.equals(s);
	}

}
