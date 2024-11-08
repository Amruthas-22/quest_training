package com.quest.practice_Vars;
import java.util.Scanner;
public class palindromeseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int orginal = num;
        int reverse=0;
        while (num != 0) {
            int rem = num % 10;
            reverse=reverse*10+rem;
            num = num / 10;
        }
        if(orginal==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
