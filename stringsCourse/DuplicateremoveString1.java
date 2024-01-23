package stringsCourse;

import java.util.Scanner;

public class DuplicateremoveString1 {
	String str="AAABBBCCC";
	String res="";
	
	for(int i=0;i<str.length();i++) {
		String ch=""+str.charAt(i);
		if(res.contains(ch))
		{continue;}
		res+=ch;
	    }
         System.out.println(res);

	public static void main(String[] args) {
		
		Scanner myobj=new Scanner(System.in);
		
		String result=myobj.nextLine();
		
		System.out.println(result);
	}

}
}