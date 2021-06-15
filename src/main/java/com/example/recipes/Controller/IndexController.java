package com.example.recipes.Controller;

import com.example.recipes.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Slf4j
@Controller
public class IndexController {

    final private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index","/index/"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
