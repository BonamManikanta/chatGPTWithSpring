package com.myprojects.chatgptspring.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGptRequest {
    private String model;
    private String prompt;
    private Double temperature;
    private Integer max_tokens;

}
