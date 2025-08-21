package org.jspider.com;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String s="Scanner";
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		boolean b[]=new boolean[ch.length];
		System.out.println("Duplicates Characters Are : ");
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]>='a' && ch[i]<='z') {
						if(ch[i]==ch[j])
						{
							b[j]=true;
							count++;
						}
					}
				}
				if(count>1) {
					System.out.println(ch[i]);
				}
			}
		}
	}

}
