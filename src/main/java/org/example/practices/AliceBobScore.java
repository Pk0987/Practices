package org.example.practices;

import java.util.Arrays;
import java.util.Random;


public class AliceBobScore {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] alias = new int[3];
        int[] bob = new int[3];
        int k=0;
        int alias_score = 0;
        int bob_score = 0;
        for (int i = 0; i < alias.length; i++) {
            alias[i] = rand.nextInt(100);
            bob[i] = rand.nextInt(100);
            if(alias[k]>bob[k]){
                alias_score++;
                k++;
            }else if (alias[k]<bob[k]) {
                bob_score++;
                k++;
            }
        }
        System.out.println(Arrays.toString(alias)+ " \n"+Arrays.toString(bob));
        System.out.println(alias_score+" "+bob_score);


    }
}
