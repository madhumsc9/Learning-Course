package programmsJava;

public class StringtoIntegerconversion {

	public static void main(String[] args) {
	
		String str="12";
		String s="123456";
		
		Integer integer=Integer.parseInt(str);
		Integer integer1=Integer.valueOf(str);
		System.out.println(integer);
		System.out.println(integer1);
		
		System.out.println("---------------------");
		
		Byte b=Byte.parseByte(str);
		Byte b1=Byte.valueOf(str);
		System.out.println(b);
		System.out.println(b1);
		
		System.out.println("---------------------");
		
		Float f=Float.valueOf(s);
		Float f1=Float.parseFloat(s);
		System.out.println(f);
		System.out.println(f1);
		
		System.out.println("---------------------");
		
		Double d=Double.valueOf(s);
		Double d1=Double.parseDouble(s);
		System.out.println(d);
		System.out.println(d1);
		
		System.out.println("---------------------");
		
		
		
		
	

	}

}
