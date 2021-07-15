package com.BridgeLabz;

import java.util.Scanner;

public class TicTacToi {

    //M*N
    static String a[][] = new String[3][3];

    //Printing Tic Toe Board To See  Input From User

    void printboard(String a[][]) {
        System.out.println("--------------------");
        System.out.println("| " + a[0][0] + " | " + a[0][1] + " | " + a[0][2] + " |");
        System.out.println("|---------------|");
        System.out.println("| " + a[1][0] + " | " + a[1][1] + " | " + a[1][2] + " |");
        System.out.println("|---------------|");
        System.out.println("| " + a[2][0] + " | " + a[2][1] + " | " + a[2][2] + " |");
        System.out.println("|---------------|");
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i, j, i1, j1, flag = 0;

        for (int ir = 0; ir < 3; ir++) {
            for (int jc = 0; jc < 3; jc++)  //to initializ blank space
            {
                a[ir][jc] = " ";
            }

        }
        System.out.println("player 1 is X");
        System.out.println("Player 2 is O");
        System.out.println("Let's start the game ");
        TicTacToi ob = new TicTacToi();
        System.out.println();
        ob.printboard(a);

        while (flag != 1) {
            System.out.println("Enter Position of Player 1");
            i = s.nextInt();
            j = s.nextInt();
            a[i][j] = "X";
            ob.printboard(a);
            if (ob.check(a) == true) {
                flag = 1;
                System.out.println("Player 1 is won");
                break;
            }
            System.out.println("enter position of Player 2");
            i = s.nextInt();
            j = s.nextInt();
            a[i][j] = "0";
            ob.printboard(a);
            if (ob.check(a) == true)
            {
                flag=1;
                System.out.println("player 2 win");
              break;
            }
        }

        }

    boolean check (String a[][]){
        if (a[0][0] == a[0][1] && a[0][1] == a[0][2] && a[0][2] == a[0][0] && a[0][0] == "X")
            return true;
        else if (a[1][2] == a[1][1] && a[1][1] == a[1][0] && a[1][0] == a[1][2] && a[1][1] == "X")
            return true;
        else if (a[2][1] == a[2][2] && a[2][2] == a[2][0] && a[2][0] == a[2][1] && a[2][2] == "X")
            return true;
        else if (a[0][0] == a[1][0] && a[1][0] == a[2][0] && a[2][0] == a[0][0] && a[0][0] == "X")
            return true;
        else if (a[0][1] == a[1][1] && a[1][1] == a[2][1] && a[2][1] == a[0][1] && a[0][1] == "X")
            return true;
        if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[2][2] == a[0][0] && a[2][2] == "X")
            return true;
        if (a[0][2] == a[1][1] && a[1][1] == a[2][0] && a[2][0] == a[0][2] && a[2][0] == "X")
            return true;
        if (a[0][0] == a[0][1] && a[0][1] == a[0][2] && a[0][2] == a[0][0] && a[0][0] == "O")
            return true;
        else if (a[1][2] == a[1][1] && a[1][1] == a[1][0] && a[1][0] == a[1][2] && a[1][1] == "O")
            return true;
        else if (a[2][1] == a[2][2] && a[2][2] == a[2][0] && a[2][0] == a[2][1] && a[2][2] == "O")
            return true;
        else if (a[0][0] == a[1][0] && a[1][0] == a[2][0] && a[2][0] == a[0][0] && a[0][0] == "O")
            return true;
        else if (a[0][1] == a[1][1] && a[1][1] == a[2][1] && a[2][1] == a[0][1] && a[0][1] == "O")
            return true;
        if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[2][2] == a[0][0] && a[2][2] == "O")
            return true;
        if (a[0][2] == a[1][1] && a[1][1] == a[2][0] && a[2][0] == a[0][2] && a[2][0] == "O")
            return true;
        else
            return false;
    }


}
