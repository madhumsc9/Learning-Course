package com.qa.arrays;

public class Arrayduplicates {

	public static void main(String[] args) {
		
		int[] arr= {1,3,4,3,5,5,8,9};
		//System.out.println("arr is:"+arr);
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
