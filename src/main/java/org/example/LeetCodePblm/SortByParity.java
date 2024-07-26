package org.example.LeetCodePblm;

import java.util.Arrays;
public class SortByParity {

    static int[] sortByParity(int[] nums){
        int evenIndex = 0;
        int oddIndex = 1;
        int n = nums.length;

        while (evenIndex < n && oddIndex < n) {
            // Find the first misplaced odd number at an even index
            while (evenIndex < n && nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            // Find the first misplaced even number at an odd index
            while (oddIndex < n && nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }

            // Swap the misplaced odd and even numbers
            if (evenIndex < n && oddIndex < n) {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {3,2};
        arr = sortByParity(arr);
        System.out.println(Arrays.toString(arr));
    }
}
