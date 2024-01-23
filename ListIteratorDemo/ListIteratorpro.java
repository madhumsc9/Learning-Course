package ListIteratorDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorpro {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			al.add(i);
			System.out.println(al);

			// listiterator

			ListIterator<Integer> ltr = al.listIterator();
			while (ltr.hasNext()) {
				int i1 = (Integer) ltr.next();
				System.out.print(i1 + " ");

				if (i1 % 2 == 0) {
					i1++;
					ltr.set(i1);
					ltr.add(i1);
				}
			}

			// Print and display statements
			System.out.println();
			System.out.println(al);
		}
	}
}
