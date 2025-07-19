package RecursionPart3;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String str1= new String("Hello");
		String str2="Hello";
		
		
		System.out.println(str1);
		
		String str3=new String("Hello");
		String str4= "Hello";
		
		if(str1.equals(str3)) {
			System.out.println("Me Equal Hu");
		}else {
			System.out.println("Me Equal Nahi hu");
		}
		
		if(str2==str4) {
			System.out.println("Me Equal Hu");
		}else {
			System.out.println("Me Equal Nahi hu");
		}
		
		
		
		str4= str4+"e";
		System.out.println(str2);
		System.out.println(str4);
		
		System.out.println(str2.charAt(1));
		
		System.out.println(str1.substring(1,));
		
		
		
		
		
	}

}
