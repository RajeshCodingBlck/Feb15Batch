package Bitmanipulation;

class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;

        int xorForRange=0;
        for(int i=0;i<=n;i++){
            xorForRange^=i;
        }

        int xorForArray=0;
        for(int i=0;i<nums.length;i++){
             xorForArray^=nums[i];
        }

        return  xorForRange^ xorForArray;
        
    }
}

public class MissingNumber {

}
