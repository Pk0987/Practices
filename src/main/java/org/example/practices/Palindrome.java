package org.example.practices;

import java.util.Scanner;

public class Palindrome {

    public static void isPalindromeInNumber(Long n){
            long rev = 0;
            long old = n;
            while (n!=0){
                rev = rev * 10 + n% 10;
                n= n/10;
            }
            if (rev==old){
                System.out.println("This is Palindrome number");
            }else {
                System.out.println("Not a palindrome");
            }
    }

    public static void isPalindromeInString(String s){

//        String old = s;
        String ans = " ";
        for (int i = s.length()-1; i >=0 ; i--) {
            ans = ans + s.charAt(i);
        }
        if (s==ans) {
            System.out.println("This is palindrome String");
        }else {
            System.out.println("Not a palindrome String");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the number which you find its a palindrome : ");
//        long number = sc.nextLong();
//        isPalindromeInNumber(number);

        System.out.println("Enter the String which you find its a palindrome : ");
        String str = sc.next();
        isPalindromeInString(str);
    }
}
