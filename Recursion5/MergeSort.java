package Recursion5;

public class MergeSort {

	
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
	public static int [] mergeSort(int [] arr, int s, int e) {
		
		
		if(s==e) {
			int [] baseArray= new int[1];
			baseArray[0]=arr[s];
			return baseArray;
		}
		
		int mid= (s+e)/2;
		
		 int [] left= mergeSort(arr,s, mid );
		 int [] right= mergeSort(arr, mid+1,e);
		 int [] ans= mergeTwoArray(left, right);
		 return ans;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,3,2,6,5,10};
		int [] ans=mergeSort(arr, 0, arr.length-1);
		
		for(int val : ans) {
			System.out.print(val+" ");
		}
		
		
	}

}
