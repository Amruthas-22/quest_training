package com.quest.practice_Vars;

public class fabinoccisreies {
    public static void main(String[] args) {
        int n = 0;

        int first=0;
        int second=1;
        System.out.println("fabinoccisreies upto"+n+"terms");


        for(int i=1;i<=n;i++){
            System.out.println("fabinoccisreies upto"+i+"terms");
            int third = first+second;
            first=second;
            second=third;

        }


    }
}
