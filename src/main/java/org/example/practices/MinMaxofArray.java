package org.example.practices;

import java.util.Arrays;

public class MinMaxofArray {

    static int SumOfDigits(int[] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum+=ar[i];
        }
        return sum;
    }
    static void findSum(int[] ar, int n){
        int ans = SumOfDigits(ar);
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i]+=ans-ar[i];
        }
        System.out.println("Minimum sum is: "+val[n-1]+"\nMaximum sum is: "+val[0]);
    }

    public static void main(String[] args) {
        int[] ar= {5,6,7,8,9};
        int n = ar.length;
        Arrays.sort(ar);
        findSum(ar,n);

    }
}
