package RecursionPart4;

public class WrapperClass {

	
	public static void update(Integer a) {
		
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Integer a=12;
//		System.out.println(a);
//		update(a);
//		System.out.println(a);
		
//		Integer a= new Integer(12);
//		System.out.println(a);
//		
//		
//		Integer b=12;
//		
//		System.out.println(b);
		
//		Integer a1= 100;
//		Integer a2=100;
//		
//		if(a1==a2) {
//			System.out.println("HUm Same he");
//		}else {
//			System.out.println("Hum Same nahi he");
//		}
//		
//		
//		Integer b1=1000;
//		Integer b2= 1000;
//		
//		
//		if(b1==b2) {
//			System.out.println("HUm Same he");
//		}else {
//			System.out.println("Hum Same nahi he");
//		}
//		
//		a1++;
//		System.out.println(a1);
//		System.out.println(a2);
		
		
		int a=12;
		
//		Integer b= a;
		Integer b= Integer.valueOf(a);
		System.out.println(b);
		
		
//		int c= b;
		int c= b.intValue();
		
		System.out.println(c);
		
		System.out.println(Integer.toBinaryString(13));
		
		
		
	}

}
