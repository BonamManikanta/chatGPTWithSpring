package com.myprojects.chatgptspring.controller;


import com.myprojects.chatgptspring.model.response.ChatGptResponse;
import com.myprojects.chatgptspring.model.request.UserRequest;
import com.myprojects.chatgptspring.service.ChatGptService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/chat")
@AllArgsConstructor
public class ChatGptController {

    private final ChatGptService botService;

    @PostMapping("/send")
    public ChatGptResponse sendMessage(@RequestBody UserRequest userRequest) {
        return botService.askQuestion(userRequest);
    }

}
