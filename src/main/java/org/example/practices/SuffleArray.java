package org.example.practices;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int RanIndex = rand.nextInt(arr.length);
            int temp = arr[RanIndex];
            arr[RanIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
