package patternsDemo;

public class TrianglepatternDEMO {

	public static void main(String[] args) {

		int i, j;

		for (i = 0; i < 10; i++) {

			for (j = 10 - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}
}
