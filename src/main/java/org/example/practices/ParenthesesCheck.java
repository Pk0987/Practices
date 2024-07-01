package org.example.practices;

import java.util.Stack;

public class ParenthesesCheck {
    public static void main(String[] args) {
        String s = "(){}][";
//        System.out.println(removeOuterParentheses(s));
        System.out.println(RemoveParensUseStack(s));
    }

//    private static String removeOuterParentheses(String s) {
//        String result = "";
//        int openCount = 0;
//        int closeCount = 0;
//        int start = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(c == '('){
//                openCount++;
//            }else if (c == ')'){
//                closeCount++;
//            }
//            if(openCount == closeCount){
//                result += s.substring(start+1, i);
//                start = i+1;
//            }
//        }
//
//        return result;
//    }

    public static boolean RemoveParensUseStack(String s) {
        int l =0; int r=0;
        for (char c : s.toCharArray()) {
            if(c==')' || c=='}' || c==']')
                r++;
            else
                l++;
        }
        if(r!=l)
            return false;
        int low=-1;
        int[] pointer_array = new int[l];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==')' || c=='}' || c==']'){
                if(low<0 || i==0)
                    return false;
                    if(s.charAt(pointer_array[low])=='(' && c==')'){
                        low--;
                    } else if (s.charAt(pointer_array[low])=='{' && c=='}') {
                        low--;
                    } else if (s.charAt(pointer_array[low])=='[' && c==']') {
                        low--;
                    }else
                        return false;
            }else
                pointer_array[++low]=i;
        }
        return true;

    }
}
