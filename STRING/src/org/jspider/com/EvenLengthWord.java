package org.jspider.com;

public class EvenLengthWord {

	public static void main(String[] args) {
		String s="Scanner is a Class";
		String word="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				word=word+s.charAt(i);
			else {
				if(word.length()%2==0) {
					System.out.println(word);
					count++;
				}
				word="";
			}
		}
		if(word.length()%2==0) {
			System.out.println(word);
			count++;
		}
		System.out.println(count);
		
	}

}
