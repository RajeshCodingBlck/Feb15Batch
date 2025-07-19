package RecursionPart4;

import java.util.*;
public class SubsequenceInArray {

	
	public static void subseq(int [] arr, int i, 
			ArrayList<Integer> ans) {
	
		if(i==arr.length) {
			System.out.println(ans);
			return;
		}
		
		// arr[i] ko aapne subseq ka part banage.
		ans.add(arr[i]);
		subseq(arr, i+1, ans);
		ans.remove(ans.size()-1);
		// Not pick
		subseq(arr, i+1, ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3};
		ArrayList<Integer> ans= new ArrayList();
		subseq(arr, 0, ans);
		
	}

}
