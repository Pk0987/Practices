package org.example.practices;

import java.util.Scanner;

public class ReverseString {

    public static String recursiveString(String s){
        if (s == null || s.length()<=1){
            return s;
        }
        return recursiveString(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence :");
        String str = sc.nextLine();

        String[] strArray = str.split(" ");

        //Using index
        for (int i = strArray.length-1; i >= 0; i--) {
            System.out.print(strArray[i]+" ");

        }
            System.out.println("\nUsing Recursive Function : " + recursiveString(str));   // Using Recursive

        char s[] =str.toCharArray();
            String rev = "";
        for (int i = s.length-1; i >=0 ; i--) {
            rev = rev+ s[i];
        }
        System.out.println("Using Loop method : " + rev);

    }
}
