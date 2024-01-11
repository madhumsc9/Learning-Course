package com.qa.arrays;

public class Arrayrotate {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 3, 5, 5, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				if (arr[i] == arr[j])
					;
				System.out.print(" "+arr[j]);

			}
			System.out.println();
		}

	}
}