package Recursion5;

public class NQueue {
	class Solution {

	    public boolean isValid(int currRow, int currCol, int [][] path){

	         // row wise
	        
	         for(int i=0; i<currRow;i++){
	             if(path[i][currCol]==1){
	                return false;
	             }
	         }

	         // diagonal 1
	         int newRow=currRow;
	         int newCol=currCol;
	         while(newRow>=0 && newCol>=0){

	            if(path[newRow][newCol]==1){
	                return false;
	            }
	            newRow--;
	            newCol--;
	         }


	         // disgonal 2
	         newRow=currRow;
	         newCol=currCol;

	         while(newRow>=0 && newCol< path.length){
	             
	              if(path[newRow][newCol]==1){
	                return false;
	            }
	            newRow--;
	            newCol++;
	         }

	         return true;

	         

	    }
	    public void helper(int row, int n, int[][] path,
	     List<List<String>> ans){

	      if(row==n){

	         List<String> currans= new ArrayList();
	         for(int i=0;i<n;i++){
	            String rowString="";
	            for(int j=0;j<n;j++){
	                 if(path[i][j]==0){
	                    rowString+='.';
	                 }else{
	                    rowString+='Q';
	                 }
	            }
	            currans.add(rowString);
	         }
	         ans.add(currans);
	         return ;
	      }

	      for(int col=0; col<n;col++){
	         
	          if(isValid(row, col, path)==true){
	             path[row][col]=1;
	             helper(row+1, n, path, ans);
	             path[row][col]=0;
	          }
	      }

	     }
	    public List<List<String>> solveNQueens(int n) {
	        
	        int [][] path= new int[n][n];
	        List<List<String>> ans= new ArrayList();
	        helper(0, n, path, ans);
	        return ans;
	    }
	}
}
