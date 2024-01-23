package patternsDemo;

public class PascalTriangleDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10 - i; j++) {

				System.out.print(" ");
			}

			int x = 1;
			for (int k = 1; k <= i; k++) {

				System.out.print(x + " ");
				x = x * (i - k) / k;
			}
			System.out.println();

		}

	}
}
