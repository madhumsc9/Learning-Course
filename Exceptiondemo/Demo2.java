package Exceptiondemo;

public class Demo2 {

	public static void main(String[] args) {

		try {
			
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[13]);
		}

		catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Something went wrong.");
		}
		
		finally {
			System.out.println("some went wrong");
		}
	}
	}

