package org.jspider.com;

public class LastCharacterofWordUpper {

	public static void main(String[] args) {
		String s="Scanner iS a CLass in JavA";;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==ch.length-1 && ch[i]!=' ' || ch[i+1]==' ' && ch[i]!=' ') {
				if(ch[i]>='a' && ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
			}
			else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		s=new String(ch);
		System.out.println(s);
	}

}
