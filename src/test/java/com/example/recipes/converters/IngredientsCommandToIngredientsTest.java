package com.example.recipes.converters;

import com.example.recipes.commands.CategoryCommand;
import com.example.recipes.domein.Category;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

//import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class IngredientsCommandToIngredientsTest {
    public static final Long ID_VALUE = Long.valueOf(1L);
    public static final String DESCRIPTION = "description";
    CategoryCommandToCategory conveter;

    @BeforeEach
    public void setUp() throws Exception {
        conveter = new CategoryCommandToCategory();
    }

    @Test
    public void testNullObject() throws Exception {
        assertNull(conveter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(conveter.convert(new CategoryCommand()));
    }

    @Test
    public void convert() throws Exception {
        //given
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(ID_VALUE);
        categoryCommand.setDescription(DESCRIPTION);

        //when
        Category category = conveter.convert(categoryCommand);

        //then
        assertEquals(ID_VALUE, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());
    }

}