package EnumerationDemo;

import java.util.Enumeration;
import java.util.Vector;

public class Enumdemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		for (int i = 0; i < 10; i++)
		v.add(i);
		System.out.println(v);

		
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
		int i = (Integer) e.nextElement();

		System.out.println(i + " ");

		}
	}
}
