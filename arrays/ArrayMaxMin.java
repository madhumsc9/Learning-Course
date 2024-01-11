package com.qa.arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {
		
		int[] arr= {1,3,4,3,5,5,8,9};
		
		int largest=arr[0];
		int smallest=arr[0];
	    for(int number:arr) {
	    	if(number>largest) {
	    		largest=number;
	    	}
	    	else if(smallest>number) {
	    		smallest=number;
	    	}
	    }
	    System.out.println("number is:"+largest);
	    System.out.println("number is:"+smallest);

	}

}
