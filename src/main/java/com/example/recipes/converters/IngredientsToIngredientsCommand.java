package com.example.recipes.converters;

import com.example.recipes.commands.IngredientsCommand;
import com.example.recipes.domein.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientsToIngredientsCommand implements Converter<Ingredient, IngredientsCommand> {

    private final UnitOfMeasureToUnitOfMeasureCommand uomConverter;

    public IngredientsToIngredientsCommand(UnitOfMeasureToUnitOfMeasureCommand uomConverter) {
        this.uomConverter = uomConverter;
    }

    @Synchronized
    @Nullable
    @Override
    public IngredientsCommand convert(Ingredient ingredient) {
        if (ingredient == null) {
            return null;
        }

        IngredientsCommand ingredientCommand = new IngredientsCommand();
        ingredientCommand.setId(ingredient.getId());
        ingredientCommand.setAmount(ingredient.getAmount());
        ingredientCommand.setDescription(ingredient.getDescription());
        ingredientCommand.setUnitOfMeasure(uomConverter.convert(ingredient.getUnitOfMeasure()));
        return ingredientCommand;
    }
}