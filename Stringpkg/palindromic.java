package Stringpkg;

public class palindromic {

	public static String getReverse(String str) {

		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}

		return reverseString;
	}

	public static boolean isPali(String str) {

		String reverseString= getReverse(str);
		if(reverseString.equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static boolean isPaliMethod2(String str) {
		
		int i=0;
		int j= str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)==(str.charAt(j))) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Nitin";
		System.out.println(isPali(str));
	}

}
