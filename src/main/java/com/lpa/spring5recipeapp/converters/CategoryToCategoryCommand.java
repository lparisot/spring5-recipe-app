package com.lpa.spring5recipeapp.converters;

import com.lpa.spring5recipeapp.commands.CategoryCommand;
import com.lpa.spring5recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {
    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category category) {
        return null;
    }
}
