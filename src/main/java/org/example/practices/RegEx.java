package org.example.practices;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx {

    public static void main(String[] args) {

        String kural = "thupparku thuppaya thuppaki thupparku thuppaya thoovum mazhai";

        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(kural);
        String ans = m.toString();
        ans = Arrays.toString(ans.split(""));
        int count =0;
        while (m.find()){
        System.out.println(m.group()+ "start at"+ m.start());
        }


    }
}
