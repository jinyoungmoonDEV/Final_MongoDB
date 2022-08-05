package com.example.mongo_pjt.repository;

import com.example.mongo_pjt.domain.entity.CategoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryEntity, String> {

    CategoryEntity findBy_id(String _id);

//    @Query("{'info.name' :  ?0}")
//    Category2 findBy_idx(String name);


}
