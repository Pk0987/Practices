package org.example.LeetCodePblm;

public class RevOnlyLetters {
    static String revOnlyLetter(String s){
    char[] c = s.toCharArray();
    int start = 0;
    int end = c.length-1;
            while (start<end){
                int st = c[start];
                int en = c[end];
                boolean ste1 = ((st>=65 && st<=90) || (st>=97 && st<=122));
                boolean ste2 = ((en>=65 && en<=90) || (en>=97 && en<=122));
                if(ste1 && ste2){
                    char temp = c[start];
                    c[start] = c[end];
                    c[end] = temp;
                    start++;
                    end--;
                } else if (!ste1 && ste2) {
                    start++;
                } else if (!ste2 && ste1) {
                    end--;
                }else {
                    start++;
                    end--;
                }

            }
        return new String(c);
    }
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(revOnlyLetter(s));
    }
}
