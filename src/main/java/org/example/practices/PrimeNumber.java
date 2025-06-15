package org.example.practices;

import java.util.Scanner;

public class PrimeNumber {

    public static void isPrimeNumber(int n){
        int count = 0;
        if (n>1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.printf("%d is a prime number", n);
            } else {
                System.out.printf("%d is not a prime number", n);
            }
        }
    }
    static void isPrimeNumber(int x, int y){

        for (int i = x; i < y; i++) {
            if(checkPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }
    static boolean checkPrime(int n){
        if(n==1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to check the prime number: ");
        int n = sc.nextInt();
        isPrimeNumber(n);
        System.out.println();
        isPrimeNumber(1,10);
    }
}
