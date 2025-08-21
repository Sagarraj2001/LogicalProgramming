package org.jspider.com;

public class reverse {

	public static void main(String[] args) {
		String s="Scanner";
		System.out.println(reverseString(s));
	}

	private static String reverseString(String s) {
		s=s.toLowerCase();
		char []ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
		}
		return new String(ch);
	}

}
