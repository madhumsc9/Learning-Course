package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		 // Creating an empty HashMap 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        // Inserting pairs in above Map 
        // using put() method 
        hm.put("a", new Integer(100)); 
        hm.put("b", new Integer(200)); 
        hm.put("c", new Integer(300)); 
        hm.put("d", new Integer(400)); 
        
        System.out.println(hm);
  
        // Traversing through Map using for-each loop 
        for (Map.Entry<String, Integer> me : hm.entrySet()) { 
  
            // Printing keys 
            System.out.println(me.getKey() + ":"+ me.getValue()); 

	}

}
}