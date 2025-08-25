package org.jspider.com;

public class FirstCharacterofWordUpper {

	public static void main(String[] args) {
		String s = "Scanner iS a CLass in JavA";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i]!=' '&& ch[i-1]==' ') {
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
			}
			else if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		s=new String(ch);
		System.out.println(s);
	}

}
