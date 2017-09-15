package com.lpa.spring5recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
// circular reference because of the bi-directional relationship
@EqualsAndHashCode(exclude = "recipes")
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    // remove duplicated tables CATEGORY_RECIPES and RECIPE_CATEGORIES
    private Set<Recipe> recipes;

}
