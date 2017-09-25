package com.lpa.spring5recipeapp.controllers;

import com.lpa.spring5recipeapp.services.RecipeService;

public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
}
