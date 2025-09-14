package Treepkg;

import java.util.ArrayList;
import java.util.LinkedList;

public class Client2 {

	
	public static void PreOrder(TreeNode root) {
		
		 if(root==null) {
			 return ;
		 }
		
		System.out.print(root.data+ " ");
		PreOrder(root.left);
		PreOrder(root.right);
		
		
	}
	
	public static void InOrder(TreeNode root) {
		
		if(root==null) {
			 return ;
		 }
		
		InOrder(root.left);
		System.out.print(root.data+ " ");
		InOrder(root.right);
	}
	
	
	public static int countNodes(TreeNode root) {
		
		 if(root==null){
             return 0;
        }

        int LeftCount= countNodes(root.left);
        int rightCount=countNodes(root.right);
        int MeraCount= LeftCount+ rightCount+1;
        return MeraCount;
		
	}
	
	public static int sumOfNodes(TreeNode root) {
		
		 if(root==null) {
			 return 0;
		 }
		
		 int leftSum=sumOfNodes(root.left);
		 int rightSum=sumOfNodes(root.right);
		 int totalSum= leftSum+ rightSum+ root.data;
		 return totalSum;
	}
	
	 public static int maxDepth(TreeNode root) {

	      if(root==null){
	          return 0;
	      }
	       if(root.left==null && root.right==null){
	         return 1;
	       }
	       int  leftHeight= maxDepth(root.left);
	       int rightHeight=maxDepth(root.right);
	       int MeraHeight= Math.max(leftHeight, rightHeight) +1;
	       return MeraHeight;

	 }
	 
	 public static void printPath(TreeNode root, String ans) {
		 
		 if(root==null) {
//			 System.out.println(ans);
			 return;
		 }
		 
		 if(root.left== null && root.right==null) {
			 ans+=root.data;
			 System.out.println(ans);
			 return;
		 }
		 printPath(root.left, ans+root.data);
		 printPath(root.right, ans+root.data );   
	 }
	 
	public static void BFS(TreeNode root) {
		
		 LinkedList<TreeNode> q= new LinkedList();
		 
		 q.add(root);
		 while(q.size()>0) {
			 
			 // remove
			 TreeNode rm= q.removeFirst();
			 // work
			 
			 System.out.print(rm.data+" ");
			 
			 // add their Children
			 
			 if(rm.left!=null) {
				 q.add(rm.left);
			 }
			 if(rm.right !=null) {
				 q.add(rm.right);
			 }
		 }
		 
		 
	}
	
	public void inOrder(TreeNode root, ArrayList<Integer> list){

        if(root==null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    public boolean isValidBST(TreeNode root) {
        
        ArrayList<Integer> list= new ArrayList();
        inOrder(root, list);

         
         for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
         }
         return true;


    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 MyTree t= new MyTree(); 
//		 PreOrder(t.root);
		 System.out.println();
//		 InOrder(t.root);
//		 printPath(t.root, "");
		 BFS(t.root);
		  // 1 2 4 -1 -1 -1 3 -1 -1
		 //  1 2 4 -1 -1 5 -1 -1 3 -1 -1
		 
		 
		 
	}

}
