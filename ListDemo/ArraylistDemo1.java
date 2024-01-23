package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo1 {

	public static void main(String[] args) {
		
		int n=5;
		List<Integer> li=new ArrayList<>();
		
		for(int i=1;i<=n;i++) 
			li.add(i);
		System.out.println(li);
		
		for(int i=0;i<li.size();i++)
			System.out.println(li.get(i)+" ");
		
	}

}
