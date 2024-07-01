package org.example.LeetCodePblm;

public class PowerOfTwo {
    public static boolean powerofTwo(int n){

        for (int i = 1; i <= n/2; i++) {
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 268435455;
        
        System.out.println(powerofTwo(n));
    }
}
