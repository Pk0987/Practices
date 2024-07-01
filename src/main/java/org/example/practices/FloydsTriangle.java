package org.example.practices;

import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row: ");
        int n = sc.nextInt();
        int num=1;

        for (int c= 1; c<=n; c++) {
            for (int d = 1; d<=c ; d++) {
                System.out.print(num+" ");
                num++;
            }
        System.out.println(" ");
        }
    }
}

