package com.example.recipes.commands;

import com.example.recipes.domein.Recipe;
import com.example.recipes.domein.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientsCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasure;
}
