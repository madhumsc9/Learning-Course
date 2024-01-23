package loopsDemos;

import java.util.Scanner;

public class largestnumberdemo {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int maxvalue = Integer.MIN_VALUE;
			for (int i = 0; i <= n; i++) {
				int current = sc.nextInt();
				maxvalue = Math.max(maxvalue, current);
			}
			System.out.println(maxvalue);
		}

	}

}
