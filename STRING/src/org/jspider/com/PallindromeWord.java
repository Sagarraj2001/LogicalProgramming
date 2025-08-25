package org.jspider.com;

public class PallindromeWord {

	public static void main(String[] args) {
		String s = "abcba";
		s = s.toLowerCase();
		if (isPallindrome(s))
			System.out.println("Pallindrome");
		else
			System.out.println("Not pallindrome");
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
