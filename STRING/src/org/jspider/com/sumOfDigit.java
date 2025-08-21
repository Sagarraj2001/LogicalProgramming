package org.jspider.com;

public class sumOfDigit {
	public static void main(String[] args) {
		String s = "sagar4SG67hhs871";
		s = s.toLowerCase();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum += s.charAt(i) - 48;
			}
		}
		System.out.println(sum);
	}
}
