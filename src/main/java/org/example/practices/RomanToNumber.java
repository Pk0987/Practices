package org.example.practices;

import java.util.Scanner;

public class RomanToNumber {

    static int findNo(char str){
        switch (str){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

            default:
                return -1;
        }

    }
    public static int findRomToNum(String roman){
        int result =0;

        for (int i = 0; i < roman.length(); i++) {
            int s1 = findNo(roman.charAt(i));
            if(i+1 < roman.length()){
                int s2 = findNo(roman.charAt(i+1));
                if(s1>=s2){
                    result += s1;
                }else {
                    result += s2-s1;
                    i++;

                }
            }else {
                result+=s1;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman no :");
        String roman = sc.next(); //DXIV 500+10+4
        System.out.println(findRomToNum(roman));
    }
}
