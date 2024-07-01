package org.example.LeetCodePblm;

import java.util.Arrays;

public class ReverseVowelsOfString {
     static String ReverseVowelsOfString(String s){
        String vowels = "aeiou";
        char[] c = s.toLowerCase().toCharArray();
        int left = 0;
        int right = s.length()-1;
        char temp = 0;
        while (left<right){
            if (vowels.indexOf(c[left])!=-1 && vowels.indexOf(c[right])!=-1){
                temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                right--;
                left++;
            } else if (vowels.indexOf(c[left])!=-1) {
                right--;
            }else if(vowels.indexOf(c[right])!=-1){
                left++;
            }else {
            left++;
            right--;
            }
        }
        String str = new String(c);
        return str;
    }


    public static void main(String[] args) {
        String s = "hello"; //leotcede
        s = ReverseVowelsOfString(s);
        System.out.println(s);
    }
}
