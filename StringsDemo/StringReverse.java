package com.qa.StringsDemo;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str=" i am your boss";
		String revStr="";
		
		for(int i=0;i<str.length();i++) {
			revStr=str.charAt(i)+revStr;
		}
		System.out.println("Reverse string is:"+revStr);
	}

}
