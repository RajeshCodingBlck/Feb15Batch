package Stringpkg;

public class CaseStudyOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str1= new String("Hello");
		String str2= new String("Hello");
		
//		if(str1==str2) {
//			System.out.println("Hum Equal he");
//		}else {
//			System.out.println("Hum Equal nahi he");
//		}
		
		if(str1.equals(str2)) {
			System.out.println("Hum Equal he");
		}else {
			System.out.println("Hum Equal nahi he");
		}
		
		
		String str3= "Hello";
		String str4=  "Hello";
		
		if(str3==str4) {
			System.out.println("Hum Equal he");
		}else {
			System.out.println("Hum Equal nahi he");
		}
	}

}
