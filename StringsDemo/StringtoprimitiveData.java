package com.qa.StringsDemo;

public class StringtoprimitiveData {

	public static void main(String[] args) {
		
		String str="12345";
		
		int i=Integer.parseInt(str);
		System.out.println(i);
		Integer number=Integer.valueOf(str);
		System.out.println(number);
		
		double d=Double.parseDouble(str);
		System.out.println(d);
		
		
		float f=Float.parseFloat(str);
		System.out.println(f);
		
		boolean bool=Boolean.parseBoolean(str);
		System.out.println(bool);
		
	
		
		

	}

}
