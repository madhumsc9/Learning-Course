package QueueDEMO;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
	      q.add(6);
	      q.add(1);
	      q.add(8);
	      q.add(4);
	      q.add(7);
	      System.out.println("The queue is: " + q);
	      
	            
	      q.peek();
	      System.out.println(q);
	      
	      q.remove();
	      System.out.println(q);
	      
	      int head1 = q.peek();
	      System.out.println("The head1 of the queue is: " + head1);
	      
	      q.poll();
	      System.out.println(q);

	}

}
