package com.lpa.spring5recipeapp.converters;


import com.lpa.spring5recipeapp.commands.RecipeCommand;
import com.lpa.spring5recipeapp.domain.Recipe;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class RecipeToRecipeCommand implements Converter<Recipe, RecipeCommand>{
    @Synchronized
    @Nullable
    @Override
    public RecipeCommand convert(Recipe recipe) {
        return null;
    }
}
