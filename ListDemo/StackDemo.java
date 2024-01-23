package ListDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		 
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
 
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
        
        stack.pop();
        System.out.println(stack);
        
        stack.peek();
        System.out.println(stack);
        
        
        while(!stack.isEmpty()) {             
        	
        System.out.println(stack.pop());
        }
        
        }

	}
