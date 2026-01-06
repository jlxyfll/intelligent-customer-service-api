package com.jiang.service;

/**
 * @projectName: AI-transformation
 * @package: com.jiang.service
 * @className: CustomerServiceAgent
 * @author: tangxiaojiang
 * @description: TODO  数据库操作方法
 * @date: 2026/1/6 16:41
 * @version: 1.0
 */

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface CustomerServiceAgent {

    @SystemMessage("""
            You are a customer service agent for a large e-commerce company named 'Fusion-Mart'.
            Your name is 'Eva'.
            You must be polite, helpful, and friendly.
            Before answering, you must check if the user's question is related to our products, orders, or returns.
            If the question is not related to these topics, you must politely refuse to answer and state that you can only handle customer service inquiries.
            """)
    @UserMessage("{{userMessage}}")
    String chat(@V("userMessage") String userMessage);
}
