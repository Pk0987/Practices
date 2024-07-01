package org.example.practices;


import java.util.Arrays;
import java.util.Scanner;

/*
    scene 1
    choc prices= [2,1,3] money = 3

    scene 2
    choc prices= [3,2,4] money = 3

    buy two choc using money, if money has less than two choc have to return otherwise you need to buy 2 choc
 */
public class BuyTwoChocolate {

    public static void BuyRnot(int[] choc_prices, int money){
        if(money<=0)
            return;
        Arrays.sort(choc_prices);
        int n = choc_prices.length;
        int ans=0;
        System.out.println(Arrays.toString(choc_prices));
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
                if (choc_prices[i]+choc_prices[j] == money )
                    ans = choc_prices[i]+ choc_prices[j] ;
            }
        }
        if(ans == money){
            System.out.println("You Bought two chocolates");
        }else {
            System.out.println("You can't buy..");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] choc_prices = { 3,4,1,2,6,8};
        System.out.println("Money you have :");
        int money = sc.nextInt();
        BuyRnot(choc_prices, money);

    }
}
