package com.quest.practice_Vars;

public class JavaMethod {

    public static void main(String[] args) {

        JavaMethod javaMethod = new JavaMethod();
        javaMethod.display("hello"); // Corrected call to display method
        int result = javaMethod.add(5, 3); // Pass actual integer values
        System.out.println(result);
    }

    /**
     * Display string
     * @param s - name
     */
    private void display(String s) {
        System.out.println(s);
    }

    /**
     * Adding two numbers
     * @param a
     * @param b
     * @return - sum
     */
    private int add(int a, int b) {
        return a + b;
    }
}
