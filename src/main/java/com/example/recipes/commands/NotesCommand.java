package com.example.recipes.commands;

import com.example.recipes.domein.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;
    private RecipeCommand recipe;
}
