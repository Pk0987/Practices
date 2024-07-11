package org.example.LeetCodePblm;

public class ReverseEveryWords {

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for(int i=0; i<arr.length;i++){
            char[] c =arr[i].toCharArray();
            for (int j = c.length-1; j >=0 ; j--) {
                ans+=c[j];
            }
            if(i< arr.length-1){

            ans+=" ";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
