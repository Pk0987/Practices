package org.example.practices;

import java.util.Arrays;
import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "fjkjgkyDWUFDaejfvne";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: str.toLowerCase().toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
