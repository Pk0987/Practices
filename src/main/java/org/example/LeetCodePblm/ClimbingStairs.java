package org.example.LeetCodePblm;

import java.util.SortedMap;

public class ClimbingStairs {

    static int climbingStairs(int n){
        if(n==0||n==1){
            return 1;
        }
    return climbingStairs(n-1)+climbingStairs(n-2);
    }

    public static void main(String[] args) {
        int steps = 5;
        System.out.println(climbingStairs(steps));
    }
}
