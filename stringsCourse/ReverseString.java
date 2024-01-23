package stringsCourse;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="manojpandey kumar";
		
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		
		System.out.println(sb);

	}

}
