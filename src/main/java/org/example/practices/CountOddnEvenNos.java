package org.example.practices;

import java.util.Scanner;

public class CountOddnEvenNos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = sc.nextLong();

        int oddNo = 0, evenNo = 0;

        while (number>0){
            long rem = number%10;
            if(rem%2==0)
                evenNo++;
            else
             oddNo++;
            number= number/10;
        }
        System.out.println("Even Count is : " + evenNo);
        System.out.println("Odd Count is : " + oddNo);
    }
}
