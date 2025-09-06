package HashingPkg;

import java.util.HashMap;

public class FreQuencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,1,3,4,1,1,2,2,3,5,3,2,1,10,1,10};
     
     HashMap<Integer, Integer> hm= new HashMap();
     
     for(int i=0; i<arr.length;i++) {
    	 
//    	  if(hm.containsKey(arr[i])) {
//    		  int oldFre= hm.get(arr[i]);
//    		  hm.put(arr[i], oldFre+1);
//    	  }else {
//    		  hm.put(arr[i], 1);
//    	  }
    	 
    	 hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
     }
  
     for(Integer keys : hm.keySet()) {
    	 System.out.println(keys+ " "+ hm.get(keys));
     }
     
     
	}

}
