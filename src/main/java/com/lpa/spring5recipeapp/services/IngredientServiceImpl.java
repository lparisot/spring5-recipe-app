package com.lpa.spring5recipeapp.services;

import com.lpa.spring5recipeapp.commands.IngredientCommand;
import com.lpa.spring5recipeapp.converters.IngredientToIngredientCommand;
import com.lpa.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientToIngredientCommand ingredientToIngredientCommand;
    private final RecipeRepository recipeRepository;

    public IngredientServiceImpl(IngredientToIngredientCommand ingredientToIngredientCommand, RecipeRepository recipeRepository) {
        this.ingredientToIngredientCommand = ingredientToIngredientCommand;
        this.recipeRepository = recipeRepository;
    }

    @Override
    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) {
        return null;
    }
}
