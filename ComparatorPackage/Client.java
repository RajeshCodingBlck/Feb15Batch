package ComparatorPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class cmpBasedOnPrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		
		if(p1.price < p2.price) {
			 return -1;
		}else {
			 return 1;
		}
	}	
}

class cmpBasedOnCustomerrating implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.customerRating < p2.customerRating) {
			 return -1;
		}else {
			 return 1;
		}
	}
	
	
	
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  Product iPhoneAir= new Product(130000,"Bad",2.5);
	  Product iPhone17= new Product(80000,"Good ",3.5);
	  Product iPhone17Pro= new Product(120000,"Good ",4.0);
	  Product iPhone17proMax= new Product(145000,"Good ",4.5);
	  
	  
	  ArrayList<Product> arr= new ArrayList();
	  arr.add(iPhoneAir);
	  arr.add(iPhone17);
	  arr.add(iPhone17proMax);
	  arr.add(iPhone17Pro);
	  
	  Scanner s= new Scanner(System.in);
	  
	  String str= s.next();
	  
	  if(str.equals("Price")) {
		
		   Collections.sort(arr, new cmpBasedOnPrice());
		   for( Product P : arr) {
				  System.out.println(P.price);
			  }
	  }else if(str.equals("customerRating")) {
		  Collections.sort(arr, new cmpBasedOnCustomerrating());
		  for( Product P : arr) {
			  System.out.println(P.customerRating);
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
