package com.jiang.config;

/**
 * @projectName: AI-transformation
 * @package: com.jiang.config
 * @className: AppConfig
 * @author: tangxiaojiang
 * @description: TODO
 * @date: 2026/1/6 16:42
 * @version: 1.0
 */

import com.jiang.service.CustomerServiceAgent;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class AppConfig {

    // 创建并配置ChatLanguageModel Bean
    @Bean
    public ChatLanguageModel chatLanguageModel() {
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434/")
                .modelName("llama3:8b")
                .timeout(Duration.ofSeconds(120)) // Web服务超时时间可以适当延长
                .build();
    }

    // 创建并配置AiService Bean，它会自动依赖上面的ChatLanguageModel Bean
    @Bean
    public CustomerServiceAgent customerServiceAgent(ChatLanguageModel chatLanguageModel) {
        return AiServices.create(CustomerServiceAgent.class, chatLanguageModel);
    }
}