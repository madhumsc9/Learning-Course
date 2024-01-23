package programmsJava;

import java.util.Scanner;

public class SwithchDemo {

	public static void main(String[] args) {
		
		String sc="madhusudanarao";
		
		//try (Scanner sc = new Scanner(System.in)) {
			//char ch=sc.next().charAt(0);
		
			char ch1=sc.charAt(12);
			switch(ch1) {
			
				    case 'a','e','i','o','u':
					System.out.println("vowel");
				    
			        break;
				    
				    default :
						System.out.println("consonant");
					    

				
			}
		}

}

