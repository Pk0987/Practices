package org.example.Devops.TicToe;

import java.util.Scanner;

public class main {

    static String tictoeBorad[][] ={{"00","01","02"},{"10","11","12"},{"20","21","22"}};
    static int playerCount = 0;
    static void print(){
        for (int i = 0; i < tictoeBorad.length; i++) {
            for (int j = 0; j < tictoeBorad[i].length; j++) {
                System.out.print(tictoeBorad[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static void greetingMsg(Scanner sc){
        int x,y;
        System.out.println(playerCount%2==0?"\nPlayer X":"\nPlayer O");
        System.out.println("\nEnter X value :");
        x =sc.nextInt();
        System.out.println("Enter Y value :");
        y = sc.nextInt();
        System.out.println(insert(x,y,playerCount%2==0?"X":"O"));
    }

    static String insert(int x,int y,String playerName){
        if((x<3&&x>=0)&&(y<3&&y>=0)){
            if(!tictoeBorad[x][y].equals('X')&&!tictoeBorad[x][y].equals('O')){
                tictoeBorad[x][y] =playerName;
                print();
                playerCount++;
                if(check()){
                    System.out.println(playerName + " Wins!");
                    System.exit(0);
                }else if (playerCount == 9){
                    System.out.println("Its's a Draw!");
                    System.exit(0);
                }
                return "Inserted";
            }else {
                return "Already Occupied!";
            }
        }
        return "Unexpected Error!";
    }

    static boolean check(){

        for (int i = 0; i < 3; i++) {
            //Row
            if(tictoeBorad[i][0].equals(tictoeBorad[i][1])
              &&tictoeBorad[i][1].equals(tictoeBorad[i][2])
              &&!tictoeBorad[i][0].equals("")){
                return true;
            }
            //Colomn
            else if (tictoeBorad[0][i].equals(tictoeBorad[1][i])
                    &&tictoeBorad[1][i].equals(tictoeBorad[2][i])
                    &&!tictoeBorad[0][i].equals("")) {
                return true;
            }
            //Diagonal
            else if (tictoeBorad[0][0].equals(tictoeBorad[1][1])
                    &&tictoeBorad[1][1].equals(tictoeBorad[2][2])
                    &&!tictoeBorad[0][0].equals("")) {
                return true;
            } else if (tictoeBorad[0][2].equals(tictoeBorad[1][1])
                    &&tictoeBorad[1][1].equals(tictoeBorad[2][0])
                    &&!tictoeBorad[0][2].equals("")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print();
        while (true){
        greetingMsg(sc);

        }
    }

}
