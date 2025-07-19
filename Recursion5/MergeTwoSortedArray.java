package Recursion5;

public class MergeTwoSortedArray {

	
	public static int [] mergeTwoArray(int [] arr1, 
			int [] arr2) {
		
		int n1= arr1.length;
		int n2= arr2.length;
		int [] ans= new int[n1+ n2];
		
		int index=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				ans[index]= arr1[i];
				i++;
				index++;
			}else {
				ans[index]=arr2[j];
				j++;
				index++;
			}
		}
		
		while(i<arr1.length)
		{
			ans[index]= arr1[i];
			i++;
			index++;
		}
		
		while(j<arr2.length) {
			ans[index]= arr2[j];
			j++;
			index++;
		}
		
		
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr1= {1,2,4,6,7,10,12};
		int [] arr2= {2,3,5,8, 12, 14,15};
		
		int [] ans= mergeTwoArray(arr1, arr2);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
	}

}
