package org.jspider.com;

public class ReverseEachWordSentence {

	public static void main(String[] args) {
		String s = "Ram is good";
        String main = "", word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word = s.charAt(i) + word; 
            } else {
                main = main + word + " "; 
                word = "";
            }
        }

        main = main + word;
        System.out.println(main);

	}

}
