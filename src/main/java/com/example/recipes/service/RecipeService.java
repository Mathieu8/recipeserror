package com.example.recipes.service;

import com.example.recipes.commands.RecipeCommand;
import com.example.recipes.domein.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface RecipeService {


Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
