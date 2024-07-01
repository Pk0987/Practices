package org.example.practices;

public class Patterns {

           public static void main(String[] args) {

            pattern9(3);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 0; row <= 2 * n; row++) {
            int c = row>n ? 2*n-row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=n-row ; col++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row>n?2*n-row:row;
            int spaces = n - totalColsInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow= row>=n?row-n+1:n-row;
            int spaces = n-totalColInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int row = 1; row < 2*n; row++) {
            int c = row>n? 2*n-row:row;
            for (int spaces = 0; spaces < n-c; spaces++) {
                System.out.print("  ");
            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
               int originalN = n;
               n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                    int atEveryIndex = originalN - (Math.min(Math.min(row,col), Math.min(n-row, n-col))-1);
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }
}
