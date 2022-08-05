package com.example.mongo_pjt.service;

import com.example.mongo_pjt.domain.entity.CategoryEntity;
import com.example.mongo_pjt.domain.entity.Info;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> showingCategories();
    List showingCategoryName(String _id);
    Info showingInfo(String _id, Integer indexNum);

}
