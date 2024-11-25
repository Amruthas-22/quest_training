package com.quest.exception;

import java.io.IOException;

public class Division extends Calculator {

    @Override
    public int division(int a, int b) throws IOException {
        if (b == 0) {
            throw new ArithmeticException("Unchecked Exception: Division by zero is not allowed.");
        }
        if (a < 0 && b < 0) {
            throw new IOException("Checked Exception: Negative values are not allowed for division.");
        }
        System.out.println("Result of division: " + (a / b));
        return a / b;
    }
}





