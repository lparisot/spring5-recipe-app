package com.lpa.spring5recipeapp.converters;

import com.lpa.spring5recipeapp.commands.IngredientCommand;
import com.lpa.spring5recipeapp.domain.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {
    @Synchronized
    @Nullable
    @Override
    public Ingredient convert(IngredientCommand ingredientCommand) {
        return null;
    }
}
