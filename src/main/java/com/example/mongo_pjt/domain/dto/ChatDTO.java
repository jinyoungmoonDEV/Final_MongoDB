package com.example.mongo_pjt.domain.dto;

import com.example.mongo_pjt.domain.entity.ChatEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ChatDTO {
    private String id;
    private String msg;
    private String sender;
    private String receiver;
    private Integer roomNum;
    private LocalDateTime createdAt;

    public ChatEntity toEntity(){
        ChatEntity chatEntity = ChatEntity.builder()
                .id(id)
                .msg(msg)
                .sender(sender)
                .receiver(receiver)
                .roomNum(roomNum)
                .createdAt(createdAt)
                .build();
        return chatEntity;
    }
}
