package org.jspider.com;

import java.util.Scanner;

public class NthDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "ram is a good boy";
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int dupCount = 0;
		s = s.toLowerCase();
		s=s.replace(" ","");
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
				}
				if (count >1) {
					dupCount++;
					if (dupCount == n) {
						System.out.println(ch[i]);
					}
				}

			}
		}
	}

}
