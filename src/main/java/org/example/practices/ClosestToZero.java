package org.example.practices;

public class ClosestToZero {
    static int closestToZero(int[] nums){
       int val=0;
       int min = Integer.MAX_VALUE;
        for(final int num:nums){
            if(Math.abs(num)<min){
                min = Math.abs(num);
                val = num;
            } else if (Math.abs(num)==min && val<num) {
                val = num;
            }
        }
        return val;
    }

    public static void main(String[] args) {

        int[] nums = {3, 5, 8, -5, -1, -2, 9};
        int value = closestToZero(nums);
        System.out.println(value);
    }

}
