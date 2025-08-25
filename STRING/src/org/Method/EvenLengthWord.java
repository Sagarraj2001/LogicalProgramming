package org.Method;

public class EvenLengthWord {

	public static void main(String[] args) {
		String s="Scanner is a Class";
		s=s.toLowerCase();
		String arr[]=s.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println(count);
	}

}
