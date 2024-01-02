package programmsJava;

public class DuplicateremoveString {

	public static void main(String[] args) {
		
		String str="AAABBBCCC";
		String res="";
		
		for(int i=0;i<str.length();i++) {
			String ch=""+str.charAt(i);
			if(res.contains(ch))
			{continue;}
			res+=ch;
		    }
             System.out.println(res);
	}

}
