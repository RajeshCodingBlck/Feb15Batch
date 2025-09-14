package Treepkg;

import java.util.LinkedList;
import java.util.Scanner;

public class MyTree {

	
	 TreeNode root=null;
	 Scanner s= new Scanner(System.in);
	 MyTree(){
//		 root= build();
		 root=buildUsingBFS();
	 }
	private TreeNode buildUsingBFS() {
		// TODO Auto-generated method stub
		
		LinkedList<TreeNode> q= new LinkedList();
		
		System.out.println("Enter the root data");
		int data=s.nextInt();
		TreeNode root= new TreeNode(data);
		q.add(root);
		while(q.size()>0) {
			
			// remove
			 TreeNode rm= q.removeFirst();
			
			// work
			 
			 // LeftChild ko Build karo
			 System.out.println("Enter the data for Left child of "+ rm.data);
			 int leftdata= s.nextInt();
			 if(leftdata !=-1) {
				 TreeNode leftNode= new TreeNode(leftdata);
				 rm.left=leftNode;
			 }
			 
			 // Right child ko Build Karna
			 System.out.println("Enter the data for right child of "+ rm.data);
			 int rightdata= s.nextInt();
			 if(rightdata !=-1) {
				 TreeNode rightNode= new TreeNode(rightdata);
				 rm.right=rightNode;
			 }
			
			// add Their Children
			 
			 if(rm.left !=null) {
				 q.add(rm.left);
			 }
			 if(rm.right !=null) {
				 q.add(rm.right);
			 }
		}
		 return root;
		
	}
	
	
	private TreeNode build() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Data");
		int data= s.nextInt();
		if(data==-1) {
			return null;
		}
		TreeNode root= new TreeNode(data);
		
		 System.out.println("Enter the data "
		 		+ "for Left child "+ data);
		 root.left=  build();
		 
		 System.out.println("Enter the data "
			 		+ "for right child "+ data);
		 root.right= build();
		 return root;
	}
}
