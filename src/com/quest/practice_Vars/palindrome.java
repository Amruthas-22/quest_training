package com.quest.practice_Vars;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if(str==null){
            System.out.println("The string is null");
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
       String reversestring = reverse.toString();
       if(str.equals(reversestring)){
           System.out.println("The string is a palindrome");

       }else {
           System.out.println("The string is not a palindrome");
       }




    }
}