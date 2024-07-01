package org.example.practices;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1=0, n2=1, sum=0;

        System.out.println("Enter the length :");
        int len = sc.nextInt();

        for (int i = n1; i < len; i++) {

            System.out.print(n1+" ");
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }

    }
}
