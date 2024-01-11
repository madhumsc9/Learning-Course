package com.qa.StringsDemo;

public class Vowelsidentify {

	public static void main(String[] args) {

		String str = "madhusudanarao";
		char[] ch = str.toCharArray();

		for (char c : ch) {
			System.out.println(c);

			if (str.contains("||'a'||'e'||'i'||'o'||'u'||")) {
				System.out.println(true);
			} else {
				System.out.print(false);
			}

		}
	}
}
