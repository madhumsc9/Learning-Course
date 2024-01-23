package setDemo;

import java.util.HashSet;
import java.util.Set;

public class Demosetfromarray {

	public static void main(String[] args) {
		Set<String> abs_col = new HashSet<String>();
		 
        // Use add() method to add
        // elements into the Set
        abs_col.add("Welcome");
        abs_col.add("To");
        abs_col.add("Geeks");
        abs_col.add("For");
        abs_col.add("Geeks");
        
        System.out.println(abs_col);
        
        Object[] arr=abs_col.toArray();
        System.out.println("The array is:");
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }

	}

}
