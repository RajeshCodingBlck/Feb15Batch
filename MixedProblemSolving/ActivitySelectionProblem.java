package MixedProblemSolving;

import java.util.Arrays;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n=start.length;
        int [][] arr= new int[n][2];
        
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]= finish[i];
        }
        
        Arrays.sort(arr, (a, b)-> (a[1]-b[1]));
        
        int ans=1;
        int finishTime=arr[0][1];
        for(int i=1;i<n;i++){
            
            if(finishTime<arr[i][0] ){
                ans++;
                finishTime=arr[i][1];
            }
        }
        
        
        return ans;
        
    }
public class ActivitySelectionProblem {

}
