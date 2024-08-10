package com.example.exception;

public class StudentNotFoundException extends Exception{

    private static final long serialVersionUID=1L;

    public StudentNotFoundException() {
    }

    public StudentNotFoundException(String message) {
        super(message);
    }
}
