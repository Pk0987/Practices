package org.example.practices;

public class Dummy {
    public static void main() {
        String str = "I lovie indlia";
//        str = str.replaceAll(" ","");
        char[] c = str.toLowerCase().toCharArray();
        String ans = "%s".formatted(c[0]);
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if (c[i] != c[j] && ( c[j]==32 || ans.indexOf(c[j])<0)) {
                    ans += c[j];
                }
            }
        }
        System.out.println(ans);
    }
}
