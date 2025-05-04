package SortingPackage;

import java.util.Arrays;

public class Sort01 {

	public static void getSort(int [] arr) {
		int count0=0;
		int count1=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}else {
				count1++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i<count0) {
				arr[i]=0;
			}else {
				arr[i]=1;
			}
		}
		
		
	}
	
	public static void getSort2(int [] arr) {
		
		int n=arr.length;
		int [] newArray= new int[n];
		
		int i=0;
		int j=n-1;
		
		for(int k=0; k<arr.length;k++) {
			if(arr[k]==0) {
				newArray[i]=arr[k];
				i++;
			}else {
				newArray[j]=arr[k];
				j--;
			}
		}
		
		for(int k=0;k<newArray.length;k++) {
			arr[k]=newArray[k];
		}
		
		
	}
	
	public static void getSort3(int [] arr) {
		
		int index=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				// work
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
				
			}else {
				continue;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,0,1,0,0,1,0};
      //Arrays.sort(arr);
      getSort3(arr);
      System.out.println();
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
	}

}
