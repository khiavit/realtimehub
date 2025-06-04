package org.example.api;

import org.example.application.OrchestratorService;
import org.example.domain.AgentRequest;
import org.example.domain.AgentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrchestratorController {

    private final OrchestratorService orchestratorService;

    public OrchestratorController(OrchestratorService orchestratorService) {
        this.orchestratorService = orchestratorService;
    }

    @PostMapping("/agent")
    public AgentResponse handle(@RequestBody AgentRequest request) {
        return orchestratorService.handle(request);
    }
}
