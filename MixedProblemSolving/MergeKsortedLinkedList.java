package MixedProblemSolving;


//https://leetcode.com/problems/merge-k-sorted-lists/submissions/1799220956
 class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

public class MergeKsortedLinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	 class cmp implements Comparator<ListNode>{


	    public int compare(ListNode n1, ListNode n2){

	        if(n1.val<= n2.val){
	            return -1;
	        }else{
	            return 1;
	        }
	    }
	 }

	class Solution {
	    public ListNode mergeKLists(ListNode[] lists) {
	        
	        PriorityQueue<ListNode> pq= new PriorityQueue(new  cmp());

	        for(int i=0;i<lists.length;i++){
	           
	            if(lists[i] !=null){
	                 pq.add(lists[i]);
	            }
	        }

	        ListNode dummy=new ListNode();
	        ListNode tail=dummy;


	        while(pq.size()>0){

	            // remove
	            ListNode rm= pq.remove();

	            // work
	            tail.next=rm;
	            tail=rm;

	            // add their next Node
	            if(rm.next !=null){
	                pq.add(rm.next);
	            }
	        }

	        return dummy.next;

	    }
	}
}
