package com.BridgeLabz;

public class TicTacToi {

    //M*N
    static String a[][] =new String [3][3];

    //Printing Tic Toe Board To See  Input From User

    void   printboard(String a[][])

    {
        System.out.println("------------------------");
        System.out.println("| " +a[0][0] + " | " + a[0][1] + " | " + a[0][2] + " |");
        System.out.println("|---------------|");
        System.out.println("| " +a[1][0] + " | "+ a[1][1] + " | " + a[1][2] + " |");
        System.out.println("|---------------|");
        System.out.println("| " +a[2][0] + " | "+ a[2][1] + " | " + a[2][2] + " |");
        System.out.println("|---------------|");
    }







}
