package org.example.practices;

import java.util.*;

public class VotingCount {

    void main(){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

        System.out.println("Enter the voter's count :");
        int size = sc.nextInt();
        int[] votes = new int[size];
        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
//            System.out.println("Enter the vote for " +(i+1)+"'s here :");
            votes[i] = rand.nextInt(10);
//            System.out.println("Enter the age of "+(i+1)+" voter : ");
            ages[i] = rand.nextInt(100);
        }
        HashMap<Integer,Integer> voteCount = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if(ages[i]>18){
                voteCount.put(votes[i], voteCount.getOrDefault(votes[i],0)+1);
            }
        }
        int winner = -1;
        int maxVal = 0;

        for(Map.Entry<Integer,Integer> entry: voteCount.entrySet()){
            if(entry.getValue() > maxVal){
                maxVal = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println(Arrays.toString(votes));
        System.out.println(Arrays.toString(ages));
        if(winner != -1 && maxVal !=1){
            System.out.println("The winner is "+winner+ " With " +maxVal +" valid votes.");
        }else {
            System.out.println("No valid votes "+ winner);
        }
    }
}
