package iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPro {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		// Iterating over the List
		for (int i = 0; i < 10; i++)
			al.add(i);
            System.out.println("List is:"+al);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			System.out.println(i + " ");
			
			// Removing odd elements
			if (i % 2 != 0)
				itr.remove();
		}

		// Command for next line
		System.out.println();

		// Printing the elements inside the object
		System.out.println(al);

	}

}
