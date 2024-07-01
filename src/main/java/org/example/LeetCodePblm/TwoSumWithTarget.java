package org.example.LeetCodePblm;

import java.util.Arrays;

public class TwoSumWithTarget {
    static int[] TwoSum(int[] nums, int target){
        int k=0;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    ans[k]=nums[i];
                    ans[++k]=nums[j];
                }
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,6};
        int target = 9;
        nums = TwoSum(nums,target);
        System.out.println(Arrays.toString(nums));
    }
}
