package com.example.flight.exception;

public class KnownException extends RuntimeException {
    public KnownException(String message) {
        super(message);
    }
}