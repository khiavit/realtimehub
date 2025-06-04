package org.example.application;

import org.example.domain.AgentRequest;
import org.example.domain.AgentResponse;
import org.example.domain.LlmClient;
import org.springframework.stereotype.Service;

@Service
public class OrchestratorService {

    private final LlmClient llmClient;

    public OrchestratorService(LlmClient llmClient) {
        this.llmClient = llmClient;
    }

    public AgentResponse handle(AgentRequest request) {
        String answer = llmClient.prompt(request.message());
        return new AgentResponse(answer);
    }
}
