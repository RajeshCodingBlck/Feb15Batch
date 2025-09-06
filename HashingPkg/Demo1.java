package HashingPkg;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   String str1="Hello";
	   
	   System.out.println(str1.hashCode());
	   
	   Boolean val=true;
	   
	   System.out.println(val.hashCode());
	   
	   Boolean val2=false;
	   System.out.println(val2.hashCode());
	   
	   Integer val3=123;
	   System.out.println(val3.hashCode());
	   
	   Double val4=123.4;
	   System.out.println(val4.hashCode());
	   
	   Character ch= 'a';
	   System.out.println(ch.hashCode());
	   
	   String str3="FB";
	   String str4="Ea";
	   
	   System.out.println(str3.hashCode());
	   System.out.println(str4.hashCode());
	   
	   
	}

}
