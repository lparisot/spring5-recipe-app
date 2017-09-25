package com.lpa.spring5recipeapp.converters;

import com.lpa.spring5recipeapp.commands.CategoryCommand;
import com.lpa.spring5recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {
    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand categoryCommand) {
        return null;
    }
}
