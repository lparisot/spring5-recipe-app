package com.lpa.spring5recipeapp.services;

import com.lpa.spring5recipeapp.commands.RecipeCommand;
import com.lpa.spring5recipeapp.converters.RecipeCommandToRecipe;
import com.lpa.spring5recipeapp.converters.RecipeToRecipeCommand;
import com.lpa.spring5recipeapp.domain.Recipe;
import com.lpa.spring5recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    private final RecipeCommandToRecipe recipeCommandToRecipe;

    private final RecipeToRecipeCommand recipeToRecipeCommand;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeCommandToRecipe recipeCommandToRecipe, RecipeToRecipeCommand recipeToRecipeCommand) {
        this.recipeRepository = recipeRepository;
        this.recipeCommandToRecipe = recipeCommandToRecipe;
        this.recipeToRecipeCommand = recipeToRecipeCommand;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("In service, get recipes");

        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(l);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return recipeOptional.get();
    }

    @Override
    public RecipeCommand saveRecipeCommand(RecipeCommand command) {
        return null;
    }
}
