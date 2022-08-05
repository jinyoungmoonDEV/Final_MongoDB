package com.example.mongo_pjt.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "category")
public class CategoryEntity {

    @Id
    private String _id;
    private String name;
    private String image;
    private List<Info> info;

}