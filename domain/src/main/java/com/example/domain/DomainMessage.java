package com.example.domain;

public class DomainMessage {
    private final String message;

    public DomainMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
