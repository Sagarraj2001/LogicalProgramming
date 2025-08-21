package org.jspider.com;

public class CaseChanger {
	public static void main(String[] args) {
		String s="ScanNer is java Class";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		s=new String(ch);
		System.out.println(s);
	}
}
