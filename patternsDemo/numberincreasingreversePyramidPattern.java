package patternsDemo;

public class numberincreasingreversePyramidPattern {

	public static void main(String[] args) {
		
		int i, j;
        // outer loop to handle number of rows
        for (i = 10; i >= 1; i--) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }
 
            // print new line for each row
            System.out.println();

	}

}
}