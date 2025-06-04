package com.example.application;

import com.example.domain.DomainMessage;

public class ApplicationService {
    public String process(String input) {
        DomainMessage msg = new DomainMessage(input);
        return "Processed: " + msg.message();
    }
}
