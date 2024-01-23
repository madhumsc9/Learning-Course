package programmsJava;

public class SumOfArrays {

	public static void main(String[] args) {
		
		int[] a = {1, 5, 10, 25};
		int [] b= {5,10,25,30};
		int sum = 0;
		 

		// Loop through the array elements and store the sum in the sum variable
		for (int i = 0; i < a.length; i++) {
		  sum = a[i]+b[i];
		}

		System.out.println("The sum is: " + sum);

	}

}
