package org.jspider.com;

public class UniqueCharacter {

	public static void main(String[] args) {
		String s="Sagar raj";
		s=s.toLowerCase();
		char []ch=s.toCharArray();
		boolean b[]=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				if(b[i]==false) {
					int count=1;
					for(int j=i+1;j<ch.length;j++) {
						if(ch[i]==ch[j]) {
							count++;
							b[j]=true;
						}
					}
					if(count ==1) {
						System.out.println(ch[i]+"->"+count);
					}
				}
			}
			
		}
	}

}
