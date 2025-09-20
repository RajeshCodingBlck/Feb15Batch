package Prioritypkg;

class Solution {
    public int findKthLargest(int[] nums, int k) {

      PriorityQueue<Integer> pq= new PriorityQueue();

      for(int i=0;i<nums.length;i++){

         if(pq.size()<k){
            pq.add(nums[i]);
         }else{
            pq.add(nums[i]);
            pq.remove();
         }
      }  
      return pq.peek();

    }
}
public class TopKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
