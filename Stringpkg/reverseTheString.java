package Stringpkg;

public class reverseTheString {

	
	public static String getReverse(String str) {
		
		String reverseString="";
		for(int i=str.length()-1; i>=0;i--) {
			reverseString += str.charAt(i);
		}
		
		return reverseString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcdef";
		
		System.out.println(getReverse(str));
		
		
	}

}
