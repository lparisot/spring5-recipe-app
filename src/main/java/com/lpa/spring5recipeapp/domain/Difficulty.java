package com.lpa.spring5recipeapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Difficulty {
    EASY("1", "EASY"), MODERATE("2", "MODERATE"), HARD("3", "HARD");
    private final String value;
    private final String text;

    public Difficulty[] getValues() { return Difficulty.values(); }
}
