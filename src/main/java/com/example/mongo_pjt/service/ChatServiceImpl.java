package com.example.mongo_pjt.service;

import com.example.mongo_pjt.domain.dto.ChatDTO;
import com.example.mongo_pjt.domain.entity.ChatEntity;
import com.example.mongo_pjt.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService{

    private final ChatRepository chatRepository;

    @Override
    public Mono<ChatEntity> setMsg(ChatDTO chatDTO) {
        return chatRepository.save(chatDTO.toEntity());
    }

    @Override
    public Flux<ChatEntity> getMsg(Integer roomNum) {
        return chatRepository.mFindByRoomNum(roomNum).subscribeOn(Schedulers.boundedElastic());
    }
}
