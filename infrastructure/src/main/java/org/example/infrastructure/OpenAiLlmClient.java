package org.example.infrastructure;

import org.example.domain.LlmClient;
import org.springframework.ai.chat.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class OpenAiLlmClient implements LlmClient {

    private final ChatClient chatClient;

    public OpenAiLlmClient(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public String prompt(String input) {
        return chatClient.call(input);
    }
}
