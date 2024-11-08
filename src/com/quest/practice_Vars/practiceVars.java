package com.quest.practice_Vars;

public class practiceVars {
    final static int VOTE_AGE = 18;

    public static void main(String[] args) {
        int age = 18;
        double salary = 10000.000;
        char gender = 'M';
        String firstname = "john";
        String lastname = "Doe";

        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("firstname = " + firstname);
        System.out.println("lastname = " + lastname);

        age = 20;
        System.out.println("age = " + age);
        System.out.println("vote age = " + VOTE_AGE);
        // VOTE_AGE = 20; // This line would cause an error as VOTE_AGE is final

        // Calling the additional methods
        practiceconversion();
        stringconcatenation();
        stringMethods();
    }

    private static void practiceconversion() {
        int a = 18;
        double b = 25.5;
        double sum = a + b;
        int round = (int) b;
        System.out.println("sum = " + sum);
        System.out.println("rounded b = " + round);
    }

    private static void stringconcatenation() {
        String S1 = " john";
        String S2 = " Doe";
        String s3 = S1 + " " + S2;
        System.out.println(s3);
        int age = 20;
        System.out.println("name = " + s3 + "age = " + age);

    }

    private static void stringMethods() {
        String S1 = "John";
        String S2 = "Doe";
        String s4 = "John";
        String s3 = new String("Hello World");
        System.out.println(s3.length());
        System.out.println(s3.equals(S2));
        System.out.println(s3.equalsIgnoreCase(S1));
        System.out.println(s3 == S2);
    }
}


