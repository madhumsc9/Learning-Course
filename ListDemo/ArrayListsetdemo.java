package ListDemo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListsetdemo {

	public static void main(String[] args) {
		
		AbstractList<String> list=new ArrayList<>();
		
		list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("10"); 
        list.add("20");
        
        System.out.println("AbstractList:" + list); 
        
        System.out.println(list.set(1, "50"));
        
        System.out.println(list);
        
        List<String> list2 = list.subList(2, 4); 
        
        System.out.println(list2);

	}

}
