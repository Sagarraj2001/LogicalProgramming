package org.jspider.com;

public class CheckUniqueString {

	public static void main(String[] args) {
		String s = "Sidhart";
		if (isUnique(s))
			System.out.println("Given String is Unqiue");
		else
			System.out.println("Given String is not Unqiue");
	}

	static boolean isUnique(String s) {
		 s=s.toLowerCase();
		 for(int i=0;i<s.length();i++) {
			 for(int j=i+1;j<s.length();j++) {
				 if(s.charAt(i)==s.charAt(j))
					 return false;
			 }
		 }
		 return true;
	}

}
