package org.example.practices;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;

public class FindSecondLargestNo {
    public static void main(String[] args) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        Random rand = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(100);

            if(highest < arr[i]){
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i]>secondHighest) {
                secondHighest = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr)+"\nSecond Highest Value is: "+secondHighest + "\nHighest Value is:" + highest);

    }
}
