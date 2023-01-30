package com.myprojects.chatgptspring.service;

import com.myprojects.chatgptspring.model.response.ChatGptResponse;
import com.myprojects.chatgptspring.model.request.UserRequest;

public interface ChatGptService {
    ChatGptResponse askQuestion(UserRequest userRequest);
}
