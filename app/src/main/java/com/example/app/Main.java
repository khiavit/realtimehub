package com.example.app;

import com.example.infrastructure.InfrastructureService;

public class Main {
    public static void main(String[] args) {
        var service = new InfrastructureService();
        service.run("Hello World");
    }
}
