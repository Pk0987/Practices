package org.example.LeetCodePblm;

public class LengthOfLastWord {

            public static int lengthOfLastWord(String s) {
                s = s.trim();
                int ans = 0;
                for(int i=s.length()-1; i>=0; i--){
                    if(s.charAt(i) == ' '){
                        break;
                    }
                    else{
                        ans++;
                    }
                }

                return ans;
            }
    public static void main(String[] args) {
//       String  s = "   fly me   to   the moon eye  ";
//        String[] sx = s.trim().split(" ");
////        StringTokenizer strToken = new StringTokenizer(s," ");
////        int count = strToken.countTokens();
////        String[] values = new String[count];
//        int count = sx.length;
//        String[] values = new String[count];
//        for (int i = 0; i < count; i++) {
//            values[i] = sx[i];
//        }
//        System.out.println(values[count-1]);
        String  s = "   fly me   to   the moon eye  ";
        System.out.println(lengthOfLastWord(s));
    }
}
