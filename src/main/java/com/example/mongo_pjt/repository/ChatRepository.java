package com.example.mongo_pjt.repository;

import com.example.mongo_pjt.domain.entity.ChatEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
@Repository
public interface ChatRepository extends ReactiveMongoRepository<ChatEntity, String> {

    @Tailable
    @Query("{ roomNum: ?0 }")
    Flux<ChatEntity> mFindByRoomNum(Integer roomNum);
}
