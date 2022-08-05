package com.example.mongo_pjt.service;

import com.example.mongo_pjt.domain.entity.CategoryEntity;
import com.example.mongo_pjt.domain.entity.Info;
import com.example.mongo_pjt.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Log4j2
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> showingCategories() {
        List<CategoryEntity> a = categoryRepository.findAll();
        return a;
    }

    @Override
    public List showingCategoryName(String _id) {
        CategoryEntity a = categoryRepository.findBy_id(_id);
        Map<String, String> map = new HashMap<String, String>();
        List lists = new ArrayList();

        int i;
        for (i=0; i<=8; i++)
        {
            map = new HashMap<>();
            String b = a.getInfo().get(i).get_idx();
            map.put("id", b);
            String name = a.getInfo().get(i).getName();
            map.put("name", name);
            String image = a.getInfo().get(i).getImage();
            map.put("image", image);
            lists.add(map);

        }


        log.info("b : " + map);
        return lists;
    }

    @Override
    public Info showingInfo(String _id, Integer indexNum) {
        CategoryEntity a = categoryRepository.findBy_id(_id);
        Info info = a.getInfo().get(indexNum);
        return info;
    }
}
