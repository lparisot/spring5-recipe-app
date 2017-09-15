package com.lpa.spring5recipeapp.repositories;

import com.lpa.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    // JPA will implements automatically the SQL part
    Optional<Category> findByDescription(String description);
}
