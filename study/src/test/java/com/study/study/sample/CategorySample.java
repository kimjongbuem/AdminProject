package com.study.study.sample;


import com.study.study.StudyApplicationTests;
import com.study.study.model.entity.Category;
import com.study.study.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;

import java.util.Arrays;
import java.util.List;

public class CategorySample extends StudyApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;


    @Test
    public void createSample(){
        List<String> category = Arrays.asList("COMPUTER","CLOTHING","MULTI_SHOP","INTERIOR","FOOD","SPORTS","SHOPPING_MALL","DUTY_FREE","BEAUTY");
        List<String> title = Arrays.asList("컴퓨터-전자제품","의류","멀티샵","인테리어","음식","스포츠","쇼핑몰","면세점","화장");

        for(int i = 0; i < category.size(); i++){
            String c = category.get(i);
            String t = title.get(i);
            Category create = Category.builder().type(c).title(t).build();
            categoryRepository.save(create);
        }


    }

}
