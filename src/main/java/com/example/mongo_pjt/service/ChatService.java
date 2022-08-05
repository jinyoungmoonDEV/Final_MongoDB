package com.example.mongo_pjt.service;

import com.example.mongo_pjt.domain.dto.ChatDTO;
import com.example.mongo_pjt.domain.entity.ChatEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface ChatService {

    Mono<ChatEntity> setMsg(ChatDTO chatDTO);

    Flux<ChatEntity> getMsg(Integer roomNum);
}
