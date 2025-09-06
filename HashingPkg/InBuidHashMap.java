package HashingPkg;

import java.util.HashMap;
import java.util.Map;

public class InBuidHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		HashMap<String, Integer> hm= new HashMap();
		
		// add
		hm.put("Rohan", 50);
		hm.put("Anil", 40);
		hm.put("Aman", 30);
		
		System.out.println(hm);
	
		
	     // read
		System.out.println(hm.get("Rohan"));
		System.out.println(hm.get("Anil"));
		System.out.println(hm.get("Akash"));
		
		
		System.out.println(hm.getOrDefault("Rohan", -1));
		System.out.println(hm.getOrDefault("Akash", -100));
		
		
		// check Any key present or not in hashMap
		System.out.println(hm.containsKey("Rohan"));
		System.out.println(hm.containsKey("Akash"));
		
		
		// remove the key from hashMap
		
		hm.remove("Rohan");
		
		System.out.println(hm);
		
		// update
		
		hm.put("Aman", 100);
		System.out.println(hm);
		
		
		
		// For Each 
		
//		 int [] arr= {1,2,3,4,5};
//		 
//		 for( int val: arr) {
//			 System.out.println(val);
//		 }
		
		 System.out.println(hm.keySet());
		 for( String keys: hm.keySet()) {
			 System.out.println(keys +" "+ hm.get(keys));
		 }
		 
		 for( int val: hm.values()) {
			 System.out.println(val);
		 }
		 
		 for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			 System.out.println(entry.getKey()+ " "+ entry.getValue());
		 }
		
		
		
		
	}

}
