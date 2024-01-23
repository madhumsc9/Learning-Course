package patternsDemo;

public class SquarePattern {

	public static void main(String[] args) {

		int i, j;
		
		for (i = 0; i < 10; i++) {
		
			for (j = 0; j < 10; j++) {
				
				if (i == 0 || j == 0 || i == 10 - 1 || j == 10 - 1) {
					System.out.print("*");
				}
		
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}
