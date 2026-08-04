package com.example.practise.Exceptions;

public class EmployeeNotFound extends RuntimeException {

    public EmployeeNotFound(String message) {
        super(message);
    }
}