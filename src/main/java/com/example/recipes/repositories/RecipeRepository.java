package com.example.recipes.repositories;

import com.example.recipes.domein.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
