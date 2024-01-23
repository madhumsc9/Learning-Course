package programmsJava;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Throwable {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String name = reader.readLine();

		// Printing the read line
		System.out.println(name);
	}

}
