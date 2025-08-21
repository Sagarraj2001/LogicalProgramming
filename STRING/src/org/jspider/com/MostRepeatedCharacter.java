package org.jspider.com;

public class MostRepeatedCharacter {

	public static void main(String[] args) {
		String s = "Scanner is a class in Java";
		s = s.toLowerCase();
		s = s.replace(" ", "");
		int mostRepeat = 0;
		char repeatChar = ' ';
		char ch[] = s.toCharArray();
		boolean b[] = new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] >= 'a' && ch[i] <= 'z') {
						if (ch[i] == ch[j]) {
							b[j] = true;
							count++;
						}
					}
					if (count > 1) {
						if (count > mostRepeat) {
							mostRepeat = count;
							repeatChar = ch[i];
						}
					}
				}
			}
		}
		System.out.println(repeatChar);

	}

}
