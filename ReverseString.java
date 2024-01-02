package programmsJava;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="manojpandey kumar";
		String rev=" ";
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		
		System.out.println(sb);

	}

}
