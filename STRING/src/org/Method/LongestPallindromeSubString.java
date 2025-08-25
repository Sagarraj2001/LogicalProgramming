package org.Method;

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

	static boolean isPallindrome(String sub) {
		String rev = new StringBuffer(sub).reverse().toString();
		return sub.equals(rev);

	}

}
