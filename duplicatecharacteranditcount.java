package programmsJava;

import java.util.HashMap;
import java.util.Map;

public class duplicatecharacteranditcount {

	public static void main(String[] args) {
		
		String str="manojpandey";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	    char[] a = str.toCharArray();

	    for (char value: a){

	       if (Character.isAlphabetic(value)) {
	           if (charMap.containsKey(value)) {
	               charMap.put(value, charMap.get(value) + 1);

           } else {
              charMap.put(value, 1);
	           }
	       }
	    }

	    System.out.println(charMap);
	    
	}
	}