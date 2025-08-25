package org.jspider.com;

public class Panagram {

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvxxyzw";
		if (isPanagram(s)) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not panagram");
		}
	}

	static boolean isPanagram(String s) {
		s = s.toLowerCase();
		s = s.replace(" ", "");
		boolean b[] = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				b[ch - 97] = true;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] == false)
				return false;
		}
		return true;
	}

}
