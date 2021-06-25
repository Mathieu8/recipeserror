package com.example.recipes.converters;

import com.example.recipes.commands.CategoryCommand;
import com.example.recipes.domein.Category;
import com.example.recipes.domein.UnitOfMeasure;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {


    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if(source==null){
            return null;
        }
        final Category category= new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}
