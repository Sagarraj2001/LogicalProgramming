package org.jspider.com;

public class First3Duplicate {

	public static void main(String[] args) {
		String s = "abcfdbcdefbcdefdfe";
		s = s.toLowerCase();
		char ch[] = s.toCharArray();
		int dupCount = 1;
		boolean b[] = new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						b[j] = false;
						count++;
					}
				}
				if (count > 1 && dupCount <= 3) {
					System.out.println(ch[i]);
					dupCount++;

				}
			}
		}

	}

}
