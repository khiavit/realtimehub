package com.example.infrastructure;

import com.example.application.ApplicationService;

public class InfrastructureService {
    private final ApplicationService appService = new ApplicationService();

    public void run(String input) {
        System.out.println(appService.process(input));
    }
}
