package com.lpa.spring5recipeapp.repositories;

import com.lpa.spring5recipeapp.domain.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void findByDescriptionAmerican() throws Exception {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        assertEquals("American", categoryOptional.get().getDescription());
    }

}