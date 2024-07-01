package org.example;

public class CountVowels {

    public static void main(String[] args) {

        String s1 = "This is our First";
        String vowels ="aeiou";

        s1 = s1.trim().toLowerCase().replaceAll(" ", "");
        String voww = "";
        String conss = "";
        int vow = 0;
        int cons = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(vowels.indexOf(s1.charAt(i))!=-1){
                vow++;
                voww += s1.charAt(i) + " ";
            }else {
                cons++;
                conss += s1.charAt(i)+ " ";
            }

        }
        System.out.println("Vowel Count is: "+ vow +"\nConsonents Count is: " + cons + "\nTotal String Count: " +s1.length());
        System.out.println(voww + "\n" + conss);
    }

}
