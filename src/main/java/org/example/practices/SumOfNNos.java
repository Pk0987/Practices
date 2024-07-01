package org.example.practices;

import java.util.Scanner;

public class SumOfNNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the length :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.printf("Sum of %d is : %d ",n, sum);
    }
}
