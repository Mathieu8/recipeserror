package com.example.recipes.domein;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    Category category;

    @Before
    public void setUp(){
        Category category = new Category();
    }


    void getId() {
        Long id = 41L;
        category.setId(id);

        assertEquals(id, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}