package com.qa.StringsDemo;

public class charctersdemo {

	public static void main(String[] args) {

		String str = "madhusudanarao";
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ch[i + 1]) {
				char c=str.charAt(i);
			System.out.print(c);

		}
	}
}}
