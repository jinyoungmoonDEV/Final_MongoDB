package com.example.mongo_pjt.domain.entity;

import com.example.mongo_pjt.domain.dto.ChatDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Builder
@Document(collection = "chat")
public class ChatEntity {
    @Id
    private String id;
    private String msg;
    private String sender;
    private String receiver;
    private Integer roomNum;
    private LocalDateTime createdAt;

    public ChatDTO toDTO() {
        ChatDTO chatDTO = ChatDTO.builder()
                .id(id)
                .msg(msg)
                .sender(sender)
                .receiver(receiver)
                .roomNum(roomNum)
                .createdAt(createdAt)
                .build();
        return chatDTO;
    }

}
