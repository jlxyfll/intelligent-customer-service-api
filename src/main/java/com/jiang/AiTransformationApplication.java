package com.jiang;

import com.jiang.service.TutorAiService;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.PromptTemplate;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: AI
 * @package: com.jiang
 * @className: AiTransformationApplication
 * @author: tangxiaojiang
 * @description: TODO
 * @date: 2026/1/6 16:03
 * @version: 1.0
 */
@SpringBootApplication
public class AiTransformationApplication {
    public static void main(String[] args) {
        // 测试引入模型
        /*ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434/") // 这是Ollama服务的默认地址
                .modelName("llama3:8b") // 指定我们昨天下载的模型
                .timeout(Duration.ofSeconds(60)) // 设置超时时间
                .build();*/

        // day 1
        /*String prompt = "Explain the difference between ArrayList and LinkedList in Java in three sentences.";
        prompt = "如果我要学习AI应该怎么学习";
        System.out.println("User: " + prompt);

        String response = model.generate(prompt);

        System.out.println("AI: " + response);*/


        // day 2
        /*PromptTemplate promptTemplate = PromptTemplate.from("Explain the difference between {{topic1}} and {{topic2}} in Java in three sentences.");

        Map<String, Object> variables = new HashMap<>();
        variables.put("topic1", "HashMap"); // 动态设置第一个主题
        variables.put("topic2", "HashTable"); // 动态设置第二个主题
        Prompt finalPrompt = promptTemplate.apply(variables);

        // 打印出最终生成的Prompt，检查一下是否正确
        System.out.println("Generated Prompt: " + finalPrompt.text());


        // 5. 将Prompt对象发送给模型
        String response = model.generate(finalPrompt.text());

        // 6. 打印模型的响应
        System.out.println("AI: " + response);*/

        // day 3
        /*TutorAiService tutor = AiServices.create(TutorAiService.class, model);

        String response = tutor.compareTopics("interface", "abstract class");
        System.out.println("AI Tutor says: " + response);*/

        SpringApplication.run(AiTransformationApplication.class, args);
    }
}
