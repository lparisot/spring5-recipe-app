package com.lpa.spring5recipeapp.controllers;

import com.lpa.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;

@Controller
public class IngredientController {
    private final RecipeService recipeService;

    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
}
