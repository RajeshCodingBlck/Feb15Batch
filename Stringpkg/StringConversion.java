package Stringpkg;

public class StringConversion {

	public static String getconvert(String str) {
		
		String updatedString="";
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(ch >='a' && ch<='z') {
				char ch2= (char)(ch-32);
				updatedString+=ch2;
			}else {
				char ch2= (char)(ch+32);
				updatedString+=ch2;
			}
		}
		return updatedString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		char ch='r';
//		
//		if(ch>='a' && ch<='z') {
//			System.out.println("LowerCase character");
//		}else {
//			System.out.println("UpperCase character");
//		}
//		
//		char ch2= (char)(ch -32);
//		System.out.println(ch2);
		
		String str="abABcdCD";
		System.out.println(getconvert(str));
		
		
	}

}
