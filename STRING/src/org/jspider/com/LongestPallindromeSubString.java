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

	static boolean isPallindrome(String sub) {
//		String rev = new StringBuffer(sub).reverse().toString();
//		return sub.equals(rev);
		int left = 0, right = sub.length() - 1;
        while (left < right) {
            if (sub.charAt(left) != sub.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

	}

