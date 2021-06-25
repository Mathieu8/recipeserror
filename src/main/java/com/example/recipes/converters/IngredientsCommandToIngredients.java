package com.example.recipes.converters;

import com.example.recipes.commands.IngredientsCommand;
import com.example.recipes.domein.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientsCommandToIngredients implements Converter<IngredientsCommand, Ingredient> {

    private final UnitOfMeasureCommandToUnitOfMeasure unitOfMeasureCommandToUnitOfMeasure;

    public IngredientsCommandToIngredients(UnitOfMeasureCommandToUnitOfMeasure unitOfMeasureCommandToUnitOfMeasure) {
        this.unitOfMeasureCommandToUnitOfMeasure = unitOfMeasureCommandToUnitOfMeasure;
    }

    @Synchronized
    @Nullable
    @Override
    public Ingredient convert(IngredientsCommand source) {
        if (source == null) {
            return null;
        }
        Ingredient ingredient = new Ingredient();
        ingredient.setId(source.getId());
        ingredient.setDescription(source.getDescription());
        ingredient.setAmount(source.getAmount());
        ingredient.setUnitOfMeasure(unitOfMeasureCommandToUnitOfMeasure.convert(source.getUnitOfMeasure()));
        return ingredient;
    }
}
