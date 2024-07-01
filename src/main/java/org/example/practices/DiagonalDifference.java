package org.example.practices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DiagonalDifference {

    static int diagonalDiffernce(int[][] ar){
        int differ = 0;
        int first = 0;
        int second = 0;
        for (int i = 0; i < ar.length; i++) {

            second+=ar[i][ar.length-1-i];
            first+=ar[i][i];
        }
        differ= Math.abs(first-second);

        return differ;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Matrix: ");
        int Matrix = sc.nextInt();
        int[][] ar = new int[Matrix][Matrix];

        for (int i = 0; i < Matrix; i++) {
            for (int j = 0; j < Matrix; j++) {
                ar[i][j]=rand.nextInt(10);
            }
        }
        for (int i = 0; i < Matrix; i++) {
            for (int j = 0; j < Matrix; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nThe difference is: "+diagonalDiffernce(ar));

    }
}
