package org.example.practices;

import java.util.Arrays;

public class FindDuplicateElements {

    public static class findDuplicateArray {

        static int[] findDuplicates(int arr[], int n)
        {

            int val = 0;
            int[] k = new int[4];
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if(arr[i]==arr[j]) {
                        k[val++] = arr[i];
                    }
                }
            }
            return k;
        }

        public static void main (String[] args)
        {
            int arr[] = {1, 2, 7, 3, 4, 2, 4, 1, 5, 5};
            int n = arr.length;

            System.out.println(Arrays.toString(findDuplicates(arr,n)));

            // Print updated array

        }
    }
}
