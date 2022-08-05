package com.example.mongo_pjt.controller;

import com.example.mongo_pjt.domain.dto.ChatDTO;
import com.example.mongo_pjt.domain.entity.ChatEntity;
import com.example.mongo_pjt.service.ChatServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.*;
import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatController {

    private final ChatServiceImpl chatService;

    @PostMapping(value = "/insert")
    public Mono<ChatEntity> setMsg(@RequestBody ChatDTO chatDTO){
        chatDTO.setCreatedAt(LocalDateTime.now());
        return chatService.setMsg(chatDTO);
    }

    @GetMapping(value = "/sender/roomNum/{roomNum}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ChatEntity> getMsg(@PathVariable Integer roomNum){
        return chatService.getMsg(roomNum);
    }
}
