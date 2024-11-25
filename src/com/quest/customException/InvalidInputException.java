package com.quest.customException;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
