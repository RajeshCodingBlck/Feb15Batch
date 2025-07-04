package Stringpkg;

public class LexicalStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str1= "abc";
		String str2= "abcdddd";
		
		System.out.println(str1.compareTo(str2));
		
		if(str1.compareTo(str2)>0) {
			System.out.println("Str1 is Larger than Str2");
		}else if(str1.compareTo(str2)<0) {
			System.out.println("Str1 is Smaller than Str2");
		}else {
			System.out.println("Str1 is  Equal to Str2");
		}
		
		
	}

}
