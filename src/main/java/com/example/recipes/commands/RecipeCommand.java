package com.example.recipes.commands;

import com.example.recipes.domein.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private NotesCommand notes;
    private Difficulty difficulty;
    private Byte[] image;
    private Set<IngredientsCommand> ingredients = new HashSet<>();
    private Set<CategoryCommand> categories = new HashSet<>();
}
