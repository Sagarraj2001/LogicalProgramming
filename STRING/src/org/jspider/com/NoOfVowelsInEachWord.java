package org.jspider.com;

public class NoOfVowelsInEachWord {
	public static void main(String[] args) {
		String s = "Scanner is a class in java";
		s = s.toLowerCase();
		String word = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			} else {
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o'
							|| word.charAt(j) == 'u') {
						count++;
					}
				}
				System.out.println(word + " = " + count);
				word = "";
				count = 0;
			}
		}

		for (int j = 0; j < word.length(); j++) {
			if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o'
					|| word.charAt(j) == 'u') {
				count++;
			}
		}
		System.out.println(word + " = " + count);
	}
}
