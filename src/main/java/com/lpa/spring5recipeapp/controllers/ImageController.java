package com.lpa.spring5recipeapp.controllers;

import com.lpa.spring5recipeapp.services.ImageService;
import com.lpa.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;

@Controller
public class ImageController {
    private final ImageService imageService;
    private final RecipeService recipeService;

    public ImageController(ImageService imageService, RecipeService recipeService) {
        this.imageService = imageService;
        this.recipeService = recipeService;
    }
}
