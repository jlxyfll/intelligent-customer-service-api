package com.jiang.controller;

/**
 * @projectName: AI-transformation
 * @package: com.jiang.controller
 * @className: ChatController
 * @author: tangxiaojiang
 * @description: TODO
 * @date: 2026/1/6 16:43
 * @version: 1.0
 */

import com.jiang.service.CustomerServiceAgent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ChatController {

    private final CustomerServiceAgent agent;

    // 使用构造函数注入CustomerServiceAgent Bean
    public ChatController(CustomerServiceAgent agent) {
        this.agent = agent;
    }

    @PostMapping("/api/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> request) {
        String userMessage = request.get("question");
        String aiResponse = agent.chat(userMessage);
        return Map.of("answer", aiResponse);
    }
}