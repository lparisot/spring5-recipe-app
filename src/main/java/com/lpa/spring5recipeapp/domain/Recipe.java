package com.lpa.spring5recipeapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// add getters and setters, equals and hashcode
@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;

    // large object storage
    @Lob
    private Byte[] image;

    // EnumType.STRING means the value saved in database is a string based on the enum name
    // EnumType.ORDINAL means the value saved in database is a number
    // if you change the enum, values in DB will not change
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    // target property on Ingredient is recipe
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>();

    // if we delete a Recipe, it will automatically delete notes
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @ManyToMany
    // remove duplicated tables CATEGORY_RECIPES and RECIPE_CATEGORIES
    @JoinTable(
            name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories = new HashSet<>();



    public void setNotes(Notes notes) {
        // bidirectional relationship
        this.notes = notes;
        if(notes != null) {
            notes.setRecipe(this);
        }
    }

    public Recipe addIngredient(Ingredient ingredient) {
        // bidirectional relationship
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }
}
