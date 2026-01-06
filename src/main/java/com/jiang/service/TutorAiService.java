package com.jiang.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

/**
 * @projectName: AI-transformation
 * @package: com.jiang.service
 * @className: TutorAiService
 * @author: tangxiaojiang
 * @description: TODO  数据库操作方法
 * @date: 2026/1/6 16:32
 * @version: 1.0
 */
public interface TutorAiService {

    @SystemMessage("You are a senior Java tutor. You explain complex concepts in a simple and concise way.")
    @UserMessage("Explain the difference between {{topic1}} and {{topic2}} in Java in three sentences.")
    String compareTopics(@V("topic1") String topic1, @V("topic2") String topic2);
}
