package org.example.LeetCodePblm;

import java.util.Arrays;

public class IsPallindrome {

    static boolean isPallindrome(int x){

        if(x<0)
            return false;
        long reversed = 0;
        int y=x;

        while (y>0){

            reversed = reversed * 10 + y % 10;
            y/=10;
        }
        return reversed==x;
    }


    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPallindrome(x));
    }
}
